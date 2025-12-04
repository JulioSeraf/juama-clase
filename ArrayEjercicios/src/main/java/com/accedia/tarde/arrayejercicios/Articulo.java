/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.arrayejercicios;

/**
 *
 * @author tarde
 */
public class Articulo {
    String nombre;
    int cantidad;
    double precio;
    public Articulo(String nombre, int cantidad, double precio){
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrar(){
        System.out.printf("""
                           Nombre: %s
                           Cantidad: %s
                           precio: %.2f
                           """,this.nombre,this.cantidad,this.precio);
    }
}
