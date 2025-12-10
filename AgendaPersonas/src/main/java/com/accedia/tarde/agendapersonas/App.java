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
        int listaTamaño = 50;
        String userNombre;
        String userTelefono;
        int userEdad = 0;
        String userEmail = "sin Infomación"; 
        
        System.out.printf("""
                           ====================== Agenda Personal ========================
                           Mostrar Agenda     -> 1
                           Adicionar Contacto -> 2
                           Editar Contacto    -> 3
                           Buscar Contacto    -> 4
                           Mostrar Agenda     -> 5
                           Salir              -> 6

                           tamaño de Agenda: %d (para Editar tamaño -> 0);
                           """,listaTamaño);
        int userSelect = sc.nextInt();
        sc.nextLine();
        if(userSelect == 0){
            System.out.println("""
                                   ===============================================================
                                   SI EDITAS TAMAÑO DE AGENDA LOS DATOS GUARDADOS SE PERDERAM !!!!
                                   ===============================================================
                                   Editar -> si/no
                                   """);
               String editar = sc.nextLine();
                if(editar.equalsIgnoreCase("si")){
                    System.out.println("""
                                       ===================
                                       ¡datos borrados!
                                       ===================
                                       informe tamaño:
                                       """);
                    do{
                        if(listaTamaño <= 0) System.out.println("tamaño invalido !!");
                        listaTamaño = sc.nextInt();
                    }while(listaTamaño <= 0);
                    
                                        
                }
            }
        
        var lista = new ListaPersonas(listaTamaño);
        switch (userSelect) {
            case 1 ->
                lista.mostrar();
            case 2 -> {
                System.out.println("""
                                   ================ Informe Datos: ===============
                                   Nombre:
                                   """);
                userNombre = sc.nextLine();
                System.out.println("Telefono: ");
                do{
                 userTelefono = sc.nextLine();
                 if(!userTelefono.matches("\\d+")) System.out.println("Telefono Invalido!!");
                }while(!userTelefono.matches("\\d+"));
                System.out.println("""
                                   Adicionar mas información ?
                                   Si/No
                                   """);
                String masInfo = sc.nextLine();
                if (masInfo.trim().equalsIgnoreCase("si")) {
                    System.out.println("""
                                       =============== info extra =================
                                       Edad: 
                                       """);
                    boolean edadCorreta = true;
                    do {
                        if (!edadCorreta) {
                            System.out.println("Edad Invalida !!!");
                        }
                        userEdad = sc.nextInt();
                        edadCorreta = false;
                    } while (userEdad <= 0);
                    
                    System.out.println("Email: ");
                    userEmail = sc.nextLine();
                    if (userEmail.trim().equals("")) {
                        userEmail = "sin Información";
                    } else if (!userEmail.contains("@")) {
                        System.out.println("Email invalido!!");
                        userEmail = "sin Información";
                    }

                }
                lista.anadir(new Persona(userNombre,userTelefono,userEmail,userEdad));

            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 ->
                System.out.println("Ok, Bye!!!");
            default -> {
            }
        }

    }
}
