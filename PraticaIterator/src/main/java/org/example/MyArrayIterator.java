package org.example;

import java.util.Iterator;
import java.util.List;

public class MyArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    private List<E> list;
        public MyArrayIterator(List<E> list){
            this.list = list;
        }
    @Override
    public boolean hasNext() {
       return list.size() > index;
    }

    @Override
    public E next() {
        E el = list.get(index);
        index++;
        return el;
    }
}
