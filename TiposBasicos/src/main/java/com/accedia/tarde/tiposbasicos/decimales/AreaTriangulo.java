/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.decimales;
import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class AreaTriangulo {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe la Base del Triangulo:\n >");
        double ladoB =  Double.parseDouble(scan.nextLine().trim().replace(",", "."));
        
        System.out.println("Informe la Altura del Triangulo:\n >");
        double ladoA = Double.parseDouble(scan.nextLine().trim().replace(",", "."));
        
        double area;
        
        area = (ladoA*ladoB)/2;
        
        scan.close();
        
        System.out.printf("La Area del Triangulo es: %.1f",area);
    }
}
