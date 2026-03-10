package myColecciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyDeque {
    @Test
    public void validar_removeLastOcurrence(){
        MyDeque<Integer> list = new MyDeque<>();
        list.add(32);
        list.add(23);
        list.add(98);
        list.add(32);
    }
}
