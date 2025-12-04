/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.jokenpo;

import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class JoKenPo {

    public boolean isValida(String resPlay) {
        if (!resPlay.equalsIgnoreCase("papel") && !resPlay.equalsIgnoreCase("tijera") && !resPlay.equalsIgnoreCase("piedra")) {
            //resPlay = "Mano NO VALIDA!!";
            System.out.println("MANO INVALIDA!!!");
            return false;
        }
        return true;
    }

    public int roudsA(String play1, String play2) {
        play1 = play1.trim().toLowerCase();
        play2 = play2.trim().toLowerCase();
        int res = 0;
        if (play1.equals(play2)) {
            return res;
        }

        if ((play1.equals("papel") && play2.equals("piedra"))
                || (play1.equals("piedra") && play2.equals("tijera"))
                || (play1.equals("tijera") && play2.equals("papel"))) {
            res = 1;
            return res;
        }
        res = 2;
        return res;
    }
    public String Players(Scanner sc, int num){
        String name = "";
        while(name.equals("")){
            System.out.printf("Nombre de Jugador %d:\n",num);
             name = sc.nextLine().toUpperCase();
        }
        return name;
    }

    public void scare(int p1, int p2, String name1,String name2) {
        System.out.printf("""
                          =========================== %s %d ===== %s %d =======================
                          """,name1,p1,name2,p2);
        
    }

    public void theEnd(int p1,int p2, String name1,String name2){
        String ganador = "";
        if(p1 > p2){
           ganador = name1;
        }else if ( p2 > p1){
            ganador = name2;
        }
        
         System.out.printf("""
                              ====================   GANADOR!!!!   =================
                              ====================     %s       =================
                              ====================  Puntuación  =================
                              ============== %s %d  ========== %s %d ============
                              """,ganador,name1,p1,name2,p2);
         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JoKenPo JKP = new JoKenPo();
        System.out.printf("""
                          ===================== JoKenPo/Pidra-Papel-Tijera =======================
                          Regras:  
                                   * Piedra vence a Tijera.
                                   * Tijera vence a Papel.
                                   * Papel vence a Piedra.
                                   * La misma jugada es empate.
                          Jugadas: 
                                   * Dos jugadores, máximo 5 rondas (best of five). El juego termina si un
                                   jugador alcanza 3 victorias. Si nadie llega a 3 tras 5 rondas,
                                   gana quien tenga más victorias; en caso de empate, se juega muerte súbita.\n
                          ================================= Empezamos =============================
                          Enter -> Play
                          NO -> Exit
                          """);
        String start = sc.nextLine();
        if (start.equalsIgnoreCase("no")) {
            System.out.println("OK, Hasta la Proxima!!");
        } else{
            int marRound = 0;
            boolean round = false;
            String nameRound = "ROUND Best of Five";
            int resHand = 0;
            String handPlay1 = "";
            String handPlay2 = "";
            int p1 = 0;
            int p2 = 0;
           // String[] valido = new String[2];
            String namePlay1 = JKP.Players(sc,1);
            String namePlay2 = JKP.Players(sc,2);

            while (round == false) {
                System.out.printf("""
                          =========================== %s %d===========================
                          """,nameRound,++marRound);
                JKP.scare(p1, p2,namePlay1, namePlay2);
                // Mano player 1
                do {
                    System.out.printf("""
                           Turno: %s
                           Escoja una Mano( Piedra/Papel/Tijera):
                           >
                           """, namePlay1);
                    handPlay1 = sc.nextLine();
                } while (JKP.isValida(handPlay1) == false);

                // Mano player 2
                do {
                    System.out.printf("""
                           Turno: %s
                           Escoja una Mano( Piedra/Papel/Tijera):
                           >
                           """, namePlay2);
                    handPlay2 = sc.nextLine();
                } while (JKP.isValida(handPlay2) == false);

                resHand = JKP.roudsA(handPlay1, handPlay2);

                switch (resHand) {
                    case 1 -> {   
                        p1++;
                    }
                    case 2 -> {
                        p2++;
                    }
                }
                if(p1 == 3 || p2 == 3)round = true;
                if(marRound >= 5){
                    if(p1 != p2) round = true;
                    nameRound = "Round Muerte Súbita";
                }         
               
            }
            JKP.theEnd(p1, p2, namePlay1, namePlay2);
            System.out.println("================= FIM DE JUEGO ===================");
            
            

        }

    }
}
