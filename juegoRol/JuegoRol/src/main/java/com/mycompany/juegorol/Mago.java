/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegorol;

/**
 *
 * @author User
 */
public class Mago extends Personaje{
    private final int ATAQUE = 30;
    private final int DEFESA = 100;
    public Mago(String nombre) {
        super(nombre);
    }
    public void personajeFrase(){
        System.out.println("Abrakadabra");
    }
   
    @Override
    public int Ataque() {
        System.out.println("ABRAKADABRA!!");
        return this.ATAQUE;
    }

    @Override
    public int Defesa() {
        System.out.println("MANO DE CRISTO");
        return this.DEFESA;
    }
}
