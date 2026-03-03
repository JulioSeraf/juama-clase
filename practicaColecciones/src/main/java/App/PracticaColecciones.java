/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package App;

import myColecciones.MyList;

/**
 *
 * @author tarde
 */
public class PracticaColecciones {

    public static void main(String[] args) {
        MyList<String> li = new MyList<>();
        li.add("julio");
        li.add("carlos");
        System.out.println(li.contains("julio"));

    }
}
