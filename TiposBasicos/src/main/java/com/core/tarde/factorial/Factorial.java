/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.core.tarde.factorial;

import java.util.Scanner;

/**
 * Esta clase nos 
 *
 * @author julio
 */
public class Factorial {

    public static void main(String[] args) {
        //creamos un scanner para pedir un numero por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int numero = sc.nextInt();
        sc.close();
        int total = 1;
        while(numero > 1){
            total = total * numero;
            numero = numero -1;
        }
        //Imprimimos el numero
        System.out.println(total);
    }
}
