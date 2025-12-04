/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.entero;

import java.util.Scanner;


/**
 *
 * @author tarde
 */
public class AreaRetangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introdusca el lado Y:\n> ");
        int y = Integer.parseInt(scan.nextLine().trim());
        System.out.print("Introdusca el lado X:\n> ");
        int x = Integer.parseInt(scan.nextLine().trim());
        
        scan.close();
        
        System.out.printf("El area del retangulo es: %d", x * y);
    }
}
