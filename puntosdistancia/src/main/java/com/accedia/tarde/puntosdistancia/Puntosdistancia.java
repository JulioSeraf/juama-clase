/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.puntosdistancia;
/**
 *
 * @author tarde
 */
public class Puntosdistancia {

    public static void main(String[] args) {
        Punto pA = new Punto();
        Punto pB = new Punto();
        double distancia,dy,dx;
        
        pA.x = 2.0;
        pA.y = 3.0;
        
        pB.x = 4.0;
        pB.y = 4.0;
        //Calcular distancia entre cada componente
        dx = pA.x - pB.x;
        dy = pA.y - pB.x;
        
        //Elevar al cuadrado las distancia
        dx = Math.pow(dx,2);
        dy = Math.pow(dy,2);
        
        //calcular la distancia total( raiz cuadrada de la suma de los cuadratos

        distancia = Math.sqrt(dx + dy);
        
         

        System.out.println("La distancia entre A y B es de " + distancia);
    }
}
