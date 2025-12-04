/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.arrayejercicios;

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
    public void mostrar(){
        System.out.printf("""
                          \n
                          Nombre: %s
                          edad: %d
                          \n
                          """,this.nombre,this.edad);
                
    }
}
