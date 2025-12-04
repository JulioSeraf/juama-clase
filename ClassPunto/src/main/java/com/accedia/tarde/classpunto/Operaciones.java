/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.classpunto;

/**
 *
 * @author tarde
 */
class Operaciones {
    public boolean isPrimo(int valor){
       boolean esPrimo = true;
       int i = 2;
       int resto;
       
       if(valor < 2) return false;
       
       while(i < valor && esPrimo){
           resto = valor % i;
           if(resto == 0) esPrimo = false;
           i++;
       }
       return esPrimo;
   }
}
