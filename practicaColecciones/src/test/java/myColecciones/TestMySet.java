package myColecciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMySet {
    @Test
    public void validar_add(){
        MySet<Integer> list = new MySet<>();
        list.add(22);
        list.add(33);
        Assertions.assertTrue(list.add(31));
        Assertions.assertFalse(list.add(22));
    }
    @Test
    public void validar_addAll(){
        MySet<Integer> list = new MySet<>();
        list.add(33);
        list.add(356);
        list.add(22);
        MySet<Integer> listToAdd = new MySet<>();
        listToAdd.add(33);
        listToAdd.add(203);
        listToAdd.add(43);

        Assertions.assertTrue(list.addAll(listToAdd));
        MySet<Integer> listToReadicionar = new MySet<>();
        Assertions.assertEquals(5, list.size());
        listToReadicionar.add(33);
        listToReadicionar.add(22);
        Assertions.assertFalse(list.addAll(listToReadicionar));
    }
}
