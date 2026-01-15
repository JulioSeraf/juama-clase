/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.caja;

/**
 *
 * @author tarde
 */
public class App {

    public static void main(String[] args) {
        Caja box = new Caja(100,300,100, new Unidad("cm"));
        System.out.println(box.getVolumen());
        System.out.println(box);
        box.setEtiqueta("JULIO","Casa", "93839383");
        System.out.println(box.getEtiqueta());
    }
}
