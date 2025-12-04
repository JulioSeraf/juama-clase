/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.pratica1;

/**
 *
 * @author tarde
 */
public class Pratica1 {

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Interstellar", 169.0);
        Pelicula p2 = new Pelicula("Matrix", 136.0);
        Pelicula p3 = new Pelicula("Coco", 105.0);
        Pelicula p4 = new Pelicula("Toy Story", 81.0);
        
        Pelicula[] pelis = {p1,p2,p3,p4};
        int larga =0; 
        int cortas = 0;
        System.out.println("===========  Información de Peliculas Disponibles: =========");
        for(int i = 0; i< pelis.length; i++){
            if(pelis[i].esLarga()){
                larga++;
            }else{
                cortas++;
            }
            pelis[i].mostrar();
        }
        System.out.println("==================== Largas - Cortas =======================");
        System.out.printf("Largas: %d - Cortas: %d\n", larga, cortas);
        String res = "";
        if(larga < cortas){
            res = "Cortas";
        }if(larga > cortas){
            res = "Largas";
        }else{
            res = "Misma cantida de Largas y Cortas";
        }
        System.out.printf("La mayoria de las peliculas han sido: %s",res);
           
        
    }
}
