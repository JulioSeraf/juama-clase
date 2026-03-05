/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;

import App.InternalList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
        throwNoElementesNull(o);
        boolean found = false;
        Iterator<T> it = data.iterator();
        while (it.hasNext() && !found) {
            T el = it.next();
            if (el.equals(o)) {
                found = true;
            }
        }
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
    public <E> E[] toArray(E[] a) {
        return data.toArray(a);
    }

    @Override
    public boolean add(T e) {
        throwNoElementesNull(e);
        int oldSize = data.size();
        data.add(e);
        return oldSize < data.size();
    }

    @Override
    public boolean remove(Object o) {
        throwNoElementesNull(o);
        int oldSize = data.size();
        int index = 0;
        boolean foundEl = false;
        Iterator<T> it = data.iterator();
        while (it.hasNext() && !foundEl) {
            if (it.next().equals(o)) {
                foundEl = true;
                data.remove(index);
            }
            index++;
        }
        return foundEl;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throwNoCollecionNull(c);
        boolean found = true;
        Iterator it = c.iterator();
        while (it.hasNext() && found) {
            Object el = it.next();
            throwNoElementesNull(el);
            if (!this.contains(el)) {
                found = false;
            }
        }
        return found;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throwNoCollecionNull(c);
        int oldSize = data.size();
        for (T el : c) {
            throwNoElementesNull(el);
            this.add(el);
        }
        return oldSize < data.size();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throwNoCollecionNull(c);
        if (index < 0 || index > data.size()) {
            throw new IndexOutOfBoundsException("Index no inexistente/invalido!");
        }
        int oldSize = data.size();
        Iterator<? extends T> it = c.iterator();
        while (it.hasNext()) {
            T el = it.next();
            throwNoElementesNull(el);
            data.add(index++, el);
        }
        return oldSize < data.size();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            this.remove(it.next());
        }
        return data.isEmpty();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throwNoCollecionNull(c);
        int oldSize = data.size();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            T el = it.next();
            throwNoElementesNull(el);
            if (!c.contains(el)) {
                this.remove(el);
            }
        }
        return oldSize < data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public T get(int index) {
        if (data.isEmpty()) {
            throw new NoSuchElementException("Colleción vacia!");
        }
        return data.get(index);
    }

    @Override
    public T set(int index, T element) {
        T prevEl = data.get(index);
        data.set(index, element);
        return prevEl;
    }

    @Override
    public void add(int index, T element) {
        data.add(index, element);
    }

    @Override
    public T remove(int index) {
        return data.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        throwNoElementesNull(o);
        int index = -1;
        boolean found = false;
        Iterator<T> it = data.iterator();
        while (it.hasNext() && !found) {
            index++;
            if (it.next().equals(o)) {
                found = true;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        throwNoElementesNull(o);
        int index = -1;
        int found = 0;
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Object el = it.next();
            index++;
            if (el.equals(o)) {
                found = index;
            }
        }
        return found;
    }

    @Override
    public ListIterator<T> listIterator() {
        return data.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return data.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > this.size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Valor de index invalido!");
        }
        MyList<T> subL = new MyList<>();
        Iterator<T> it = data.iterator();
        for (int i = fromIndex; i < toIndex; i++) {
            subL.add(data.get(i));
        }
        return subL;
    }

    public static <T> MyList<T> concat(MyList<T> l1, MyList<T> l2) {
        MyList<T> list = new MyList<>();
        list.throwNoCollecionNull(l1);
        list.throwNoCollecionNull(l2);
        list.addAll(l1);
        list.addAll(l2);
        return list;
    }

    protected void throwNoElementesNull(Object el) {
        if (el == null) {
            throw new NullPointerException("Esta lista no acepta elementos vacios");
        }
    }

    protected void throwNoCollecionNull(Object el) {
        if (el == null) {
            throw new NullPointerException("Esta lista no acepta elementos vacios");
        }
    }
}
