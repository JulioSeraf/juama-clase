/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.arrayejercicios;

import java.util.Random;

/**
 *
 * @author julio
 */
public class TemperaturasDiarias {
    double[] temps = new double[7];
    Random r = new Random();

    public TemperaturasDiarias(){
       for(int i=0; i < this.temps.length; i++){
        double aleNum = r.nextDouble(-11, 50);
        temps[i] = aleNum;
      }
    }

    

    /**
     * Media de Temperatura
     * @return
     */
    public double media(){
        double suma = 0;
        for(int i = 0; i< this.temps.length; i++){
            suma += temps[i];
        }
        return suma/this.temps.length;
    }
    
    /**
     * Temperatura Alta 
     * @return Devolve la temperatura mas alta 
     */
    public double temMasAlta(){
        double alta = 0;
        for(int i = 0;i < this.temps.length; i++){
            alta = temps[0];
              if(alta < this.temps[i]){
                  alta = this.temps[i];
              }
        }
        return alta;
    }
 

    /**
     * Temperatura baja 
     * @return Devolver la temperatura mas baja
     */
    public double tempsMasBaja(){
        double baja=0;
         for(int i = 0;i < this.temps.length; i++){
            baja = temps[0];
              if(baja > this.temps[i]){
                  baja = this.temps[i];
              }
        }
        return baja;
    }
}
