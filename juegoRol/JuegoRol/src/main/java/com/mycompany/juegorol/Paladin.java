/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegorol;

/**
 *
 * @author User
 */
public class Paladin extends Personaje {
    private final int ATAQUE = 60;
    private final int DEFESA = 140;

    public Paladin(String name) {
        super(name);
    }

    @Override
    public int Ataque() {
        return this.ATAQUE;
    }

    @Override
    public int Defesa() {
        return this.DEFESA;
    }
    
}
