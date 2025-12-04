/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.accedia.tarde.arrayejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tarde
 */
public class ArrayEjercicios {

    /**
     *
     * @param per
     * @return
     */
    public Persona recorrer(Persona[] per) {
        int masViejo = per[0].edad;
        int numPer = 0;
        //String name = "";
        for (int i = 0; i < per.length; i++) {
            if (per[i].edad < masViejo) {
                masViejo = per[i].edad;
                //name = per[i].nombre;
                numPer = i;
            }
        }
        return per[numPer];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperaturasDiarias temps = new TemperaturasDiarias();
        System.out.println(temps.media());
        System.out.println(temps.temMasAlta());
        System.out.println(temps.tempsMasBaja());

        Alunos todosAlunos = new Alunos();
 
        todosAlunos.aRevez();
        Alumno[] grupoAlunos = new Alumno[4];

        System.out.println(grupoAlunos[0]);

        Alumno aluno1 = new Alumno("julio", 10);
        Alumno aluno2 = new Alumno("juana", 5);
        Alumno aluno3 = new Alumno("marcia", 9);
        Alumno aluno4 = new Alumno("carlos", 11);

        grupoAlunos[0] = aluno1;
        grupoAlunos[1] = aluno2;
        grupoAlunos[2] = aluno3;
        grupoAlunos[3] = aluno4;

        double nota = 0;
        String name = "";
        double total = 0;
        for (Alumno grupoAluno : grupoAlunos) {
            total += grupoAluno.nota;
            if (nota < grupoAluno.nota) {
                nota = grupoAluno.nota;
                name = grupoAluno.name;
            }
        }

        System.out.printf("El alumno %s tiene la nota mas alta %.1f\n", name, nota);
        double media = total / grupoAlunos.length;
        System.out.printf("La Media de los Alunos es %.1f\n", media);

        ArrayProductos p1 = new ArrayProductos("tele", 350);
        ArrayProductos p2 = new ArrayProductos("ordenado", 750);
        ArrayProductos p3 = new ArrayProductos("x300plusMegaPower", 4000);

        ArrayProductos[] productos = {p1, p2, p3};
        double totalPro = 0;
        String namePro = "";
        double mayor = 0;
        double menor = productos[0].precio;
        double medioPro = 0;
        for (ArrayProductos p : productos) {
            totalPro += p.precio;
            if (mayor < p.precio) {
                mayor = p.precio;
                namePro = p.nombre;
            }
            else{
                System.out.println("ddo");
            }
            if (p.precio < menor) {
                menor = p.precio;
            }
        }

        for (ArrayProductos p : productos) {
            if (p.precio < mayor && p.precio > menor) {
                medioPro = p.precio;
            }
        }

        System.out.printf("""
                          Precio total de los Productos : %.2f
                          Precio Medio: %.2f
                          Producto MaS Caro: %s
                          """, totalPro, medioPro, namePro);

        String[] palabras = {"coche", "perro", "jirafa", "gato"};

        System.out.println("Busca la Palabra");
        String userP = sc.nextLine();
        String encontrada = "!no Encotrada";
        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(userP)) {
                encontrada = "Palavra encotrada";
            }
        }

        System.out.println(encontrada);

        int[][] numMatris = new int[3][3];

        for (int i = 0; i < numMatris.length; i++) {
            for (int n = 0; n < numMatris[i].length; n++) {
                numMatris[i][n] = new Random().nextInt(1, 100);
            }
        }
        for (int i = 0; i < numMatris.length; i++) {
            for (int n = 0; n < numMatris[i].length; n++) {
                System.out.print(numMatris[i][n] + " ");
            }
            System.out.println();
        }
        Libros libro1 = new Libros("Cancion de heilo y fuego", "Gorgie R.R Martin", 1000);
        Libros libro2 = new Libros("Alquimista", "Pablo coelho", 300);
        Libros libro3 = new Libros("El Hobbit", " R. Tolkien", 700);
        Libros[] libreria = {libro1, libro2, libro3};
        int masPagina = 0;
        String masPagNom = "";
        int totalPag = 0;
        for (int i = 0; i < libreria.length; i++) {
            if (libreria[i].paginas > masPagina) {
                masPagina = libreria[i].paginas;
                masPagNom = libreria[i].titulo;
            }
            totalPag += libreria[i].paginas;
        }
        System.out.printf("El Libro con mas Pagina: %s \n Total de pagina entre todos: %d", masPagNom, totalPag);

        Persona persona1 = new Persona("maria", 33);
        Persona persona2 = new Persona("joao", 55);
        Persona persona3 = new Persona("jessica", 10);
        Persona persona4 = new Persona("elizabet", 31);
        Persona persona5 = new Persona("julio", 28);

        Persona[] people = {persona1, persona2, persona3, persona4, persona5};
        var metodos = new ArrayEjercicios();

        metodos.recorrer(people).mostrar();

        System.out.println();

        var goodofWar = new Articulo("goodOfWar", 5, 59.90);
        var playStatio = new Articulo("PS", 200, 500);
        var xboxSerieS = new Articulo("XBOX", 432, 459.99);

        Articulo[] tienda = {goodofWar, playStatio, xboxSerieS};
        int cant = 0;
        int cadPrecio = 0;
        for (int i = 0; i < tienda.length; i++) {
            if (tienda[i].cantidad < 10) {
                tienda[i].mostrar();
            }
            cant += tienda[i].precio;
            cadPrecio += tienda[i].cantidad;
        }

        int invantarioValor = cant * cadPrecio;
        System.out.println("precio total del inventario: " + invantarioValor);

        System.out.println("Exercicios de class 2=========================");

        System.out.println("Estadisticas de clase");
        Alumno esAluno1 = new Alumno("cesar", 8);
        esAluno1.notas[1] = 4;
        esAluno1.notas[2] = 8;
        Alumno esAluno2 = new Alumno("Joana", 8);
        esAluno2.notas[1] = 9;
        esAluno2.notas[2] = 1;
        Alumno esAluno3 = new Alumno("jose", 10);
        esAluno3.notas[1] = 5;
        esAluno3.notas[2] = 8;
        Alumno esAluno4 = new Alumno("julio", 10);
        esAluno4.notas[1] = 8;
        esAluno4.notas[2] = 6;
        Alumno esAluno5 = new Alumno("lorena", 3);
        esAluno5.notas[1] = 2;
        esAluno5.notas[2] = 7;

        Alumno[] arrayEsAlumno = {esAluno1, esAluno2, esAluno3, esAluno4, esAluno5};
        total = 0;
        media = 0;
        for (int i = 0; i < arrayEsAlumno.length; i++) {
            for (int a = 0; a < arrayEsAlumno[i].notas.length; a++) {
                arrayEsAlumno[i].total += arrayEsAlumno[i].notas[a];
            }
            arrayEsAlumno[i].media = arrayEsAlumno[i].total / arrayEsAlumno[i].notas.length;
        }
        mayor = 0;
        String nombreA = "";
        for (int i = 0; i < arrayEsAlumno.length; i++) {
            if (arrayEsAlumno[i].media > mayor) {
                mayor = arrayEsAlumno[i].media;
                nombreA = arrayEsAlumno[i].name;
            }
        }
        System.out.printf("""
                           Aluno de con mayor nota: %s
                           nota: %.1f
                           
                           """, nombreA, mayor);

        System.out.println("Tabla de Multiplicar ===========================================\n");

        int[][] table10 = new int[10][10];

        for (int i = 0; i < table10.length; i++) {
            for (int t = 0; t < table10[i].length; t++) {
                table10[i][t] = (i + 1) * (t + 1);
            }
        }
        System.out.println("Tablas de 1 al 10");
        for (int i = 0; i < table10.length; i++) {
            for (int t = 0; t < table10.length; t++) {
                System.out.printf("%3d ", table10[t][i]);
            }
            System.out.println();
        }

        System.out.println("NOTAS POR ASIGNATURAS ==========================");
        Asignatura matematica = new Asignatura();
        Asignatura fisica = new Asignatura();
        Asignatura geologia = new Asignatura();
        matematica.nombre = "Matematica";
        matematica.notas[0] = 5;
        matematica.notas[1] = 8;
        matematica.notas[2] = 5;
        matematica.notas[3] = 10;
        geologia.notas[0] = 7;
        geologia.notas[1] = 7;
        geologia.notas[2] = 5;
        geologia.notas[3] = 0;
        fisica.notas[0] = 7;
        fisica.notas[1] = 2;
        fisica.notas[2] = 6;
        fisica.notas[3] = 9;
        Asignatura[] arrayAs = {matematica, fisica, geologia};
        mayor = 0;
        menor = arrayAs[0].notas[0];
        for (int i = 0; i < arrayAs.length; i++) {
            for (int a = 0; a < arrayAs[i].notas.length; a++) {
                arrayAs[i].media += arrayAs[i].notas[a];
                if (arrayAs[i].notas[a] > mayor) {
                    mayor = arrayAs[i].notas[a];
                }
                if (arrayAs[i].notas[a] < menor) {
                    menor = arrayAs[i].notas[a];
                }

            }
        }
        double mediaGlobal = 0;
        for (int i = 0; i < arrayAs.length; i++) {
            mediaGlobal = arrayAs[i].media;
        }
        System.out.printf("""
                          media de asignaturas: 
                            mat -> %.1f
                            fis -> %.1f
                            geo -> %.1f
                          media Global: %.1f
                          nota mas Alta: %.1f
                          nota mas baja: %.1f \n
                          """, arrayAs[0].media,
                arrayAs[1].media,
                arrayAs[2].media,
                mediaGlobal,
                mayor,
                menor);
        System.out.println("Matriz de Pontuaciones ==================================");
        Jugador Julio = new Jugador("julio");
        Jugador Beatriz = new Jugador("Beatriz");
        Jugador Weslley = new Jugador("Weslley");
        Jugador Larissa = new Jugador("Larissa");
        Jugador[] arrayJu = {Julio, Larissa, Beatriz, Weslley};
        for (int i = 0; i < arrayJu.length; i++) {
            for (int p = 0; p < arrayJu[i].puntos.length; p++) {
                int numAle = (int) (Math.random() * 99) + 1;
                arrayJu[i].puntos[p] = numAle;
            }
        }

        Jugador[] partidas = {Julio, Beatriz, Weslley, Larissa};
        mayor = 0;
        double puntos = 0;
        double[] mediaJug = new double[partidas.length];
        for (int i = 0; i < partidas.length; i++) {
            for (int p = 0; p < partidas[0].puntos.length; p++) {
                puntos += partidas[i].puntos[p];
            }
            mediaJug[i] = puntos;
            partidas[i].puntosTotal = puntos;
            puntos = 0;
        }
        String playMayScare = "";
        for (int i = 0; i < partidas.length; i++) {
            if (partidas[i].puntosTotal > mayor) {
                playMayScare = partidas[i].nombre;
            }
        }
        puntos = 0;

        double[] mediaPat = new double[partidas[0].puntos.length];
        for (int i = 0; i < partidas[0].puntos.length; i++) {
            for (int j = 0; j < partidas.length; j++) {
                mediaPat[i] += partidas[j].puntos[i];

            }
            mediaPat[i] = mediaPat[i] / mediaPat.length;
        }

        Arrays.sort(mediaPat);
        System.out.println(Arrays.toString(mediaPat));
        System.out.println();
        System.out.printf("""
                          ================ PARTIDAS JUGADAS: %d ==============
                          jugador con mas puntos: %s
                          la partida con mayor media: %.1f
                          \n
                           """, mediaPat.length, playMayScare, mediaPat[mediaPat.length - 1]);

        System.out.println("=========================== Inventario bidimensional ===========================");
        
        
        Producto[][] grupoProductos = {
            {new Producto("mercedes",40_000),
                new Producto("audi", 60_000),
                new Producto("golf",70_000)
            },{
                new Producto("Mario Kard",70),
                new Producto("GOD of War",80),
                new Producto("Read Dead 2",90)
            },{
                new Producto("Play Station",500),
                new Producto("XBOX ONE",400),
                new Producto("Nitendo",450)
            }
                };
        System.out.println(Arrays.deepToString(grupoProductos));
        double totalInventario =0;
        for(int i = 0; i< grupoProductos.length; i++){
            for(int p = 0; p < grupoProductos[i].length; p++){
                
            }
        }
        
        System.out.println(5/3);
        
    }

}
