/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.herancias;

/**
 *
 * @author User
 */
public class Alumno extends Persona{
    private final String curso;
    
    public Alumno(String nombre, int edad, String curso){
        super(nombre, edad);
        this.curso = curso;
    }
    
    public void estudiar(){
        System.out.printf("Estoy a estudiar %s \n",this.curso);
    }
    @Override
    public void presentarse(){
        super.presentarse();
        this.estudiar();
    }
}

