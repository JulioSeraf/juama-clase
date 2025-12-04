/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.classpunto;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class ClassPunto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones numPrimo = new Operaciones();

        Punto p = new Punto();

        p.x = 3;
        p.y = 5;

        p.imprimir();
        System.out.println("""
                          ================ Numero Primos ================
                           Insira el valor:
                           """);
        int userValor = sc.nextInt();
        System.out.println(numPrimo.isPrimo(userValor));
        if (numPrimo.isPrimo(userValor)) {
            System.out.printf("El numero %d ES Primo!!", userValor);
        } else {
            System.out.printf("El numero %d N0 es Primo!!", userValor);

        }

        System.out.println("""
                           =================================== Persona ===============================
                           """);
        var persona1 = new Persona("julio", 28);
        var persona2 = new Persona("Luana", 23);
        
        persona2.cumplirAnios();
                
        persona1.mostrar(); 
         if (persona1.esMayorDeEdad()) {
            System.out.printf("%s Es mayor de Edad\n",persona1.nombre);
        }else{
            System.out.printf("%s Es menor de Edad\n",persona1.nombre);
        }
         
        persona2.mostrar();
         if (persona2.esMayorDeEdad()) {
            System.out.printf("%s Es mayor de Edad\n",persona2.nombre);
        }else{
            System.out.printf("%s Es menor de Edad\n",persona2.nombre);
        }

    }
}
