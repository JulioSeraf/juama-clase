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

    public static int isNumber(Scanner sc) {
        int userSelect = 0;
        boolean ok = false;
        do {
            String userResComp = sc.nextLine();
            try {
                userSelect = Integer.parseInt(userResComp);
                ok = true;
            } catch (NumberFormatException er) {
                System.out.println("Valor invalido !!!");
            }
        } while (!ok);
        return userSelect;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listaTamaño = 50;
        var lista = new ListaPersonas(listaTamaño);
        String userNombre;
        String userTelefono;
        int userEdad = 0;
        int userSelect = 0;
        String userEmail = "sin Infomación";

        do {
            System.out.printf("""
                           ====================== Agenda Personal ========================
                           Mostrar Agenda     -> 1
                           Adicionar Contacto -> 2
                           Editar Contacto    -> 3
                           Buscar Contacto    -> 4
                           Salir              -> 5

                           tamaño de Agenda: %d (para Editar tamaño -> 6);
                           """, listaTamaño);

            userSelect = isNumber(sc);

            if (userSelect == 6) {
                System.out.println("""
                                   ===============================================================
                                   SI EDITAS TAMAÑO DE AGENDA LOS DATOS GUARDADOS SE PERDERAM !!!!
                                   ===============================================================
                                   Editar -> si/no
                                   """);
                String editar = sc.nextLine();
                if (editar.equalsIgnoreCase("si")) {
                    System.out.println("""
                                       ===================
                                       ¡datos borrados!
                                       ===================
                                       informe tamaño:
                                       """);
                    do {
                        if (listaTamaño <= 0) {
                            System.out.println("tamaño invalido !!");
                        }
                        listaTamaño = sc.nextInt();
                    } while (listaTamaño <= 0);
                    lista = new ListaPersonas(listaTamaño);
                }
            }
            if (userSelect == 2) {
                System.out.print("""
                                   ================ Informe Datos: ===============
                                   Nombre:
                                   """);
                userNombre = sc.nextLine();
                System.out.println("Telefono: ");
                do {
                    userTelefono = sc.nextLine();
                    if (!userTelefono.matches("\\d+")) {
                        System.out.println("Telefono Invalido!!");
                    }
                } while (!userTelefono.matches("\\d+"));
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
                        userEdad = isNumber(sc);
                        edadCorreta = false;
                    } while (userEdad <= 0);

                    System.out.println("Email: ");

                    do {
                        userEmail = sc.nextLine();
                        if (!userEmail.contains("@") && !userEmail.trim().equals("")) {
                            System.out.println("formato de email Invalido !!");
                        }

                    } while (!userEmail.contains("@") && !userEmail.trim().equals(""));
                    if (userEmail.trim().equals("")) {
                        userEmail = "sin Información";
                    }

                }
                lista.anadir(new Persona(userNombre, userTelefono, userEmail, userEdad));
                System.out.println("""
                                                    ===================
                                                    Contacto adicionado
                                                    ===================
                                       """);
            }
            if (lista.vacio()) {
                switch (userSelect) {
                    case 1 -> {
                        System.out.println("===================== Lista de Contactos ======================");
                        lista.mostrar();
                    }
                    case 3 -> {
                        System.out.print("""
                                           ======================== Editar Contacto ========================
                                           Buscar Contacto:
                                           """);
                        String PerToFind = sc.nextLine();
                        Persona findPer = lista.buscar(PerToFind);
                        int useOption = 0;
                        do {
                            System.out.printf(
                                    """
                                           ========================= %s ===============================
                                          Editar Nombre   -> 1
                                          Editar Telefono -> 2
                                          Editar Edad     -> 3
                                          Editar Email    -> 4
                                          Salir           -> 5
                                           """, findPer.getNombre());
                            useOption = isNumber(sc);
                            switch (useOption) {
                                case 1 -> {
                                    System.out.println("Cambiar Nombre: ");
                                    String newName = sc.nextLine();
                                    findPer.setNombre(newName);
                                }
                                case 2 -> {
                                    System.out.println("Cambiar Telefono: ");
                                    String newTelefono = sc.nextLine();
                                    findPer.setTelefono(newTelefono);
                                }
                                case 3 -> {
                                    System.out.println("Cambiar Edad: ");
                                    String newEdad = sc.nextLine();
                                    findPer.setEdad(userEdad);
                                }
                                case 4 -> {
                                    System.out.println("Cambiar Email: ");
                                    String newEmail = sc.nextLine();
                                    findPer.setEmail(newEmail);
                                }
                                default -> {
                                    System.out.println("Valor Invalido !!!");
                                }
                            }
                        } while (useOption != 5);
                        
                        if (useOption >= 1 && useOption <= 4) {
                            System.out.println("""
                                               ==================
                                                Contacto Editado 
                                               ==================
                                               """);
                        }
                    }

                    case 4 -> {
                        System.out.println("""
                                        ================== Buscar Contacto ===================
                                       Informe Nombre:
                                       """);
                        String PerToFind = sc.nextLine();
                        lista.buscar(PerToFind);

                    }
                }
            }

        } while (userSelect != 5);
    }

}
