/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.ahorcado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author User
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {

    public String getWorlds(String url) {
        var list = new ArrayList<String>();
        String linea;
        try (var bf = new BufferedReader(new FileReader(url))) {
            while ((linea = bf.readLine()) != null) {
                list.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }

        return list.get((int) (Math.random() * list.size()));
    }

    public String[] seachWorld(String world, String userW, String[] worldSpace) {
        String[] haveWorld = {"false", ""};
        userW = userW.substring(0, 1);
        //Buscando Lentra
        var arrayWorlds = world.split("");
        for (int i = 0; i < arrayWorlds.length - 1; i++) {
            if (arrayWorlds[i].equalsIgnoreCase(userW)) {
                worldSpace[i] = userW + " ";
                haveWorld[0] = "true";
            }

        }
        haveWorld[1] = String.join(",", worldSpace).replace(",", " ");
        return haveWorld;
    }

    public String[] worldSpace(String world) {
        var worldSpace = new String[world.length()];
        for (int i = 0; i < worldSpace.length; i++) {
            worldSpace[i] = "_ ";
        }
        return worldSpace;
    }

    public static void main(String[] args) {
        var methoAhorcado = new Ahorcado();
        Scanner sc = new Scanner(System.in);
        String world = null;
        System.out.print("""
                           ==================== EL AHORCADO ====================
                           SELECIONE UN MODO DE JUEGO:
                           1 -> ESCOJE PALAVRA
                           2 -> PALAVRA ALEATORIA
                           """);
        int res = sc.nextInt();
        sc.nextLine();

        // NUMERO Y NOME DE PLAYER=====================================
        int numPlayer = 0;
        boolean ok = true;
        do {
            System.out.println("Informe el numero de jugadores (maximo 5):");
            String numPUser = sc.nextLine();
            try {
                numPlayer = Integer.parseInt(numPUser);
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Esto no es un numero valido!!");
                ok = false;
            }

        } while (!ok);
        // Criar condicionar para asegurar tipo int+++++++++++

        while (numPlayer <= 0 || numPlayer > 5) {
            System.out.println("""
                                  Numero de jugadores no Invalido!!
                                  Maximo 5 Jugadores!!!
                                  Minimo 1 Jugador!!!
                                  informe el numero de jugadores:
                                  """);

            numPlayer = sc.nextInt();
            sc.nextLine();
        }

        var players = new String[numPlayer];
        var introName = numPlayer == 1 ? "DIGITE TU NOMBRE!" : "Informe los nombre de los jugadores!\n";
        int con = 1;
        System.out.println(introName);
        for (int i = 0; players.length - 1 >= i; i++) {
            if (numPlayer > 1) {
                System.out.printf("Player Nº %d: ", con++);
            }
            players[i] = sc.nextLine();
        }

        // Modos de juego =============================================
        if (res == 1) {
            System.out.println("""
                               \n ESCRIVA LA PALAVRA:
                               (Obs: no deje que tu adversario la vea!)
                               """);
            do{
               world = sc.nextLine().trim().toUpperCase();
            }while(world.equals(""));
            
        }

        // MODO ALEATORIO ================================================================ 
        
        if (res == 2) {
            world = methoAhorcado.getWorlds("./textos/Animales.txt");
        }
        
        var worldSpace = methoAhorcado.worldSpace(world);

        System.out.println("""
                               Informar Dica para la palabra?
                               -> SI
                               -> NO
                               """);

        String dica = sc.nextLine();
        
        // Dica para juego
        // Remodelar Dicas para los 2 juegos
        
        if (dica.equalsIgnoreCase("si")) {
            System.out.println("Informe a Dica:");
            dica = "Dica: " + sc.nextLine();
        } else {
            dica = "";
        }

        int trys = 6;
        int turnoPlay = 0;
        boolean play = false;
        while (play == false) {
            if (turnoPlay == players.length) {
                turnoPlay = 0;
            }
            System.out.printf("""
                                  ======================= TURNO =============================
                                  Jugador: %s
                                  %s
                                  Escriba una letra:
                                  """, players[turnoPlay], dica);
            String userW = null;
            do{
                 userW = sc.nextLine().trim().toUpperCase();
            }while(userW.equals(""));
            
            String[] worldArray = methoAhorcado.seachWorld(world, userW, worldSpace);

            if (worldArray[0].equalsIgnoreCase("false")) {
                trys--;
                turnoPlay++;
            }

            System.out.printf("""
                                  ===========================================================
                                  Palabra: %s
                                  """, worldArray[1]);

            switch (trys) {
                case 0 ->
                    System.out.printf("""
                                    \t    Vitima
                                    \t      0
                                    \t     /|\\
                                    \t     / \\
                              """);
                case 1 ->
                    System.out.printf(""" 
                              Tentativas : *
                                            
                                    \t    Vitima
                                    \t      0
                                    \t     /|\\
                                    \t     / 
                              """);
                case 2 ->
                    System.out.printf("""
                              Tentativas : **
                                            
                                    \t    Vitima
                                    \t      0
                                    \t     /|\\
                                    \t      
                              """);
                case 3 ->
                    System.out.printf("""
                              Tentativas : ***
                                            
                                    \t    Vitima
                                    \t      0
                                    \t     /|
                                    \t     
                              """);
                case 4 ->
                    System.out.printf("""
                              Tentativas : **** 
                                            
                                    \t    Vitima
                                    \t      0
                                    \t      |
                                    \t     
                              """);
                case 5 ->
                    System.out.printf("""
                              Tentativas : *****   
                                            
                                    \t    Vitima
                                    \t      0
                                    \t     
                                    \t     
                              """);
                case 6 ->
                    System.out.println("""
                              Tentativas : *****
                                             """);
            }

            String finalWorld = worldArray[1].replace(" ", "");

            if (finalWorld.equals(world) == true) {
                play = true;
                System.out.printf("""
                                      ========================== fim de Juego ===================
                                      =============== MUY BIEN %s!!.PALAVRA ENCONTRADA!!! =======
                                                                   %s
                                      """, players[turnoPlay], finalWorld);
            }
            if (trys == 0) {
                play = true;
                System.out.println("""
                                       ========================== fim de Juego ===================
                                       =============== SORRY PALAVRA NO ENCONTRADA!!! ============
                                       """);

            }

        }
    }
}
