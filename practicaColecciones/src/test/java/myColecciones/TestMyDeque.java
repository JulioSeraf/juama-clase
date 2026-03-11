package myColecciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyDeque {
    @Test
    public void validar_removeLastOccurrence(){
        MyDeque<Integer> list = new MyDeque<>();
        list.add(32);
        list.add(23);
        list.add(32);
        list.add(98);
        Assertions.assertFalse(list.removeLastOccurrence(36),"Error en teste de remove no encontrado");
        list.add(44);
        Assertions.assertTrue(list.removeLastOccurrence(32), "Error en teste de remove encontrado");


    }
    @Test
    public void validar_offerFirst(){
        MyDeque<Integer> list = new MyDeque<>();
        list.add(34);
        list.addFirst(88);
        list.add(90);
        Assertions.assertEquals(88, list.getFirst(),"Error en teste de elemento esperado");
        Assertions.assertNotEquals(90, list.getFirst(), "Error en teste de elemento no esperado");
    }
    @Test
    public void validar_offerLast(){
        MyDeque<Integer> list = new MyDeque<>();
        list.add(34);
        list.add(88);
        list.add(90);
        Assertions.assertEquals(90, list.getLast(),"Error en teste de elemento esperado");
        Assertions.assertNotEquals(88, list.getLast(),"Error en teste de elemento no esperado");
    }
}
