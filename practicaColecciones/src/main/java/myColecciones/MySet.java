/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author tarde
 */
public class MySet<T> implements Set<T>{
    private final MyList<T> list;
    public MySet(){
        this.list = new MyList<>();
    }
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
       return list.toArray(a);
    }

    @Override
    public boolean add(T e) {
        boolean adicionado = false;
        if(!list.contains(e)){
            list.add(e);
            adicionado = true;
        } 
        
        return adicionado;
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<? extends T> it = c.iterator();
        boolean adicionado = false;
        while(it.hasNext()){
            T el = it.next();
            if(!list.contains(el)){
                adicionado = list.add(el);
            }
        }
        return adicionado;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }
    
}
