/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias.newpackage;

/**
 *
 * @author tarde
 */
public class Guerrero extends Vida implements Ataque{
    private final String Name;
    public Guerrero(){
        this.Name = "";
        }
    public Guerrero(String name, int vida){
        super(vida);
        this.Name = name;
    }

    @Override
    public int getHp() {
        return
    }

    @Override
    public void setHp() {
    }

    @Override
    public int nado() {
    }
}
