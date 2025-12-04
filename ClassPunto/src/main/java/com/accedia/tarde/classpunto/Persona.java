package com.accedia.tarde.classpunto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }   
    
    public void saludar(){
        System.out.printf("HOLA!. Soy %s y tengo %d",this.nombre,this.edad);
    }
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    public void cumplirAnios(){
        this.edad++;
    }
    public void mostrar(){
        System.out.printf("""
                          nombre: %s
                          edad: %d
                          """,this.nombre,this.edad);
    }
}
