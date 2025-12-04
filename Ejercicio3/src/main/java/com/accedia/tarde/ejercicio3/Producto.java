/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejercicio3;

/**
 *
 * @author tarde
 */
public class Producto {
     String nombre; 
     double precio; 
    
    public boolean esCaro(){
        return precio > 50;
    }
    public void mostrar(){
        System.out.printf("Producto %s: %.2f euros",this.nombre, this.precio);
    }
}
