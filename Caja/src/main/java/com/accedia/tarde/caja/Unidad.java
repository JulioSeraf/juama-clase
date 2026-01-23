/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.caja;

/**
 *
 * @author tarde
 */
public class Unidad{
    public String valor;
    public Unidad(String valor){
   
        this.valor = valor;
    }
    
    public int conversor(int valor){
        if(this.valor.equalsIgnoreCase("cm")){
            return valor/100;
        }
        return valor;
    }
    
}
