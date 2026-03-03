/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;

import java.util.NoSuchElementException;

/**
 *
 * @author tarde
 */
public class MyQueue<E> {
    private final MyList<E> queue;
    public MyQueue(){
        this.queue = new MyList<>();
    }
    public boolean add(E e){
        if(e == null) throw new NullPointerException("Esta cola no Acepta elementos nulos");
        return queue.add(e);
    }
    public boolean offer(E e){
         if(e == null) throw new NullPointerException("Esta cola no Acepta elementos nulos");
         return queue.add(e);
    }
    public E remove(){
        if(queue.isEmpty()) throw new NoSuchElementException("Cola esta vacia");
        return queue.remove(0);
    }
    public E poll(){
        return queue.isEmpty()? null: queue.remove(0);
    }
    public E element(){
        if(queue.isEmpty()) throw new NoSuchElementException("Cola esta vacia");
        return queue.get(0);
    }
    public E peek(){
        return queue.isEmpty()?null:queue.get(0);
    }
}
