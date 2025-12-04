/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.pratica2;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Pratica2 {

    public static void main(String[] args) {
        int n =0;
        Scanner sc = new Scanner(System.in);
        int con = 0;
        while(n <= 0){
            if(con !=0){
             System.out.println("Valor tiene que ser positivo!!!");
             con = 0;
            }
             System.out.println("Insira un valor:");
             n = sc.nextInt();
             con++;
        }
       
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }
        int suma = 0;
        for(int nu : nums){
            if(nu % 2 == 0){
                suma += nu;
            }}
        System.out.printf("La suma de los numeros pares del 0 hasta el %d es %d",n,suma);
    }
}
