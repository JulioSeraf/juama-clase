/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.pruebamensajes;

import java.util.ArrayList;
import java.util.Scanner;
import pruebamensajes.clases.Email;
import pruebamensajes.clases.Mensaje;
import pruebamensajes.clases.Postlt;
import pruebamensajes.clases.WhatsApp;

/**
 *
 * @author tarde
 */
public class App {

    public static ArrayList<Mensaje> msg = new ArrayList<>();

    public static void anadirMensaje(Mensaje m) {
        msg.add(m);
    }

    public static void enviarMensaje() {
        msg.forEach(m -> {
            switch (m) {
                case WhatsApp w -> {
                    if (!w.validadDestinatario()) {
                        throw new IllegalArgumentException(String.format("Destinatario %s no encontrado", w.getDestinatario()));
                    }
                    w.isEnviado(true);
                    anadirMensaje(w);
                }
                case Email e -> {
                    if (!e.validadDestinatario()) {
                        throw new IllegalArgumentException(String.format("Destinatario %s no encontrado", e.getDestinatario()));
                    }
                    e.isEnviado(true);
                    anadirMensaje(e);
                }
                default ->
                    throw new NullPointerException("");
            }
        });

    }

    private static void crearMail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el email del destinatario");
        String destinatario = sc.nextLine();
        System.out.println("Introduce el asunto del email");
        String asunto = sc.nextLine();
        System.out.println("Introduce el contenido del email");
        String contenido = sc.nextLine();
        anadirMensaje(new Email(contenido, asunto, destinatario));
    }

    private static void crearWhatsApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el teléfono de destino");
        String destinatario = sc.nextLine();
        System.out.println("Introduce el contenido del whatsApp");
        String contenido = sc.nextLine();
        anadirMensaje(new WhatsApp(contenido, destinatario));
    }

    private static void crearPosIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué quieres poner en el posIt");
        String contenido = sc.nextLine();
        anadirMensaje(new Postlt(contenido));
    }

    public static void mostrarMensaje() {
        
        String enviado = "no enviado"; 
        for (Mensaje m : msg) {
            if(m.isEnviado()) enviado = "Enviado";
            System.out.println(m);
            System.out.println(enviado);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean msgOn = false;
        System.out.println("¿Desea crear un mensaje? S/N");
        while (sc.next().toUpperCase().equals("S")) {
            System.out.printf("""
                               ¿Que desea Crear?
                               1 -> Email
                               2 -> WhatsApp
                               3 -> PosIt
                               %s
                               """, msgOn ? "4 -> Mostrar Mensajes:" : "");
            String tipo = sc.next();
            switch (tipo) {
                case "1" ->
                    crearMail();
                case "2" ->
                    crearWhatsApp();
                case "3" ->
                    crearPosIt();
                case "4" ->
                    mostrarMensaje();
                default ->
                    System.out.println("Elija una opción válida");
            }
            msgOn = true;
            System.out.println("¿Desea enviar un nuevo mensaje?S/N");

        }
    }
}
