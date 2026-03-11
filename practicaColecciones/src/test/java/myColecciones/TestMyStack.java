package myColecciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyStack {
    @Test
    public void validar_push(){
        MyStack<Integer> pila = new MyStack<>();
         Assertions.assertEquals(14,pila.push(14), "Error en teste de push esperado");
        Assertions.assertNotEquals(13,pila.push(14), "Error en teste de push no esperado");

    }
    @Test
    public void validar_pop(){
        MyStack<Integer> pila = new MyStack<>();
        pila.push(14);
        pila.push(2);
        Assertions.assertEquals(2,pila.pop(),"Error en el teste pop esperado");
        Assertions.assertNotEquals(3,pila.pop(), "Error en el teste de pop no esperado");
    }
    @Test
    public void validar_peek(){
        MyStack<Integer> pila = new MyStack<>();
        pila.push(33);
        pila.push(22);
        Assertions.assertEquals(22 ,pila.peek(),"Error en el teste de peek esperado");
        Assertions.assertNotEquals(33,pila.peek(),"Error en el teste de peek no esperado");
    }
    @Test
     public void validar_search(){
        MyStack<Integer> pila = new MyStack<>();
        pila.push(33);
        pila.push(55);
        pila.push(88);
        Assertions.assertEquals(2,pila.search(33), "Error en el teste de search esperado");
        Assertions.assertNotEquals(1,pila.search(33),"Error en el teste de search no esperado");
        Assertions.assertEquals(-1, pila.search(67), "Error en el teste en caso de no encontrado");
    }
}
