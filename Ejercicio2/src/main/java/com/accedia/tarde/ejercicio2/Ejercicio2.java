/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           ====== Forma tu cuadrado en pantalla ======
                           Informe un numero(sera los lados del cuadrado):
                           """);
        int lado = 0;
        while (lado <= 0) {
            System.out.println("Valor tiene que ser positivo y mayor que 0");
            lado = sc.nextInt();
        }

        System.out.printf("Tu Cuadrado de %d x %d\n", lado, lado);
        for (int i = 0; i < lado; i++) {
            for (int l = 0; l < lado; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
