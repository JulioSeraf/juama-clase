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
        if (o == null) {
            throw new NullPointerException("Elemento nulo, esta lista no acepta elementos nulos");
        }
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
        while (it.hasNext() && !foundEl) {
            if (it.next().equals(o)) {
                foundEl = true;
                data.remove(index);
            }
            index++;
        };
        return oldSize > data.size();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c == null) {
            throw new NullPointerException("Colleccion es nula!");
        }
        boolean found = true;
        for (Object el : c) {
            if (el == null) {
                throw new NullPointerException("Elemento nulo, esta lisa no acepta elementos nulos");
            }
            if (!this.contains(el) && found) {
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
            if (el == null) {
                throw new NullPointerException("Elemento Nulo, esta lista no acepta elementos nulo");
            }
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
            if (el == null) {
                throw new NullPointerException("Elemento Nulo, esta lista no acepta elementos nulo");
            }
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
        int oldSize = data.size();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            T el = it.next();
            if (!c.contains(el)) {
                this.remove(el);
            }
        }
        return oldSize < data.size();
    }

    @Override
    public void clear() {
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            this.remove(it.next());
        }
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
    public void add(int index, T element) {
        if (index < 0 || index > data.size()) {
            throw new IndexOutOfBoundsException("index fuera del limite de la Lista");
        }
        if (element == null) {
            throw new NullPointerException("las lista no integra elemetos null");
        }
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
        data.add(element);
        Iterator<T> itRes = resto.iterator();
        while (itRes.hasNext()) {
            this.add(itRes.next());
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
    public int lastIndexOf(Object o) {
        return this.size() - 1;
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

}
