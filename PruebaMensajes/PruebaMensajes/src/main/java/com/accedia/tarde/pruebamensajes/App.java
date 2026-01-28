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

    public static void anadirMensaje(Mensaje msg) {
        App.msg.add(msg);
    }

    public static void enviarMensaje() {
        msg.forEach(m -> {
            switch (m) {
                case WhatsApp w ->
                    w.isEnviado(w.validadDestinatario());
                case Email e ->
                    e.isEnviado(e.validadDestinatario());
                default ->
                    throw new NullPointerException("");
            }
        });

    }

    private static void crearMail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el email del destinatario");
        String destinatario = sc.next();
        System.out.println("Introduce el asunto del email");
        String asunto = sc.next();
        System.out.println("Introduce el contenido del email");
        String contenido = sc.next();
        anadirMensaje(new Email(contenido, asunto, destinatario));
    }

    private static void crearWhatsApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el teléfono de destino");
        String destinatario = sc.next();
        System.out.println("Introduce el contenido del whatsApp");
        String contenido = sc.next();
        anadirMensaje(new WhatsApp(contenido, destinatario));
    }

    private static void crearPosIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué quieres poner en el posIt");
        String contenido = sc.next();
        anadirMensaje(new Postlt(contenido));
    }

    public static void mostrarMensaje() {
        for (Mensaje m : msg) {
            if (m instanceof Postlt) {
                continue;
            }
            System.out.println(m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea crear un mensaje? S/N");
        while (sc.next().toUpperCase().equals("S")) {
            System.out.println("""
                               ¿Que desea Crear?
                               1 -> Email
                               2 -> WhatsApp
                               3 -> PosIt
                               """);
            String tipo = sc.next();
            switch (tipo) {
                case "1" -> crearMail();
                case "2" -> crearWhatsApp();
                case "3" -> crearPosIt();
                default -> System.out.println("Elija una opción válida");
            }
            System.out.println("¿Desea enviar un nuevo mensaje?S/N");
              
        }
    }
}
