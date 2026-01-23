/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias.newpackage;

/**
 *
 * @author tarde
 */
public class Guerrero extends Vida implements Ataque,Defensa{
    private final String Name;
    public Guerrero(String name){
        super(200);
        this.Name = name;
        }
    public Guerrero(String name, int vida){
        super(vida);
        this.Name = name;
    }
    public String getName(){
        return this.Name;
    }

    @Override
    public int dano() {
        return -300;
    }

    @Override
    public int shild() {
        return -100;
    }
}
