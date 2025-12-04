/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.pratica1;

/**
 *
 * @author tarde
 */
public class Pelicula {
    private String titulo;
    private double duracion;
    public Pelicula(String titulo, double duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public void mostrar(){
        System.out.printf("Titulo: %s - %.2f min\n",this.titulo, this.duracion);
    }
    public boolean esLarga(){
        return this.duracion > 120;
    }
}
