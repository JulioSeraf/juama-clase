/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.tiposbasicos.entero;

/**
 *
 * @author tarde
 */
public class Enteros {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int varEntera;
        varEntera = 4;
        int suma = 0;
        int res;
        int v1 = 0;
        int v2 = 0;
        //IMPRIMIR VALORES
        v1 = 4;
        v2 = 7;

        System.out.println(varEntera);
        System.out.println("El primer numero es: " + v1);
        System.out.println("El segundo numero es: " + v2);

        //Operadores aritmeticos
        //SUMA, RESTA, MUTIPLICACION Y DIVISION 
        res = v1 + v2;
        System.out.println("La Soma es " + res);

        res = v1 - v2;
        System.out.println("La Resta es " + res);

        res = v1 * v2;
        System.out.println("La Mutiplicación es " + res);

        res = v1 / v2;
        System.out.println("La Division es " + res);
        
        // Modulo
        res = v1 % v2;
        
        System.out.println(" El módulo es: " + res);

        
        
        for(int i = 1; i <= 10; i++){
            suma++;
            System.out.println("julio " + suma);
        }
    }}