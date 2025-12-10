/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.agendapersonas;

/**
 *
 * @author tarde
 */
public class ListaPersonas {

    private final Persona[] lista;
    private final int contador;

    public ListaPersonas(int contador) {
        this.contador = contador;
        this.lista = new Persona[contador];
    }
    
    public boolean vacio(){
        boolean hayPer = false;
        for(var per: lista){
            if(per != null){
                hayPer = true;
                break;
            }
        }
        if(!hayPer){
             System.out.println("""
                                                ====================
                                                =   Agenda Vacia!  =
                                                ====================
                               """);
        }
        return hayPer;
    }
    
    public void anadir(Persona nuevaPersona) {
        boolean adicionado = true;
        int cont = 0;
        do {
            if (lista[cont] == null) {
                lista[cont] = nuevaPersona;
                adicionado = false;
            }
            cont++;
        } while (adicionado);
    }

    private void info(Persona per) {
        System.out.printf("""
                              =============================
                              Nombre: -> %s
                              Telefono -> %S
                              Edad -> %d
                              Email -> %s 
                              =============================\n
                             """,
                per.getNombre(),
                per.getTelefono(),
                per.getEdad(),
                per.getEmail());
    }

    public void mostrar() {
            for(Persona per : lista){
            if(per != null){
                this.info(per);
            }
         }   
    } 
    public Persona buscar(String info) {
        boolean encontrada = false;
        Persona setPer = null;
        for (Persona per : lista) {
            if(per != null && per.getNombre().toLowerCase().contains(info.trim().toLowerCase()) ){
                this.info(per);
                setPer = per;
                encontrada = true;
            }
        }
        if(!encontrada) System.out.println("""
                                                                        ======================
                                                                        Contacto no encontrado
                                                                        ======================
                                           """);
        return setPer;
    }

}
