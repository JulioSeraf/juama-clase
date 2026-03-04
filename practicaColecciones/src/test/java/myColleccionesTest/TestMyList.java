package myColleccionesTest;

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
        assertEquals(2,list.size());
    }

    @Test
    public void validar_isEmpty() {
        MyList<String> list = new MyList<>();
        assertTrue(list.isEmpty());
        list.add("julio");
        assertFalse(list.isEmpty());
    }
    @Test
    public void validar_noElementsNull(){
        MyList<Integer> list = new MyList<>();
        assertThrows(NullPointerException.class, ()->{list.noElementesNull(null);});
    }
    
    @Test
    public void validar_contains(){
        MyList<String> list = new MyList<>();
        list.add("Julio");
        list.add("Oliveira");
        assertTrue(list.contains("Julio"));
        assertFalse(list.contains("Luana"));
    }
}
