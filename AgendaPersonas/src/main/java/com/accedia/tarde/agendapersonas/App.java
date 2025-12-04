/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.agendapersonas;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var lista = new ListaPersonas(50);
        System.out.println("""
                           ====================== Agenda Personal ========================
                           Mostrar Agenda     -> 1
                           Adicionar Contacto -> 2
                           Editar Contacto    -> 3
                           Buscar Contacto    -> 4
                           Mostrar Agenda     -> 5
                           Salir              -> 6
                           """);
        int userSelect = sc.nextInt();
        switch (userSelect) {
            case 1 -> lista.mostrar();
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> System.out.println("Ok, Bye!!!");
            default -> {
            }
        }

    }
}
