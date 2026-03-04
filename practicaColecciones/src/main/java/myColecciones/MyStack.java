/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myColecciones;
/**
 *
 * @author tarde
 */
public class MyStack<E> {
    private final MyList<E> pila;
    public MyStack(){
        this.pila = new MyList<>();
    }
    public boolean empty(){
        return pila.isEmpty();
    }
    
    public E push(E item){
        pila.add(item);
        return item;
    }
    public E pop(){
        return pila.remove(pila.size()-1);
    }
    public E peek(){
        return pila.get(pila.size()-1);
    }
    public int search(E o){
        int posicion = 0;
        if(!pila.contains(o)) return -1;
        for(int i = pila.size();i >= 1; i--){
            if(!pila.get(i-1).equals(o)){ 
                posicion++;
            }else{
                break;
            }
        }
       return posicion;
    }
    
}
