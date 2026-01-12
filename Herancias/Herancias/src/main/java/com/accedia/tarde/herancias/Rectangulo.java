/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author User
 */
public class Rectangulo extends Figura {
    private double ladoX;
    private double ladoY;
    
    public Rectangulo(String color, double ladoX, double ladoY){
       super(color);
       this.ladoX = ladoX;
       this.ladoY = ladoY;
    }
    @Override
    public double calcularArea() {
        return getLadoY()*2 + getLadoX()*2;
    }

    public double getLadoX() {
        return ladoX;
    }

    public void setLadoX(double ladoX) {
        this.ladoX = ladoX;
    }

    public double getLadoY() {
        return ladoY;
    }

    public void setLadoY(double ladoY) {
        this.ladoY = ladoY;
    }
    
}
