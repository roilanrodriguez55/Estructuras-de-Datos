package Stack;

import java.util.LinkedList;

/**
 *
 * @author roilanrodriguez55
 */
public class LinkedStack<E> implements StackInterface<E> {

    private Node<E> top;

    public LinkedStack() {
        this.top = null;
    }

    @Override
    public void Push(E info) {
        Node<E> newNode = new Node<>(info);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    @Override
    public E Top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getInfo();
        }
    }

    @Override
    public E Pop() {
        if (isEmpty()) {
            return null;
        } else {
            E aux = top.getInfo();
            top = top.getNext();
            return aux;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    public LinkedList<E> invertir(LinkedList<E> l) {
        LinkedStack<E> pila = new LinkedStack<>();
        LinkedList<E> lista = new LinkedList<>();
        for (int i = 0; i < l.size(); i++) {
            pila.Push(l.get(i));
        }
        for (E var : l) {
            lista.add(pila.Pop());
        }

        return lista;
    }

    public boolean VParentesis(LinkedList<E> l) {
        LinkedStack<E> pila = new LinkedStack<>();
        for (E var : l) {
            if (var.equals("(")) {
                pila.Push(var);
            } else if ((l.isEmpty()) || (pila.Pop().equals(")"))) {
                return false;
            }
        }
        return pila.isEmpty();
    }

    public boolean palindrome(String s) {
        LinkedStack<String> pila = new LinkedStack<>();
        s=s.replace(" ", "");
        s=s.replace("á", "a");
        s=s.replace("é", "e");
        s=s.replace("í", "i");
        s=s.replace("ó", "o");
        s=s.replace("ú", "u");
        
        for (int i = 0, j=s.length()-1; i < (s.length()-1)/2; i++,j--) {
            pila.Push(s.substring(i,i+1));
            if (!(pila.Pop().equalsIgnoreCase(s.substring(j, j+1)))) {
                return false;
            }
        }
        return pila.isEmpty();
    }
    
    public LinkedStack<Integer> reemplazar(LinkedStack<Integer> pila,int nuevo, int viejo  ){
        LinkedStack<Integer> pila1=new LinkedStack<>();
        while (!(pila.isEmpty())) {
            if (pila.Top()==viejo) {
                pila1.Push(nuevo);
                pila.Pop();
            }else{
                pila1.Push(pila.Pop());
            }
        }
        while (!(pila1.isEmpty())) {            
            pila.Push(pila1.Pop());
        }
        return pila;
    }

}
