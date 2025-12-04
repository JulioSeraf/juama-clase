/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.ejercicio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira la cantidad de Numeros:");
        int cant = sc.nextInt();
        int[] userNum = new int[cant];
        int negativos =0;
        int positivos = 0;
        int total= 0;
        double media = 0;
        System.out.println();
        for(int i  = 0; i< userNum.length; i++){
            userNum[i] = new Random().nextInt(-99, 99);
        }
        for(int n: userNum){
            if(n<0)negativos++;
            if(n>0)positivos++;
            total += n;
        }
        media = total/userNum.length;
        System.out.printf("""
                          ======= Numeros Aleatorios ========
                          numeros: %s
                          Positivos: %d
                          Negativos: %d
                          Media: %.1f 
                           """,Arrays.toString(userNum),positivos,negativos,media);
    }
}
