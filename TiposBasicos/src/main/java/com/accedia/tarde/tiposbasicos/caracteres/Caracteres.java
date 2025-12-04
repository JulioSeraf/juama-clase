/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.caracteres;

/**
 *
 * @author Tarde Juanma
 */
public class Caracteres {

    public static void main(String[] args) throws Exception {
        /*
            Un literal caracter se representa con comillas simples
            
            El tipo de dato se llama "char", ocupa 2 bytes e
                internamente se almacena como un numero entero sin
                signo.
        
            Un char puede ir desde 0 hasta 65_535.
         */

        // VARS
        char c1, c2, c3, c4;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;

        // Imprimir un char
        System.out.println("\n=====> 1. Imprimo un char");
        c1 = 'A';
        System.out.println(c1);

        // Un char es un numero, asi que Java hace casting implicito de
        //      char a int
        System.out.println("\n=====> 2. Imprimo un char como entero");
        c1 = 'X';
        n1 = c1;  // casting implicito => n1 será el código numérico de la 'X'
        System.out.println(n1);

        // Se puede hacer un casting explicito
        System.out.println("\n=====> 3. Imprimo un char como entero a traves de un casting explicito.");
        c1 = 'Y';
        System.out.println((int) c1);

        // La conversion al reves (de numero a char) necesita un casting explicito
        // Para escribir numeros binarios en java se pone 0b delante        
        // Para escribir numeros octales en java se pone 0 delante
        // Para escribir numeros hexadecimales en java se pone 0x delante
        // la letra @ es 64 (100 en octal, 40 en hexadecimal, 01000000 en binario)
        System.out.println("\n=====> 3. Paso de int a char e imprimo.");
        n1 = 0b01000000; //binario
        n2 = 0100;       //octal
        n3 = 0x40;       //hexadecimal
        n4 = 64;         //decimal

        c1 = (char) n1;
        c2 = (char) n2;
        c3 = (char) n3;
        c4 = (char) n4;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //Como los char son numeros, podemos hacer operaciones con ellos
        c1 = 'A';
        c2 = 'Z';
        
        for( char c = 'A'; c<= 'Z'; c++){
            System.out.println(c);
                    
        }
    }
}
