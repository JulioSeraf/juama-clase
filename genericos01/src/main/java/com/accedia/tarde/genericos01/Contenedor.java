/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.genericos01;

import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class Contenedor<T> {

    private T[] contener;

    public Contenedor(T[] tabla) {
        this.contener = Arrays.copyOf(tabla, 0);
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevoA = Arrays.copyOf(contener, contener.length + 1);
        nuevoA[0] = nuevo;
        for (int i = 1; i < nuevoA.length; i++) {
            nuevoA[i] = contener[i - 1];
        }

    }

    public void insertarAlFinal(T nuevo) {
        contener = Arrays.copyOf(contener, contener.length + 1);
        contener[contener.length - 1] = nuevo;
    }

    public T exrtaerDelPrincipio() {
        T[] nuevo = Arrays.copyOf(contener, contener.length + 1);
        for (int i = 1; i < contener.length; i++) {
            nuevo[i - 1] = contener[i];
        }
        return contener[0];
    }

    public T extraerDelFinal() {
        T[] nuevo = Arrays.copyOf(contener, contener.length - 1);
        for (int i = 0; i < contener.length; i++) {
            nuevo[i] = contener[i];
        }
        return contener[contener.length - 1];

    }

    public void ordenar() {

        
    }
}
