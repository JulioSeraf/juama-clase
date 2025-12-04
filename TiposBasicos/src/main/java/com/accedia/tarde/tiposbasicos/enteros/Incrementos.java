/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.tiposbasicos.enteros;

/**
 *
 * @author Juanma
 */
public class Incrementos {
    public static void main(String[] args) {
        int num1;
        int num2;
              
        // =====> INCREMENTOS (ya hacen la asignacion!!!!!!)
        System.out.println("\n\n====> EJEMPLO INC PREFIJO Y POSFIJO");
        num1 = 3;
        
        // incremento posfijo
        num1++;
        num1++;
        num1++;
        
        // incremento prefijo
        ++num1;
        ++num1;
        ++num1;
        
        // Dara 9
        System.out.println("El numero 1 es: " + num1);
      
        
        // =====> EJEMPLO DE USO INCREMENTO PREFIJO
        System.out.println("\n\n====> EJEMPLO INC PREFIJO");
        num1 = 3;
        num2 = 0;
        
        num2 = (++num1) + 1;
        
        System.out.println("El numero 1 es: " + num1); // dara 4
        System.out.println("El numero 2 es: " + num2); // dara 5
        
        // es lo mismo que...
        System.out.println("\n\n====> EJEMPLO INC PREFIJO -- repeticion");
        num1 = 3;
        num2 = 0;
        
        num1 = num1 + 1;
        num2 = num1 + 1;
        
        System.out.println("El numero 1 es: " + num1); // dara 4
        System.out.println("El numero 2 es: " + num2); // dara 5
        
        // =====> EJEMPLO DE USO INCREMENTO POSTFIJO
        System.out.println("\n\n====> EJEMPLO INC POSTFIJO");
        num1 = 3;
        num2 = 0;
        
        num2 = (num1++) + 1;
        
        System.out.println("El numero 1 es: " + num1); // Dara 4
        System.out.println("El numero 2 es: " + num2); // Dara 4
        
        
        // es lo mismo que...
        System.out.println("\n\n====> EJEMPLO INC POSTFIJO -- repeticion");
        num1 = 3;
        num2 = 0;
        
        num2 = num1 + 1;
        num1 = num1 + 1;
        
        System.out.println("El numero 1 es: " + num1); // dara 4
        System.out.println("El numero 2 es: " + num2); // dara 5
    }
}