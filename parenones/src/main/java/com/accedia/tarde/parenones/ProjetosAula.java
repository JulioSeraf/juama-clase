/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accedia.tarde.parenones;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class ProjetosAula {
    public static String PedirParesNones(Scanner sc) {
        System.out.print("\tinforme Si PARES/NONES:\n>");
        String valor = sc.nextLine().trim();
        return valor;
    }

    public static int PedirNumero(Scanner sc) {
        System.out.print("\n\tinforme un Numero de 0 a 10:\n>");
        int valor = sc.nextInt();
        return valor;
    }

    public static void ResultIs(String usPaNo, int numMaq, int numUs, Scanner sc) {
        if (numUs >= 0 && numUs <= 10) {
            System.out.printf("""
                              ========================
                              Numero de la Maquina: %d
                              Tu Numero: %d
                              Resultado: %d
                              Escojiste: %s
                              
                              
                              """,numMaq,numUs,(numUs+numMaq),usPaNo);
            
            if (((numMaq + numUs) % 2 == 0) && (usPaNo.equals("pares") || usPaNo.equals("par"))) {
                System.out.println("""
                                  ==============
                                  GANASTE!!!!
                                  ==============
                                  """);
            } else if (((numMaq + numUs) % 2 == 1) && (usPaNo.equals("nones") || usPaNo.equals("impar"))) {
                System.out.println("""
                                  ==============
                                  GANASTE!!!!
                                  ==============
                                  """);
            }else{
                  System.out.println("""
                                  ==============
                                  GANA LA MAQUINA!!!!
                                  ==============
                                  """);
            }
            
        } else if (numUs > 10) {
            System.err.print("=================\nNo Sabes Contar ?\n=================\t");
            int num = PedirNumero(sc);
            ResultIs(usPaNo, numMaq, num, sc);
        } else {
            System.err.println("=============\nESTO ES UN NUMERO ENTRE 0-10??!!\n TIENES FRIO?!!\n=============\t");
            int num = PedirNumero(sc);
            ResultIs(usPaNo, numMaq, num, sc);
        }
    }
    public static void isPaOrIm(String usPaNo,int numMaq, Scanner sc){
         if (usPaNo.equals("pares") || usPaNo.equals("nones") || usPaNo.equals("par") || usPaNo.equals("impar")) {
            int numUs = PedirNumero(sc);
            ResultIs(usPaNo, numMaq, numUs, sc);
        } else {
            System.err.print("""
                             ==========================================
                             \tEsto no es un Pares/Nones!!\t
                             ==========================================
                             """);
            String usPN = PedirParesNones(sc).toLowerCase();
            isPaOrIm(usPN,numMaq,sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMaq = (int) ((Math.random() * 10) + 1); 
         String usPaNo = PedirParesNones(sc).toLowerCase();
        isPaOrIm(usPaNo,numMaq,sc);
       

        

    }
}
