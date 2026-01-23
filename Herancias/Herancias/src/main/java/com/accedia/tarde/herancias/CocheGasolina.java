/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author tarde
 */
public class CocheGasolina extends Vehiculo implements Combustion{

    @Override
    public void mover() {
        System.out.println("se mueve con cuatra ruedas");
    }

    @Override
    public void conbustible() {
        System.out.println("Movido a combustible");
    }
    
}
