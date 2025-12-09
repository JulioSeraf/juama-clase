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
                              Edad -> %d
                              Telefono -> %S
                              Email -> %s 
                              =============================\n
                             """,
                per.getNombre(),
                per.getEdad(),
                per.getTelefono(),
                per.getEmail());
    }

    public void mostrar() {
        boolean vacio = true;
        for(Persona per : lista){
            if(per != null){
                vacio = false;
                this.info(per);
            }
         }
        if(vacio){
            System.out.println("Agenda Vacia");
        }
        
        
    }

    public void buscar(String info) {
        for (Persona per : lista) {
            if (per.getNombre().contains(info)
                    || per.getTelefono().contains(info)) {
                this.info(per);
            }
        }
    }

}
