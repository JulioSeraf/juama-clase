/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegorol;

/**
 *
 * @author User
 */
public abstract class  Personaje {
    private final String NOMBRE;
    private int vida =100;
    public Personaje(String nombre){
        this.NOMBRE = nombre;
    };
    public void mostrar(){
        
    };
    
    public abstract int Ataque();
    
    public abstract int Defesa();
    
}
