/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.parenones;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class NumeroCurioso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Numero Curiosso");
        System.out.println("insira tu numero: ");
        int num = sc.nextInt();
        
        String parImpar = num % 2 == 0 ? " PAR" : " IMPAR";
        
        String multiplo = num % 5 == 0 ? "SI":"NO";
        String terminaEm = "";
        String numCar = String.valueOf(num);
        
        if(numCar.charAt(numCar.length()-1) == '7'){
           terminaEm = "Termina en 7";
        }else if(numCar.charAt(0) == '5'){
            terminaEm = "Termina en 5";
        }else{
            terminaEm = "Termina en "+ numCar.charAt(numCar.length()-1);
        }
          
        if(numCar.charAt(numCar.length()-1) == numCar.charAt(0)){
            terminaEm += "\nprimer y ultimo numero son iguales";
        }else{
            terminaEm += "\nprimer y ultimo numero No son iguales";
        }
          
        System.out.printf(
                           """
                           El numero es:%s,
                           El numero %s es Multiplo de 5,
                           %s
                           """,parImpar,multiplo,terminaEm);
    }
}
