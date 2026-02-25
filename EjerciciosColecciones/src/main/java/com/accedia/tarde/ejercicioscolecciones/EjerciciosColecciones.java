/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.ejercicioscolecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class EjerciciosColecciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("""
                           Seleciona Ejercicio: 
                           Suma,media,mínino y máximo  -> 1
                           Filtrado por longitud       -> 2
                           Copia manual de una lista   -> 3
                           """);
            int resEjercicio = sc.nextInt();
            switch (resEjercicio) {
                case 1 -> {
                    SumaMediaMininoMaximo nums = new SumaMediaMininoMaximo();
                    System.out.println("Informe la cantidad a almacenar:");
                    int res = sc.nextInt();
                    int numIndetificador = 1;
                    while (res > 0) {
                        System.out.printf("%dºn: ", numIndetificador++);
                        nums.adicionarNum(sc.nextInt());
                        sc.nextLine();
                        res--;
                    }
                    System.out.println("Numeros Adicionados!");
                    int resMostrar;
                    do {
                        System.out.println("""
                                       ==================== Mostrar ======================
                                       Sumar        -> 1
                                       Media        -> 2
                                       Valor mínimo -> 3
                                       Valor maxímo -> 4
                                       Exit         -> 5
                                       """);
                        resMostrar = sc.nextInt();
                        switch (resMostrar) {
                            case 1 -> {
                                System.out.printf("\nSuma Total: %d", nums.suma());
                            }
                            case 2 -> {
                                System.out.printf("\nMedia: %.1f", nums.media());
                            }
                            case 3 -> {
                                System.out.printf("\nMenor Numero: %d", nums.minino());
                            }
                            case 4 -> {
                                System.out.printf("\nMayor Numero: %d\n", nums.maximo());
                            }
                            case 5 ->
                                exit = false;
                            default ->
                                throw new IllegalArgumentException("Opción invalid!");
                        }
                    }while(resMostrar != 5);
                }
                case 2 -> {
                }
                default -> {
                    System.out.println("Opción invalida!");
                }
            }
        }
    }
}
