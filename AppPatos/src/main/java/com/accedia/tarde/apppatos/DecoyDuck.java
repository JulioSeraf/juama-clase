/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.apppatos;

/**
 *
 * @author tarde
 */
public class DecoyDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("De señuelo");
    }

    @Override
    public void quack() {
        System.out.println("QUACK!!");
    }
    
}
