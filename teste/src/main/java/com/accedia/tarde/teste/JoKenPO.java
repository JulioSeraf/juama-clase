/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.teste;

/**
 *
 * @author tarde
 */
public class JoKenPO {

    public void Personas() {
        int[] edades = {23, 40, 70, 10, 90};
        String[] nombres = {"julio", "Carla", "Antonio", "Maria", "Pedro"};

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] <= 17) {
                System.out.printf("\n%s tiene %d y es menor de edad", nombres[i], edades[i]);
            } else if (edades[i] >= 18 && edades[i] <= 65) {
                System.out.printf("\n%s tiene %d y es mayor de edad", nombres[i], edades[i]);
            } else {
                System.out.printf("\n%s tiene %d y es Pensionista\n", nombres[i], edades[i]);

            }
        }
    }

    public static void main(String[] args) {
        Teste ts = new Teste();
        System.out.println("===================== Ejercico 6 ========================");
        ts.Personas();
        System.out.println("===================== Ejercico 7 =====================");

    }
}
