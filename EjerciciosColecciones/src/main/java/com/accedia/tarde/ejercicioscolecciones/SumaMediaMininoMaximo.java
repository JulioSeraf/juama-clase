/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejercicioscolecciones;

import java.util.ArrayList;

/**
 *
 * @author tarde
 */
public class SumaMediaMininoMaximo {
     private ArrayList<Integer> num = new ArrayList();
     public SumaMediaMininoMaximo(){}
     
     public void adicionarNum(int valor){
         num.add(valor);
     }
     public int suma(){
         return num.stream().reduce(0, (a,b) -> a+b);
     }
     public double media(){
         return suma()/num.size();
     }
     public int minino(){
        num.sort((a,b) -> a-b);
        return num.getFirst();
     }
     public int maximo(){
        num.sort((a,b)-> b-a);
        return num.getFirst();
     }
     
      
}
