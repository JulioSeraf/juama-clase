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

    /**
     * Mostra el tamaño de la collección;
     * @return int con el tamaño;
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Comproba si la collecion se encontra vacio;
     * @return true si vacio, false si hay elementos;
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Compruebar si el elemento se encuentra en la colección
     * @param o elemento a comprobar
     * @return true si se encontra en la colección, false si no;
     */
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

    /**
     * Cria un iterator
     * @return el iterator
     */
    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

    /**
     * tronsforma la colección en un array
     * @return la colección en forma de array
     */
    @Override
    public Object[] toArray() {
        return data.toArray();
    }

    /**
     *  Devuelve una matriz que contiene todos los elementos de esta lista en secuencia apropiada (desde el primer hasta el último elemento); el tipo de tiempo de ejecución de La matriz devuelta es la de la matriz especificada. Si la lista encaja En la matriz especificada, se devuelve en ella. De lo contrario, una nueva La matriz se asigna con el tipo de tiempo de ejecución de la matriz especificada y El tamaño de esta lista.
     * @param a a matriz en la que se encuentran los elementos de esta lista Ser almacenado, si es lo suficientemente grande; de lo contrario, una nueva matriz de la El mismo tipo de tiempo de ejecución se asigna para este propósito.
     * @return <E> Una matriz que contiene los elementos de esta lista
     */
    @Override
    public <E> E[] toArray(E[] a) {
        return data.toArray(a);
    }

    /**
     * Añade el elemento especificado al final de esta lista
     * @param e elemento a adicionar a la colección
     * @return true si el elemento adicionado, false si no;
     */
    @Override
    public boolean add(T e) {
        throwNoElementesNull(e);
        int oldSize = data.size();
        data.add(e);
        return oldSize < data.size();
    }

    /**
     * Elimina la primera aparición del elemento especificado de esta lista;
     * @param o elemento a ser eleminado caso lo contenga;
     * @return true Si esta lista contenía el elemento especificado
     */
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

    /**
     * Comprueba si todos los elementos de la colección, esta en la lista;
     * @param c colección para comprabar si hay en la lista;
     * @return true Si esta lista contiene todos los elementos de la Colección especificada
     */
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

    /**
     * Adiciona todos elementos de la colección específica a la lista;
     * @param c colección a adicionar a la lista;
     * @return true si los elementos han sido adicionados
     */
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

    /**
     * Inserta todos los elementos de la colección especificada en este Lista en la posición especificada
     * @param index iInserta todos los elementos de la colección especificada en este Lista en la posición especificada
     * @param c colección que contiene elementos que se añadirán a esta lista
     * @return true Si esta lista cambia como resultado de la llamada
     */
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

    /**
     * Elimina de esta lista todos sus elementos que están contenidos en la recogida especificada
     * @param c  colección que contiene elementos a eliminar de esta lista
     * @return true Si esta lista cambia como resultado de la llamada
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            this.remove(it.next());
        }
        return data.isEmpty();
    }

    /**
     * Conserva solo los elementos de esta lista que están contenidos en el Recogida especificada (operación opcional). En otras palabras, elimina de esta lista todos sus elementos que no están contenidos en el Colección especificada.
     * @param c colección que contiene elementos que se conservarán en esta lista
     * @return true Si esta lista cambia como resultado de la llamada
     */
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

    /**
     * Elimina todos los elementos de esta lista;
     */
    @Override
    public void clear() {
        data.clear();
    }

    /**
     * Devuelve el elemento en la posición especificada en esta lista.
     * @param index  índice del elemento a devolver
     * @return El elemento en la posición especificada en esta lista
     */
    @Override
    public T get(int index) {
        if (data.isEmpty()) {
            throw new NoSuchElementException("Colección vacía!");
        }
        return data.get(index);
    }

    /**
     * Reemplaza el elemento en la posición especificada en esta lista con el Elemento especificado
     * @param index index of the element to replace
     * @param element elemento a almacenar en la posición especificada
     * @return El elemento previamente en la posición especificada
     */
    @Override
    public T set(int index, T element) {
        T prevEl = data.get(index);
        data.set(index, element);
        return prevEl;
    }

    /**
     * Inserta el elemento especificado en la posición especificada de esta lista
     * @param index índice en el que se inserta el elemento especificado
     * @param element elemento a insertar
     */
    @Override
    public void add(int index, T element) {
        data.add(index, element);
    }

    /**
     * Elimina el elemento en la posición especificada en esta lista
     * @param index el índice del elemento a eliminar
     * @return El elemento previamente en la posición especificada
     */
    @Override
    public T remove(int index) {
        return data.remove(index);
    }

    /**
     * Devuelve el índice de la primera ocurrencia del elemento especificado En esta lista, o -1 si esta lista no contiene el elemento
     * @param o elemento a buscar
     * @return el índice de la primera ocurrencia del elemento especificado en Esta lista, o -1 si esta lista no contiene el elemento
     */
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

    /**
     * Devuelve el índice de la última ocurrencia del elemento especificado En esta lista, o -1 si esta lista no contiene el elemento.
     * @param o  elemento a buscar
     * @return el índice de la última ocurrencia del elemento especificado en Esta lista, o -1 si esta lista no contiene el elemento
     */
    @Override
    public int lastIndexOf(Object o) {
        throwNoElementesNull(o);
        int index = 0;
        boolean Nofound = false;
        for(int i = 0; i < data.size();i++){
            if(data.get(i).equals(o)){
                index = i;
                Nofound = true;
            }
        }
        return Nofound? index: -1;
    }

    /**
     * Devuelve un iterador de lista sobre los elementos de esta lista
     * @return un iterador de lista sobre los elementos de esta lista
     */
    @Override
    public ListIterator<T> listIterator() {
        return data.listIterator();
    }

    /**
     * Devuelve un iterador de lista sobre los elementos de esta lista (apropiadamente secuencia), comenzando en la posición especificada en la lista.
     * @param index índice del primer elemento a devolver de la List iterator (mediante una llamada a next)
     * @return un iterador de lista sobre los elementos de esta lista (en la propia secuencia), comenzando en la posición especificada en la lista
     */
    @Override
    public ListIterator<T> listIterator(int index) {
        return data.listIterator(index);
    }

    /**
     * Devuelve una vista de la parte de esta lista entre la especificada fromIndex, inclusivo, y toIndex, exclusivo.
     * @param fromIndex  punto final bajo (inclusive) de la subLista
     * @param toIndex  punto final alto (exclusivo) de la subLista
     * @return una vista del rango especificado dentro de esta lista
     */
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

    /**
     * Concatena las dos colleciones en una nueva
     * @param l1 collecion a concatenar
     * @param l2 collecion a concatenar
     * @return nueva collecion,como union de las dos;
     *
     */
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
            throw new NullPointerException("Esta lista no acepta elementos vacíos");
        }
    }

    protected void throwNoCollecionNull(Object el) {
        if (el == null) {
            throw new NullPointerException("Esta lista no acepta elementos vacíos");
        }
    }
}
