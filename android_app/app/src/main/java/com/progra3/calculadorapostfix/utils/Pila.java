package com.progra3.calculadorapostfix.utils;

public class Pila<T> {
    private Nodo<T> cima;
    private int size;

    public Pila() {
        cima = null;
        size = 0;
    }

    // PUSH
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        size++;
    }

    // POP
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }

        T dato = cima.getDato();
        cima = cima.getSiguiente();
        size--;
        return dato;
    }

    // PEEK
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }
        return cima.getDato();
    }

    // ISEMPTY
    public boolean isEmpty() {
        return cima == null;
    }

    // SIZE
    public int size() {
        return size;
    }

    // CLEAR
    public void clear() {
        cima = null;
        size = 0;
    }
}