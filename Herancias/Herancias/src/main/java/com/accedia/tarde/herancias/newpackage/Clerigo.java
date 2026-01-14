/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias.newpackage;

/**
 *
 * @author tarde
 */
public class Clerigo extends Vida implements Curacion, Ataque{
    private final String NAME;
    public Clerigo(){
        super(400);
        this.NAME = "none";
    }
    public Clerigo(String name, int vida){
        super(vida);
        this.NAME = name;
    }
    public String getName(){
        return this.NAME;
    }
    @Override
    public int curar() {
        return 200;
    }

    @Override
    public int dano() {
        return -100;
    }
    
}
