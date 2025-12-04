/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           ============= LIBRO DE TAREAS ==============
                           Informe la Cantidad:
                           """);
        int cant = sc.nextInt();
        sc.nextLine();
        String[] tareas = new String[cant];
        System.out.printf("Informe las %d tareas:", cant);
        for (int i = 0; i < tareas.length; i++) {
            System.out.println("Tarea");
            tareas[i] = sc.nextLine();
        }
        
        System.out.println("Informe un texto pra buscar em la tareas");
        String text  = sc.nextLine();
        System.out.printf("""
                           Palavra Clave
                           %s
                           """,text);
        
        int cantT =0; 
        System.out.println("Tareas encontradas:");
        for(int i = 0; i< tareas.length; i++){
            if(tareas[i].toLowerCase().contains(text.toLowerCase())){
                cantT++;
                System.out.println(tareas[i]);
            }
        }
        System.out.printf("""
                           Numero de tareas encontradas:
                           %d
                           """,cantT);
        
    }
}
