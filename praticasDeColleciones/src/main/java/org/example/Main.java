package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Informe la cantidad de numero: ");
        int cantNum = sc.nextInt();
        int index = 1;
        while(cantNum > 0 ){
            System.out.printf("informe el n%dº: ", index++);
            list.add(sc.nextInt());
            cantNum--;
        }
        double total = 0;
       for(Integer el:list){
           total += el;
       }
       list.sort(Integer::compareTo);
        int mayor = list.getLast();
        int menor = list.getFirst();
       double media = total / list.size();

        System.out.printf("""
                Mayor: %d
                Menor: %d
                Media: %.1f
                Total: %.1f
                """,mayor,menor,media,total);

    }
}
