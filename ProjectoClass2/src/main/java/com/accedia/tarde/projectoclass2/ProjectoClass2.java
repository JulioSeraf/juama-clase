/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.projectoclass2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class ProjectoClass2 {

    public String diaSemana(int dia, int mes, int ano) {
        int numSemana;
        String isDia = "";
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("El valor inserido es invalido!");

        } else {
            if (mes == 1) {
                mes = 13;
                ano--;
            }
            if (mes == 2) {
                mes = 14;
                ano--;
            }
            String stringYear = "" + ano;
            int fistNumYear = Integer.parseInt(stringYear.substring(0, 2));
            int endNumYear = Integer.parseInt(stringYear.substring(2, 4));
            // Formula Zeller
            numSemana = (int) (dia + Math.floor(26 * (mes + 1) / 10) + endNumYear + Math.floor(endNumYear / 4) + Math.floor(fistNumYear / 4) - 2 * fistNumYear) % 7;
            switch (numSemana) {
                case 6 ->
                    isDia = "Vienes";
                case 5 ->
                    isDia = "Jueves";
                case 4 ->
                    isDia = "Miercules";
                case 3 ->
                    isDia = "Martes";
                case 2 ->
                    isDia = "Lunes";
                case 1 ->
                    isDia = "Domingo";
                case 0 ->
                    isDia = "Sabado";
            }
        }
        return isDia;
    }
    public void simuladorDados(Scanner sc) {
        int ladoDado = 0;
        int tirar = 1;
        int lado6 =0;
        int tentativas = 0;

        while (tirar == 1) {
            System.out.println("""
                               Tirar -> 1
                               Salir -> 0
                               """);
            tirar = sc.nextInt();
            ladoDado = (int) (Math.random() * 6) + 1;
            System.out.println("Lado:" + ladoDado);
            tentativas++;
            if(ladoDado == 6) lado6++;
        }
        double media = (tentativas+lado6)/2;
        System.out.printf("""
                           Tentativas: %d
                           Acertos: %d
                           Media: %.1f
                           """, tentativas, lado6, media);
    }
    public void secuenciaCollatz(int num){
        var sequecia = new ArrayList<Integer>();
        while(num > 1){
            if(num%2 == 0){
                num /= 2; 
                sequecia.add(num);
            }else if(num%2 != 0){
                num = (num * 3) + 1;
                sequecia.add(num);
            }
        } 
        int con=0; 
        System.out.println("Sequencia:");
        for(int i = 0; i < sequecia.size();i++){
            System.out.println(++con +": "+ sequecia.get(i));
        }
    }
    public void conversorNumRomanos(String num){
      var numArray = num.trim().split("");
        
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var metodos = new ProjectoClass2();
        System.out.println("================ DIA DE LA SEMANA ==================");
        System.out.println("DIA:");
        int dia = sc.nextInt();
        System.out.println("MES:");
        int mes = sc.nextInt();
        System.out.println("ANO:");
        int ano = sc.nextInt();
        System.out.printf("""
                          El dia %d/%d/%d es : %s
                          """,dia, mes, ano, metodos.diaSemana(dia, mes, ano));
        System.out.println("================ TIRADOR DE DADO  ==================");
        metodos.simuladorDados(sc);
        System.out.println("================ Secuencia de Collatz  ==================");
        System.out.println("Insira un valor:");
        int numCollatz = sc.nextInt();
        metodos.secuenciaCollatz(numCollatz);
    }
}
