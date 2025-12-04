/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.decimales;

/**
 *
 * @author Tarde Juanma           
 */
public class Decimales {
    public static void main (String[] args) throws Exception {
        // ==========> VARS
        double dec1;
        double dec2;
        double res;
        
        float decf1;
        float decf2;
        float resf;
        
        int num1;
        int num2;
        
        // ==========> 1. SUMA
        System.out.println("\n=========> 1. SUMA");
        
        dec1 = 5.62;
        dec2 = 7.56;
        res = dec1 + dec2;
        
        System.out.println("D1: " + dec1);
        System.out.println("D2: " + dec2);
        System.out.println("SUMA: " + res); // Dara 13
        
        // ==========> 2.1 RESTA FLOAT
        System.out.println("\n=========> 2.1 RESTA FLOAT");
        
        decf1 = 5.62f; // Un literal float acaba en f
        decf2 = 7.56f; // Un literal float acaba en f
        resf = decf1 - decf2;
        
        System.out.println("F1: " + decf1);
        System.out.println("F2: " + decf2);
        System.out.println("RESTA: " + resf); // Dara -1.94
        
        // ==========> 2.2 RESTA DOUBLE
        System.out.println("\n=========> 2.2 RESTA DOUBLE");
        
        dec1 = 5.62;
        dec2 = 7.56;
        res = dec1 - dec2;
        
        System.out.println("D1: " + dec1);
        System.out.println("D2: " + dec2);
        System.out.println("RESTA: " + res); // Dara -1.94 (mas o menos)
        
        // ==========> 3. CASTING A FLOAT / DOUBLE
        System.out.println("\n=========> 3. CASTING FLOAT/DOUBLE");
        
        decf1 = 5.62f; // Un literal float acaba en f
        decf2 = 7.56f; // Un literal float acaba en f
        resf = decf1 - decf2;
        
        dec1 = 5.62;
        dec2 = 7.56;
        res = dec1 - dec2;
        
        System.out.println("Float: " + resf);
        System.out.println("Double: " + res);
        
        System.out.println("Float convertido a Double: " + (double)resf);
        System.out.println("Double convertido a Float: " + (float)res);
        
        // ==========> 4. MULTIPLICACION
        System.out.println("\n=========> 4 MULTIPLICACION");
        
        dec1 = 5.62;
        dec2 = 7.56;
        res = dec1 * dec2;
        
        System.out.println("D1: " + dec1);
        System.out.println("D2: " + dec2);
        System.out.println("MULTIPLICACION: " + res);
        
        
        // ==========> 5. DIVISION
        System.out.println("\n=========> 5. DIVISION");
        
        dec1 = 7.56;
        dec2 = 5.62;
        res = dec1 / dec2;
        
        System.out.println("D1: " + dec1);
        System.out.println("D2: " + dec2);
        System.out.println("DIVISION: " + res);
        
        // ==========> 6. MODULO
        System.out.println("\n=========> 6. MODULO");
        
        dec1 = 6.74;
        dec2 = 3.8;
        res = dec1 % dec2;
        
        
//            EL MODULO ENTRE DECIMALES ES:
//                D - ( d * ((int)(D/d)) )
//            CON:
//                D: dividendo
//                d: divisor
//                D/d : resultado de la division decimal
//                ((int) D/d): parte entera de la division decimal
        
        System.out.println("D1: " + dec1);
        System.out.println("D2: " + dec2);
        System.out.println("MODULO: " + res);

        // ==========> 7. OPERACIONES CON ENTEROS Y DECIMALES
        System.out.println("\n=========> 7. OPERACIONES MEZCLANDO ENTEROS Y DECIMALES");
        System.out.println("---- EJEMPLO: multiplicar");
        
        num1 = 3;
        dec2 = 4.5;
        
        res = num1 * dec2;
        
        System.out.println("N1: " + num1);
        System.out.println("D2: " + dec2);
        System.out.println("MULTIPLICACION: " + res);
    }
}