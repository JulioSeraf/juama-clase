/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.agendapersonas;

/**
 *
 * @author tarde
 */
public class Persona {
    private String nombre;
    private String email;
    private int edad;
    private String telefono ; 
    public Persona(String nombre,String telefono, String email, int edad){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }
    /**
     * 
     * @return  Nombre
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * 
     * @return Edad  
     */
    public int getEdad(){
        return this.edad;
    }
    /**
     * 
     * @param edad the edad to set
     */
    public void setEdad(int edad){
        this.edad = edad;
    }
    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}   
