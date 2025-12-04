/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.tiposbasicos.entero;

/**
 *
 * @author tarde
 */
public class CalculaTiempo {

    public static void main(String[] args) {
        int entrada = 476279;
        int sec = 0; 
        int min = 0;
        int hours = 0; 
        int days = 0;
        
        min = entrada / 60;
        sec = entrada % 60;
        hours = min / 60;
        min = min % 60;
        days = hours / 24; 
        hours = hours % 24;
        
       
        
        
        System.out.printf("El valor indicado es %ddays,%dhora,%dmin,%dsec. ",days,hours,min,sec);
     
    }
}
