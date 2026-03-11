package myColecciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import myColecciones.MyList;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tarde
 */
public class TestMyList {

    @Test
    public void validar_size() {
        MyList<String> list = new MyList<>();
        assertEquals(0, list.size(),"Error en teste si devolve 0");
        list.add("Julio");
        list.add("Serafim");
        assertEquals(2, list.size(),"Error en teste si lista hay 2 elementos");
    }

    @Test
    public void validar_isEmpty() {
        MyList<String> list = new MyList<>();
        assertTrue(list.isEmpty(),"Error en el teste si la lista esta vacia");
        list.add("julio");
        assertFalse(list.isEmpty(), "Error en el teste si en la lista hay elementos");
    }

    @Test
    public void validar_throwNoElementsNull() {
        MyList<Integer> list = new MyList<>();
        assertThrows(NullPointerException.class, () -> {
            list.throwNoElementesNull(null);
        },"Error en el teste si elemento es null");
    }

    @Test
    public void validar_throwNoCollecionNull() {
        MyList<Integer> list = new MyList<>();
        MyList<Integer> listToAdd = null;
        assertThrows(NullPointerException.class, () -> {
            list.throwNoCollecionNull(listToAdd);
        },"Error en teste si colección está vacía");
    }

    @Test
    public void validar_contains() {
        MyList<String> list = new MyList<>();
        list.add("Julio");
        list.add("Oliveira");
        assertTrue(list.contains("Julio"),"Error en el teste si en la lista contiene el elemento");
        assertFalse(list.contains("Luana"),"Error en el teste si en la lista no contiene el elemento");
    }

    @Test
    public void validar_containsAll() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        list.add("Cristiano");
        list.add("Messi");
        assertTrue(list.containsAll(listToAdd),"Error en el teste si en la lista contiene todos los elementos");

        listToAdd.add("Julio");
        listToAdd.add("Oliveira");

        assertFalse(list.containsAll(listToAdd),"Error en el teste si en la lista no contiene todos los elementos");
    }

    @Test
    void validar_addAll() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        assertTrue(list.addAll(listToAdd),"Error en el teste de adicionar todos elemento de la lista");
    }

    @Test
    void validar_addAllForIndex() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        list.add("PEDRO");
        list.add("Maria");
        assertTrue(list.addAll(1, listToAdd), "Error en el teste de adicionar todos elementos a la lista con index");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.addAll(5, listToAdd);
        },"Error en el teste de adicionar lista en index inexistente");
    }

    @Test
    public void validar_indexOf() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        assertEquals(0, list.indexOf("julio"),"Error en el teste de index correto");
        assertNotEquals(0, list.indexOf("serafim"), "Error en el teste de index incorreto");
    }

    @Test
    public void validar_lastIndexOf() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        list.add("julio");
        assertEquals(2, list.lastIndexOf("julio"),"ERROR en teste de indexOf correto");
        assertNotEquals(1, list.lastIndexOf("julio"),"Error en teste de indexOf incorreto");
    }

    @Test
    public void validar_subList() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        list.add("Carlos");
        assertEquals(1, list.subList(0, 1).size(),"Error en el teste de tamaño esperado");
        assertTrue(list.subList(1, 1).isEmpty(), "Error en el teste de tamaño no esperado");
    }

    @Test
    public void validar_concat() {
        MyList<String> l1 = new MyList<>();
        l1.add("julio");
        l1.add("julio");
        l1.add("sera");
        MyList<String> l2 = new MyList<>();
        l2.add("pedro");
        l2.add("Carlos");
        assertEquals(5,MyList.concat(l1, l2).size(), "Error en teste de concat esperado");
        assertNotEquals(3,MyList.concat(l1, l2).size(), "Error en teste de concat inesperado");
        
    }
}
