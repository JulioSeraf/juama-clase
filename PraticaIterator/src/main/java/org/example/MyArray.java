package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArray<E> implements Iterable<E>{
    private final ArrayList<E> data;

    public MyArray () {
        data = new ArrayList<>();
    }

    public void add ( E element ) {
        data.add(element);
    }

    public int size () {
        return data.size();
    }

    public E get (int index) {
        return data.get(index);
    }


    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator();
    }

    private class MyArrayIterator implements Iterator<E> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return MyArray.this.data.size() > index;
        }

        @Override
        public E next() {
            E el = data.get(index);
            index++;
            return el;
        }
    }
}