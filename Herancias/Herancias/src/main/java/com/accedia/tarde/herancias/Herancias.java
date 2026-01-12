/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.herancias;

/**
 *
 * @author tarde
 */
public class Herancias {

    public static void main(String[] args) {
        System.out.println("==================== Ejercicio 1,2,3 ===========================");
        Persona julio = new Alumno("julio", 28, "DAW");
        
        julio.presentarse();
        ((Alumno)julio).estudiar();
        System.out.println("====================== Ejercicio 4,5 ==========================");
        Animal rex = new Perro();
        rex.hacerSonido();
        Animal peluche = new Gato();
        peluche.hacerSonido();
        Animal perroGato = new Perro();
        perroGato.hacerSonido();
        perroGato = new Gato();
        perroGato.hacerSonido();
        System.out.println("===================== Ejercicio 6, 8 ============================");
        Circulo bola = new Circulo("blue",50);
        System.out.println(bola.calcularArea());
        bola.mostrarColor();
        
        Rectangulo caja = new Rectangulo("red", 3, 60);
        System.out.println(caja.calcularArea());
        caja.mostrarColor();
        
                
        System.out.println("========================= Ejercicio 7 ===========================");
        System.out.println("""
                           Una clase abstrata no puede ser instanciada pq puede contener metodos abstratos que no tiene cuerpo,
                           por lo tanto no puede criar un objeto completo, serve como plano para otras clase no para criar objetos""");
        
        System.out.println("========================== Ejercicio 9============================");
        Avion f14 = new Avion();
        f14.volar();
        Pajaro arara = new Pajaro();
        arara.volar();
        
        System.out.println("========================= Ejercicio 10 ==============================");
        
        Pato kautoniudo = new Pato();
        kautoniudo.camina();
        kautoniudo.hacerSonido();
        kautoniudo.nada();
        kautoniudo.volar();
        
        System.out.println("=========================== Ejercico 11 =============================");
        Volador v = new Pajaro();
        v.volar();
                
    }
}
