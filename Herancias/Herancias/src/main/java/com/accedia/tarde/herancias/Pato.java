/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author tarde
 */
public class Pato extends Animal implements Caminante,Nadador,Volador {

    @Override
    public void hacerSonido() {
        System.out.println("Kua!! hua!! ");
    }

    @Override
    public void camina() {
        System.out.println("camina con las pata, pero mal");
    }

    @Override
    public void nada() {
           System.out.println("nada con las pata, tbm mal");
    }

    @Override
    public void volar() {
        System.out.println("Vola con las alas, y lo hace peor");
    }
    
}
