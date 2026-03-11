/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author tarde
 */
public class MyDeque<T> extends MyQueue<T> implements Deque<T> {

    public MyDeque() {
    }
    @Override
    public void addFirst(T e) {
       list.throwNoElementesNull(e);
        list.addFirst(e);
    }

    @Override
    public void addLast(T e) {
        list.throwNoElementesNull(e);
        list.addLast(e);
    }

    @Override
    public boolean offerFirst(T e) {
        int oldSize = list.size();
        list.throwNoElementesNull(e);
        list.addFirst(e);
        return oldSize < list.size();
    }

    @Override
    public boolean offerLast(T e) {
        int oldSize = list.size();
        list.throwNoElementesNull(e);
        list.addLast(e);
        return oldSize < list.size();
    }

    @Override
    public T removeFirst() {
        return list.removeFirst();
    }

    @Override
    public T removeLast() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Colleción vacia!");
        }
        return list.removeLast();
    }

    @Override
    public T pollFirst() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    @Override
    public T pollLast() {
        return list.isEmpty() ? null : list.removeLast();
    }

    @Override
    public T getFirst() {
        return list.get(0);
    }

    @Override
    public T getLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public T peekFirst() {
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public T peekLast() {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return list.remove(o);
    }
    
    

    @Override
    public boolean removeLastOccurrence(Object o) {
        int oldSize = list.size();
        if(list.lastIndexOf(o) != -1){
            list.remove(list.lastIndexOf(o));
        }
        return oldSize > list.size();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @Override
    public void push(T e) {
        list.add(e);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Iterator<T> descendingIterator() {
        // No hacerlo
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
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
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

}
