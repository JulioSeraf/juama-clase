/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegorol;

/**
 *
 * @author User
 */
public class Arquero extends Personaje {
    private final int ATAQUE = 70;
    private final int DEFESA = 70;
    public Arquero(String name){
        super(name);
    }
    @Override
    public void mostrar() {
        System.out.printf("""
                           ============== Estado Arquero =============
                           ==============     %s      =============
                           ==============    Vida     =============
                           ====== ATAQUE =========== DEFESA =======
                           ======   %d   ===========   %d   =======
                           """, super.getNombre(), this.ATAQUE, this.DEFESA);
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
