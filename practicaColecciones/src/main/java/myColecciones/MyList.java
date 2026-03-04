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
        noElementesNull(o);
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
        noElementesNull(e);
        int oldSize = data.size();
        data.add(e);
        return oldSize > data.size();
    }

    @Override
    public boolean remove(Object o) {
        noElementesNull(o);
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
        if (c == null) {
            throw new NullPointerException("Colleccion es nula!");
        }
        boolean found = true;
        Iterator it = c.iterator();
        while (it.hasNext() && found) {
            Object el = it.next();
            noElementesNull(el);
            if (!this.contains(el)) {
                found = false;
            }
        }
        return found;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            throw new NullPointerException("Collecion es Nula!");
        }
        int oldSize = data.size();
        for (T el : c) {
            noElementesNull(el);
            this.add(el);
        }
        return oldSize < data.size();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        if (c == null) {
            throw new NullPointerException("Collecion es Nula!");
        }
        if (index < 0 || index > data.size()) {
            throw new IndexOutOfBoundsException("Index no inexistente/invalido!");
        }
        int oldSize = data.size();
        int indexEl = 0;
        InternalList<T> resto = new InternalList<>();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            T el = it.next();
            indexEl = this.indexOf(el);
            if (indexEl >= index) {
                resto.add(el);
                this.remove(indexEl);
            }

        }
        for (T el : c) {
            noElementesNull(el);
            data.add(el);
        }
        Iterator<T> itRes = resto.iterator();
        while (itRes.hasNext()) {
            this.add(itRes.next());
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
        if (c == null) {
            throw new NullPointerException("Collecion NULA");
        }
        int oldSize = data.size();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            T el = it.next();
            noElementesNull(el);
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
        if(index < 0 || index >= size()) throw new IndexOutOfBoundsException("Index fuera de rango");
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
        noElementesNull(o);
        int index = 0;
        Iterator<T> it = data.iterator();
        while (it.hasNext() && !it.next().equals(o)) {
            index++;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        noElementesNull(o);
        int index = data.size();
        boolean found = false;
        while (!found) {
            if (data.get(index).equals(o)) {
                found = true;
            }
            index--;
        }
        return index + 1;
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
        Iterator<T> it = data.iterator();

        while (it.hasNext()) {
            T el = it.next();
            if (this.indexOf(el) < fromIndex || this.indexOf(el) > toIndex) {
                this.remove(el);
            }
        }
        if (fromIndex == toIndex) {
            this.clear();
        }
        return this;
    }
    public void noElementesNull(Object el){
           if(el == null) throw new NullPointerException("Esta lista no acepta elementos vacios");
    }
}
