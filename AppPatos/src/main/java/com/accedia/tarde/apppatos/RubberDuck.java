/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.apppatos;

/**
 *
 * @author tarde
 */
public class RubberDuck extends Duck implements Quackable{
    @Override
    public void quack(){
        System.out.println("piiii");
    }

    @Override
    public void display() {
        System.out.println("looks like a RubberDUCK");
    }

}
