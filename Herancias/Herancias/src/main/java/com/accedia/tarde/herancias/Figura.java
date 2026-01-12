/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author User
 */
public abstract class Figura {
    private final String COLOR;
    public Figura(){
        this.COLOR ="no color";
    }
    public Figura(String color){
        this.COLOR = color;
    }
    
    public void mostrarColor(){
        System.out.println(this.COLOR);
                
    }
    public abstract double calcularArea();
}
