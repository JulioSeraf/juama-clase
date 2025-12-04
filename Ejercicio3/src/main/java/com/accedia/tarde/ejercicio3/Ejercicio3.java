/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.accedia.tarde.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantCaros = 0;
        Producto[] grupoProductos = new Producto[5];
        System.out.println("Informe los Productos");
        
      
        for(int p= 0; p < grupoProductos.length; p++){
            grupoProductos[p] = new Producto(); 
            System.out.println("Producto "+(p+1)+"º:");
            System.out.println("Nombre:");
            grupoProductos[p].nombre = sc.nextLine();
            System.out.println("precio:");
            grupoProductos[p].precio = sc.nextDouble();
            sc.nextLine();
        }
        
        for(int p = 0; p< grupoProductos.length;p++){
            if(grupoProductos[p].esCaro())cantCaros++;
            System.out.printf("""
                               ========== Producto %d =========
                              Nombre: %s
                              Precio: %.2f
                              """,p+1,grupoProductos[p].nombre,grupoProductos[p].precio);            
        }
        System.out.printf("Cantidad de Productos Caros: %d",cantCaros);
    }
}
