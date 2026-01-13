/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author tarde
 */
public class MotoElectrica extends Vehiculo implements Electrico{

    @Override
    public void mover() {
        System.out.println("Con dos ruedas, volecidad" + super.velocidad);
    }

    @Override
    public void eletricidad() {
        System.out.println("Movido a Eletricidad");
    }
}
