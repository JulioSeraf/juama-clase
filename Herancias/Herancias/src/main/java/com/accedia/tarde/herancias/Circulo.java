/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author User
 */
public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.round(Math.PI*(this.radio*this.radio));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
