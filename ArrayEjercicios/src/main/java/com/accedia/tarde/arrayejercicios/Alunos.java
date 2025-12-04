/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.arrayejercicios;

/**
 *
 * @author tarde
 */
public class Alunos {

    private String[] aluno = {"Carlos", "Maria", "Antonio", "Sergio", "Rolnadinho"};

    public void aRevez() {
        for (int i = this.aluno.length - 1; i >= 0; i--) {
            System.out.println(this.aluno[i]);
        }
    }

}
