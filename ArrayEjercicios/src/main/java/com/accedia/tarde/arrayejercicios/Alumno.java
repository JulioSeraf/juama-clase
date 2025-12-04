/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.arrayejercicios;

import java.util.Arrays;

/**
 *
 * @author tarde
 */
public class Alumno {
    String name;
    double nota;
    double total;
    double media;
    double[] notas = new double[3];
    public Alumno(String nombre, double nota){
        this.name = nombre;
        this.nota = nota;
        this.notas[0] = nota;
    }
}
