/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejerciciosclass;

/**
 *
 * @author tarde
 */
public class Temperatura {

    double num;
    String temp = "c";

    public Temperatura(double num) {
        this.num = num;
    }

    public double aFahrenheit() {
        double valor = this.num;
        if (temp.equals("c")) {
            valor = this.num * (9 / 5) + 32;
        } else if (temp.equals("k")) {
            valor = (this.num - 273.15) * (9 / 5) + 32;
        }
        return valor;
    }

    public double aKevin() {
        double valor = this.num;
        if (this.temp.equals("c")) {
            valor = this.num + 273.15;
        } else if (this.temp.equals("f")) {
            valor = (this.num - 32) * (5 / 9) + 273.15;
        }
        return valor;
    }

    public double aCelsius() {
        double valor = this.num;
        if (this.temp.equals("k")) {
            valor = this.num - 273.15;
        } else if (this.temp.equals("f")) {
            valor = (this.num - 32) * 5 / 9;
        }
        return valor;
    }

    public void subir() {
        this.num++;
    }

    public void bajar() {
        this.num--;
    }
}

