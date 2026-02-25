
package com.accedia.tarde.practicacolecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * InternalList<T>
 * 
 * Clase de soporte para almacenamiento interno.
 * Encapsula un ArrayList y expone únicamente un conjunto
 * reducido de operaciones básicas.
 */
public class InternalList<T> {

    private final ArrayList<T> data;

public InternalList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public void add(int index, T element) {
        data.add(index, element);
    }

    public void set(int index, T element) {
        data.set(index, element);
    }

    public T get(int index) {
        return data.get(index);
    }

    public T remove(int index) {
        return data.remove(index);
    }

    public int size() {
        return data.size();
    }

    public void clear() {
        data.clear();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public Iterator<T> iterator() {
        return data.iterator();
    }

    public ListIterator<T> listIterator() {
        return data.listIterator();
    }

    public ListIterator<T> listIterator(int index) {
        return data.listIterator(index);
    }

    public Object[] toArray() {
        return data.toArray();
    }

    public <E> E[] toArray(E[] a) {
        return data.toArray(a);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
