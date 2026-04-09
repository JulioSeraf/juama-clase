package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Operacion sumar = Integer::sum;
        System.out.println(sumar.aplicar(6,7));
        Operacion restar = (a,b) -> a-b;
        System.out.println(restar.aplicar(5,7));
        Operacion multi = (a,b)-> a*b;
        System.out.println(multi.aplicar(5,5));

        System.out.println("=========================================== Ejercicio 5 ==========================================================");
        System.out.println("Espera un String, se inplica el metodo test, el java mira el valor de entrada y comproba si esta vacia o no devolvendo un booleano");
        System.out.println("=========================================== Ejercicio 6 ==========================================================");
        System.out.println("El caso A y C, porque la varible X no cambia de valor");
        System.out.println("=========================================== Ejercicio 7 ==========================================================");
        Predicate<Integer> isMulti3 = X ->  X % 3  == 0;
        System.out.println(isMulti3.test(3));
        System.out.println(isMulti3.test(4));
        System.out.println(isMulti3.test(6));
        System.out.println(isMulti3.test(9));

        System.out.println("=========================================== Ejercicio 8 ==========================================================");
        Function<String,String> cadena = x -> "[" + x +"]";
        System.out.println(cadena.apply("julio"));
        System.out.println(cadena.apply("serafim"));
        System.out.println("=========================================== Ejercicio 9 ==========================================================");
        Consumer<String> msg = System.out::println;

        msg.accept("mensage aceptada");

        System.out.println("=========================================== Ejercicio 10 ==========================================================");
        Supplier<Integer> num42 = ()-> 42;
        Supplier<Integer> randomNUm = ()-> (int) (Math.random()*100);
        System.out.println(num42.get());
        System.out.println(randomNUm.get());
        System.out.println("=========================================== Ejercicio 11 ==========================================================");
        List<String> nombres = List.of("julio","serafim","Luana","Mendes");

        nombres.forEach(e -> System.out.println(e.length()));
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
        nombres.stream().filter(e -> e.startsWith("s")).forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 12 ==========================================================");
        Comparator<String> esIgual = (a,b)-> a.length() - b.length();
        System.out.println(esIgual.compare("julio","julio2"));
        System.out.println("=========================================== Ejercicio 13 ==========================================================");
        Stream<String> listaStream = Stream.empty();
        List<String> l2 = listaStream.toList();
        System.out.println("=========================================== Ejercicio 14 ==========================================================");
        Stream<String> colorStream = Stream.of("rojo","verde","azul");
        colorStream.forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 15 ==========================================================");
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        long count = numeros.stream()
                .filter(e -> e % 2 == 0)
                .count();
        List<Integer> l2num = numeros.stream()
                        .map(e -> e * 10)
                        .toList();
        System.out.println(count);
        System.out.println(l2num);
        System.out.println("=========================================== Ejercicio 16 ==========================================================");
        String[] frutas = {"pera","manzana","uva","platano"};
        List<String> listaFrutas = Arrays.stream(frutas).map(String::toUpperCase).toList();
        System.out.println(listaFrutas);
        System.out.println("=========================================== Ejercicio 17 ==========================================================");
        IntStream num = IntStream.rangeClosed(1, 5);
        IntStream num1 = IntStream.rangeClosed(0, 10);
        IntStream num2 = IntStream.rangeClosed(10, 20);
        num.forEach(System.out::println);
        num1.forEach(System.out::println);
        num2.forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 18 ==========================================================");
        System.out.println("""
                Stream.empty(): Devolve un flujo de datos vacío
                Stream.of(...values): Devolve uns flujo de datos que no se puede cambiar después de creado con los valore pasados por parametro.
                coleccion.stream(): Has de la collecion un flujo de datos sin cambiar la collecion original.
                """);

        System.out.println("=========================================== Ejercicio 19 ==========================================================");
        List<String> palabras = List.of("sol","montaña","mar","luz","Programación");
        List<String> mas3 = palabras.stream()
                .filter(e -> e.length() > 3)
                .toList();
        System.out.println(mas3);
        System.out.println("=========================================== Ejercicio 20 ==========================================================");
        List<String> palabrasM = palabras.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(palabrasM);
        System.out.println("=========================================== Ejercicio 22 ==========================================================");
        List<Integer> numers = List.of(1,2,2,3,4,4,5,5,5);
        List<Integer> numersNoR = numers.stream().distinct().toList();
        System.out.println(numersNoR);
        System.out.println("=========================================== Ejercicio 23 ==========================================================");
        List<String> nombr = List.of("Luis","Ana","Maria","Pablo");
        List<String> alfNom = nombr.stream().sorted().toList();
        System.out.println(alfNom);
        System.out.println("=========================================== Ejercicio 24 ==========================================================");
        List<Integer> numeros1  = List.of(20,30,40,50,60);
        numeros1.stream().limit(3).forEach(System.out::println);
        System.out.println();
        numeros1.stream().skip(2).forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 25 ==========================================================");
        System.out.println("""
                    map(): Transforma los elementos del flujo
                    filter(): filtra en el flujo de datos
                """);
        System.out.println("=========================================== Ejercicio 26 ==========================================================");
        List<String> frases = List.of("Hola mundo", "java streams","programación funcional");
        String tex = frases.stream()
                .reduce("", (c , e) -> c + " " + e );

        System.out.println(tex.replaceAll(" ",", "));
        System.out.println("=========================================== Ejercicio 27 ==========================================================");
        List<Integer> numeross = List.of(2, 4, 6, 8, 10);
        System.out.println(numeross.size());
        long mayor7 = numeross.stream().filter(e -> e > 7).count();
        System.out.println(mayor7);
        boolean todosPares = numeross.stream().allMatch(e -> e % 2 == 0);
        System.out.println(todosPares);
        boolean noNegativos = numeross.stream().allMatch(e -> e >= 0);
        System.out.println(noNegativos);
        System.out.println("=========================================== Ejercicio 28 ==========================================================");
        List<String> nombrr = List.of("Ana","Luis","Marta","Pablo");
        nombrr.forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 29 ==========================================================");
        List<Integer> numeros4 = List.of(1, 2, 3, 4, 5);
        int suma =  numeros4.stream().reduce(0, Integer::sum);
        int multiTotal = numeros4.stream().reduce(1,(mult,e) -> mult * e);
        int mayor = numeros4.stream().reduce(0,(may, e) -> may > e ? may : e);
        System.out.printf("""
                Suma: %d
                Total del Producto: %d
                Mayor: %d
                """, suma, multiTotal, mayor);
        System.out.println("=========================================== Ejercicio 30 ==========================================================");
        List<String> words = List.of("sol", "mar", "sol", "luna","mar", "estrella");
        List<String> li = words.stream().toList();
        Set<String> liSet = words.stream().collect(Collectors.toSet());
        Map<Integer,List<String>> lisMap = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(lisMap);

        System.out.println("=========================================== Ejercicio 31 ==========================================================");
        List<String> nomb = List.of("Ana", "Luis", "Pablo", "Alberto", "Marta");
        nomb.stream().filter(e -> e.length() > 5 ).forEach(System.out::println);
        System.out.println("=========================================== Ejercicio 32 ==========================================================");





    }
}