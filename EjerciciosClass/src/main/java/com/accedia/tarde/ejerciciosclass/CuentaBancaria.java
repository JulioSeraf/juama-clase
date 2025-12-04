/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejerciciosclass;

/**
 *
 * @author tarde
 */
public class CuentaBancaria {
    final String TITULAR_NOM,TITULAR_APEL;
    double saldo = 0;
    public CuentaBancaria(String nombre, String apellido){
        this.TITULAR_NOM = nombre;
        this.TITULAR_APEL = apellido;
    }
    
    public double depositar(double deposito){
       return saldo += deposito;
        
    }
    
    public void retirar(double retirar){
        saldo -= retirar;
    }
    
    public void mostrar(){
        System.out.printf("""
                          TITULAR: %s %s
                          Saldo: %.2f
                           """,this.TITULAR_NOM, this.TITULAR_NOM, this.saldo );
    }
    
    public double trasfirirA(CuentaBancaria destino, double cantRetirar){
        if(cantRetirar > saldo){
            System.out.println("Saldo Insuficiente!");
        }else{
        saldo -= cantRetirar;
        destino.saldo += cantRetirar;
        }
        return cantRetirar;
    }
    
    
}
