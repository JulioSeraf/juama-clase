/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.ejerciciosclass;

/**
 *
 * @author tarde
 */
public class Aluno {
    final String NOMBRE; 
    final double NOTA1,
           NOTA2,
           NOTA3;
    
    public Aluno(String nombre, double n1, double n2, double n3){
        this.NOMBRE = nombre;
        this.NOTA1 = n1;
        this.NOTA2 = n2;
        this.NOTA3 = n3;
    }
    
    public double media(){
       return (this.NOTA1 + this.NOTA2 + this.NOTA3)/3;
    } 
    
    public boolean aprobado(){
        return this.media() >= 5;
    }
    public void compararCon(String nombre, double media){
        if(this.media() ==  media){
            System.out.printf("La media es la misma");
        }else if(this.media() <  media){
            System.out.printf("%s tiene mayor media: aluno: %.1f > tu: %.1f",nombre,media, this.media());
        }
        System.out.printf("tienes mejor media: tu %.1f > aluno: %.1f",this.media(), media);
    }
    
    public void mostrar(){
        System.out.printf("""
                          Aluno: %s
                          N.Media: %.1f
                          Aprovado: %s
                           """,this.NOMBRE,this.media(),this.aprobado());
    }
}
