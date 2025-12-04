/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.tiposbasicos.booleanos;

/**
 *
 * @author Tarde Juanma
 */
public class Booleanos {
    public static void main (String[] args) throws Exception {
        // VARS
        boolean bt = true;
        boolean bf = false;
 
        int n1;
        int n2;
        
        
        // ======== COMPARADOR ========
        System.out.println("\n====> 1.- Comparaciones");
        n1 = 5;
        n2 = 10;
        
        /*
        // Lo de abajo es igual que esto
        System.out.println("¿ "+ n1 +" es mayor que "+ n2 +"?: "+ b1 +".");
        */
        System.out.printf("¿ %d es mayor que %d ?: %b.\n", n1, n2, (n1>n2));
        System.out.printf("¿ %d es menor que %d ?: %b.\n", n1, n2, (n1<n2));
        System.out.printf("¿ %d es igual que %d ?: %b.\n", n1, n2, (n1==n2));
        
        System.out.println("");
        
        System.out.printf("¿ %03d    es mayor o igual que %03d ?: %5b.\n", n1, n2, (n1>=n2));
        System.out.printf("¿ %03d    es menor o igual que %03d ?: %5b.\n", n1, n2, (n1<=n2));
        System.out.printf("¿ %03d no es         igual que %03d ?: %5b.\n", n1, n2, (n1 != n2));
        
        
        // ======== OPERADORES ========
        System.out.println("\n====> 2.- Operador Y (&&)");
        System.out.printf("%5b && %5b = %5b.\n",bt,bt,(bt && bt));
        System.out.printf("%5b && %5b = %5b.\n",bt,bf,(bt && bf));
        System.out.printf("%5b && %5b = %5b.\n",bf,bt,(bf && bt));
        System.out.printf("%5b && %5b = %5b.\n",bf,bf,(bf && bf));
        
        System.out.println("\n====> 3.- Operador O (||)");
        System.out.printf("%5b || %5b = %5b.\n",bt,bt,(bt || bt));
        System.out.printf("%5b || %5b = %5b.\n",bt,bf,(bt || bf));
        System.out.printf("%5b || %5b = %5b.\n",bf,bt,(bf || bt));
        System.out.printf("%5b || %5b = %5b.\n",bf,bf,(bf || bf));
        
        System.out.println("\n====> 4.- Operador XOR - \"o exclusiva\" (^)");
        System.out.printf("%5b ^ %5b = %5b.\n",bt,bt,(bt ^ bt));
        System.out.printf("%5b ^ %5b = %5b.\n",bt,bf,(bt ^ bf));
        System.out.printf("%5b ^ %5b = %5b.\n",bf,bt,(bf ^ bt));
        System.out.printf("%5b ^ %5b = %5b.\n",bf,bf,(bf ^ bf));
        
        System.out.println("\n====> 5.- Operador NO - (!)");
        System.out.printf("! %5b = %5b.\n",bt,(!bt));
        System.out.printf("! %5b = %5b.\n",bf,(!bf));
      
                
    }
}