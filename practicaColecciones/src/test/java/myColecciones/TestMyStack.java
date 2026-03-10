package myColecciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyStack {
    @Test
    public void validar_push(){
        MyStack<Integer> pila = new MyStack<>();
         Assertions.assertEquals(14,pila.push(14));
        Assertions.assertNotEquals(13,pila.push(14));

    }
    @Test
    public void validar_pop(){
        MyStack<Integer> pila = new MyStack();
        pila.push(14);
        pila.push(2);
        Assertions.assertEquals(2,pila.pop());
        Assertions.assertNotEquals(3,pila.pop());
    }
    @Test
    public void validar_peek(){
        MyStack<Integer> pila = new MyStack();
        pila.push(33);
        pila.push(22);
        Assertions.assertEquals(22 ,pila.peek());
        Assertions.assertNotEquals(33,pila.peek());
    }
    @Test
     public void validar_search(){
        MyStack<Integer> pila = new MyStack<>();
        pila.push(33);
        pila.push(55);
        pila.push(88);
        Assertions.assertEquals(2,pila.search(33));
        Assertions.assertNotEquals(1,pila.search(33));
        Assertions.assertEquals(-1, pila.search(67));
    }
}
