/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.caja;

/**
 *
 * @author tarde
 */
public class Caja{
    private final int ANCHO;
    private final int ALTO;
    private final int FONDO;
    private Unidad unidad;
    private String etiqueta;
    public Caja(int ancho , int alto, int fondo, Unidad unidad){
      this.ALTO  = alto;
      this.ANCHO = ancho;
      this.FONDO = fondo;
      this.unidad = unidad;
    }
    
    public double getVolumen(){
        int alto = unidad.conversor(ALTO);
        int ancho = unidad.conversor(ANCHO);
        int fondo = unidad.conversor(FONDO);
        return alto*ancho*fondo;
    }
    public String getEtiqueta(){
        return this.etiqueta;
    }
    public void setEtiqueta(String nombre, String dirrecion,String tel){
       this.etiqueta = String.format("""
                           Destinatario: %s
                           Dirreción: %s
                           Telefeno: %s
                           ===== INFO CAJA: =====
                           ALTO: %d
                           ANCHO: %d
                           FONDO: %d
                           """,nombre,dirrecion,tel,this.ALTO,this.ANCHO,this.FONDO);
    }
    @Override
    public String toString(){
        return "cria cajas, indicando alto, ancho, fondo";
    }
}
