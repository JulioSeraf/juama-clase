/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.genericos01;
import java.util.*;

/**
 *
 * @author tarde
 */
public class Genericos01 {
 
    
     public static <T> T[] copGeneric(T obj,T[] tabla){
         T[] nuevo = Arrays.copyOf(tabla, tabla.length + 1);
         nuevo[tabla.length] = obj;
         return nuevo;
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[2];
        
        num[0] = 1;        
        num[1] = 2;
        
        Integer[] res = copGeneric(6, num);
        
        System.out.println(Arrays.toString(res));
        
        
        
    }
}
