/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;

import com.accedia.tarde.practicacolecciones.InternalList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author tarde
 */
public class MyList<T> implements List<T> {

    private final InternalList<T> data;

    public MyList() {
        this.data = new InternalList<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        if(o == null) throw new NullPointerException("Elemento nulo, esta lista no acepta elementos nulos");
        boolean found = false;
        Iterator<T> it = data.iterator();
        do {
            T el = it.next();
            if (el.equals(o)) {
                found = true;
            }
        } while (it.hasNext());
        return found;
    }

    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean add(T e) {
        if (e == null) {
            throw new IllegalArgumentException("Elemento nulo, esta lista no acepta elementos nulos");
        }
        int oldSize = data.size();
        data.add(e);
        return oldSize > data.size();
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException("Elemento nulo, esta lista no acepta elementos nulos");
        }
        int oldSize = data.size();
        int index = 0;
        boolean foundEl = false;
        Iterator<T> it = data.iterator();
         do{
            if(it.next().equals(o)){
                foundEl = true;
                data.remove(index);
                }
            index++;
        }while (it.hasNext() && !foundEl);
        return oldSize > data.size();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if(c == null) throw new NullPointerException("Colleccion es nula!");
        boolean found = true;
        for(Object el : c){
            if(el == null) throw new NullPointerException("Elemento nulo, esta lisa no acepta elementos nulos");
            if(!this.contains(el) && found) {
                found = false;
            }
        }
        return found;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T get(int index) {
        return data.get(index);
    }

    @Override
    public T set(int index, T element) {
        T prevEl = data.get(index);
        data.set(index, element);
        return prevEl;
    }

    @Override
    public void add(int index, T element){
        if(index < 0 || index > data.size()) throw new IndexOutOfBoundsException("index fuera del limite de la Lista");
        if(element == null) throw new NullPointerException("las lista no integra elemetos null");
        Iterator it = data.iterator();
        while(it.hasNext()){
            
        }
    }

    @Override
    public T remove(int index) {
        return data.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        int index = 0; 
        Iterator<T> it = data.iterator();
        while (it.hasNext() && !it.next().equals(o)) {
            index++;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o){

    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
