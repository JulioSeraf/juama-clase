/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.ejerciciosclass;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class EjerciciosClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo retangulo = new Rectangulo(23, 45);
        System.out.println("""
                           =================================== Retangulo ===============================
                           informe la base y altura:
                           Base:
                           """);
        retangulo.base = sc.nextDouble();
        System.out.println("Altura: ");
        retangulo.altura = sc.nextDouble();
        sc.nextLine();
        retangulo.mostrarInformacion();
        System.out.println("Comparar si Rectangulo es Mayor?\n Si \n No");
        String res = sc.nextLine();
        if (res.equalsIgnoreCase("si")) {
            System.out.println("Informes la Base del segundo rectangulo");
            double base = sc.nextDouble();
            System.out.println("Informe la altura del segundo rectangulo");
            double altura = sc.nextDouble();

            if (retangulo.tieneMayorAreaQue(base, altura)) {
                System.out.println("Rectangulo es Mayor que el primero");
            } else {
                System.out.println("Rectangulo es Menor que el Primero");
            }
        }
        System.out.print("""
                           ==============================  Cuenta Bancaria ===========================
                           informe Nombre completo del Titular:
                           Nombre: 
                         """);
        String nombre = sc.nextLine();
        System.out.println("Apellido:");
        String apellido = sc.nextLine();
        var cuenta1 = new CuentaBancaria(nombre, apellido);
        var cuenta2 = new CuentaBancaria("Luana", "Mendez");
        System.out.printf("""
                           ===================== Cuenta  =========================
                           Ben-venido, %s %s!!
                           Operación: 
                           1-> Depositar
                           2 -> Retir 
                           3 -> Transferir                         
                           4 -> Saldo
                           5 -> Salir
                           """, cuenta1.TITULAR_NOM, cuenta1.TITULAR_APEL);
        int userRes = sc.nextInt();
        switch (userRes) {
            case 1 -> {
                System.out.println("Insirar el valor a Depositar:");
                double deposito = sc.nextDouble();
                cuenta1.depositar(deposito);
            }
            case 2 -> {
                System.out.println("Informe el valor para Retiro:");
                double retirar = sc.nextDouble();
                cuenta1.retirar(retirar);
            }
            case 3 -> {
                System.out.println("Informe el valor a Transfirir:");
                double valorTransfirir = sc.nextDouble();
                cuenta1.trasfirirA(cuenta2, valorTransfirir);
            }
            case 4 ->
                cuenta1.mostrar();

        }

        var temp = new Temperatura(20);
        System.out.printf("""
                           ========================= Temperatura =====================
                           Temperatura actual %.1fºC
                           """, temp.num);

        System.out.println("""
                           Cambiar temperatura
                           1 -> Fahrenheit
                           2 -> kelvin
                           3 -> celsius
                           4 -> subir 
                           5 -> bajar
                           """);
        int temRes = sc.nextInt();
        switch (temRes) {
            case 1 ->
                System.out.printf("temperatura %.1fºF", temp.aFahrenheit());
            case 2 ->
                System.out.printf("temperatura %.1fºK", temp.aKevin());
            case 3 ->
                System.out.printf("temperatura %.1fºC", temp.aCelsius());
            case 4 ->
                System.out.printf("temperatura %.1f", temp.aCelsius());
            case 5 ->
                System.out.printf("temperatura %.1f", temp.aCelsius());
        }

        System.out.println("\n============================= Alumno ===========================");
        var aluno1 = new Aluno("julio", 4, 8, 10);
        var aluno2 = new Aluno("Luana", 6, 4, 10);
        var aluno3 = new Aluno("Maria", 10, 6, 10);
        aluno1.mostrar();
        aluno2.mostrar();
        aluno3.mostrar();
        
        System.out.println("Comparando alunos");
        aluno1.compararCon(aluno2.NOMBRE, aluno2.media());
    }
}
