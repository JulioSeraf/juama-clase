package org.example;

public class NodeList<E> {

    private static class Node<E> {
        public E element;
        public Node<E> next;
    }

    private Node<E> first;

}
