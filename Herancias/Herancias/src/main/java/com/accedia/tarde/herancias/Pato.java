/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author User
 */
public class Pato extends Animal implements Caminante, Nadador,Volador {

    @Override
    public void hacerSonido() {
        System.out.println("kual kual");
    }

    @Override
    public void camina() {
        System.out.println("Camina con las patas, pero mal");
                
    }

    @Override
    public void nada() {
        System.out.println("Nada con las patas, tbn mal");
    }

    @Override
    public void volar() {
        System.out.println("Vola con las bater de alas, no tan mal");
    }
    
    
}
