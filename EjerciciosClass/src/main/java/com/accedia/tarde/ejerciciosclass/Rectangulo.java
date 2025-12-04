package com.accedia.tarde.ejerciciosclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class Rectangulo {
    double base;
    double altura;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public boolean esCuadrado(){
        boolean res = false;
        if(base == altura) res = true; 
       return res;
    }
    
    public double perimetro(){
     return (base*2) + (altura *2);
    }
    
    public double area(){
    return base * altura;
    }
    public boolean tieneMayorAreaQue(double base,double altura){
        return this.area() > (base* altura); 
    }
    
    public void mostrarInformacion(){
        System.out.printf("""
                          
                           ============ informcion del Rectangulo ===========
                           base: %.2f
                           altura : %.2f
                           Es Cuadrado?: %b
                           Perimetro: %.2f
                           Area: %.2f
                          \n
                           """,this.base, this.altura,esCuadrado(),perimetro(),area());
    }
}
