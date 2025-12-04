/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.agendapersonas;

import java.util.ArrayList;

/**
 *
 * @author tarde
 */
public class ListaPersonas {
    private Persona[] lista;
    private final int contador; 
    public ListaPersonas(int contador){
        this.contador = contador;
        this.lista = new Persona[contador];
    }
    
    public void anadir(Persona nuevaPersona){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == null) lista[i] = nuevaPersona;
        }
    }
    public void mostrar(){
        for(Persona per: lista){
            System.out.printf("""
                              =============================
                              Nombre: -> %s
                              Apellido -> %s
                              Edad -> &d
                              Telefono -> $s
                              Email -> %s
                              Dirección -> %s
                             """);
        }
    }
    
}
