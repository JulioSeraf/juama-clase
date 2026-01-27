/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegorol;

/**
 *
 * @author User
 */
public class Guerrero extends Personaje {
    private final int ATAQUE = 80;
    private final int DEFESA = 60;
    public Guerrero(String name) {
        super(name);
    }

    @Override
    public void mostrar() {
        System.out.printf("""
                           ============== Estado Guerrero =============
                           ==============     %s      =============
                           ==============    Vida     =============
                           ====== ATAQUE =========== DEFESA =======
                           ======   %d   ===========   %d   =======
                           """,super.getNombre(), this.ATAQUE, this.DEFESA);
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
