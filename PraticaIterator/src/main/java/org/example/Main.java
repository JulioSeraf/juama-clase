package org.example;

import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        MyArray<Integer> list = new MyArray<>();

        list.add(23);
        list.add(45);
        list.add(54);
        list.add(2);
        list.add(90);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
