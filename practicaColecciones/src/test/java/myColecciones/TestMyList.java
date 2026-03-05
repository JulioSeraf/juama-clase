package myColecciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import myColecciones.MyList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tarde
 */
public class TestMyList {

    @Test
    public void validar_size() {
        MyList<String> list = new MyList<>();
        assertEquals(0, list.size());
        list.add("Julio");
        list.add("Serafim");
        assertEquals(2, list.size());
    }

    @Test
    public void validar_isEmpty() {
        MyList<String> list = new MyList<>();
        assertTrue(list.isEmpty());
        list.add("julio");
        assertFalse(list.isEmpty());
    }

    @Test
    public void validar_throwNoElementsNull() {
        MyList<Integer> list = new MyList<>();
        assertThrows(NullPointerException.class, () -> {
            list.throwNoElementesNull(null);
        });
    }

    @Test
    public void validar_throwNoCollecionNull() {
        MyList<Integer> list = new MyList<>();
        MyList<Integer> listToAdd = null;
        assertThrows(NullPointerException.class, () -> {
            list.throwNoCollecionNull(listToAdd);
        });
    }

    @Test
    public void validar_contains() {
        MyList<String> list = new MyList<>();
        list.add("Julio");
        list.add("Oliveira");
        assertTrue(list.contains("Julio"));
        assertFalse(list.contains("Luana"));
    }

    @Test
    public void validar_containsAll() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        list.add("Cristiano");
        list.add("Messi");
        assertTrue(list.containsAll(listToAdd));

        listToAdd.add("Julio");
        listToAdd.add("Oliveira");

        assertFalse(list.containsAll(listToAdd));
    }

    @Test
    void validar_addAll() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        assertTrue(list.addAll(listToAdd));
    }

    @Test
    void validar_addAllForIndex() {
        MyList<String> list = new MyList<>();
        MyList<String> listToAdd = new MyList<>();
        listToAdd.add("Cristiano");
        listToAdd.add("Messi");
        list.add("PEDRO");
        list.add("Maria");
        assertTrue(list.addAll(1, listToAdd));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.addAll(5, listToAdd);
        });
    }

    @Test
    public void validar_indexOf() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        assertEquals(0, list.indexOf("julio"));
        assertNotEquals(0, list.indexOf("serafim"));
    }

    @Test
    public void validar_lastIndexOf() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        list.add("julio");
        assertEquals(2, list.lastIndexOf("julio"));
        assertNotEquals(1, list.lastIndexOf("julio"));
    }

    @Test
    public void validar_subList() {
        MyList<String> list = new MyList<>();
        list.add("julio");
        list.add("serafim");
        list.add("Carlos");
        assertTrue(list.subList(0, 1).size() == 1);
        assertFalse(!list.subList(1, 1).isEmpty());
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
        assertEquals(5,MyList.concat(l1, l2).size());
        assertNotEquals(3,MyList.concat(l1, l2).size());
        
    }
}
