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
    protected final MyList<E> list;
    public MyQueue(){
        this.list = new MyList<>();
    }
    public boolean add(E e){
        if(e == null) throw new NullPointerException("Esta cola no Acepta elementos nulos");
        return list.add(e);
    }
    public boolean offer(E e){
         if(e == null) throw new NullPointerException("Esta cola no Acepta elementos nulos");
         return list.add(e);
    }
    public E remove(){
        if(list.isEmpty()) throw new NoSuchElementException("Cola esta vacia");
        return list.remove(0);
    }
    public E poll(){
        return list.isEmpty()? null: list.remove(0);
    }
    public E element(){
        if(list.isEmpty()) throw new NoSuchElementException("Cola esta vacia");
        return list.get(0);
    }
    public E peek(){
        return list.isEmpty()?null:list.get(0);
    }
}
