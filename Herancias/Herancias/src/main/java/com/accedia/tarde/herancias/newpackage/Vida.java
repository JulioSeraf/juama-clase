/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias.newpackage;

/**
 *
 * @author tarde
 */
public abstract class Vida {
    private int hp; 
    public Vida(){};
   public Vida(int hp){
       this.hp = hp;
   }
   public abstract int getHp();
   public abstract void setHp();
       
   
    
}
