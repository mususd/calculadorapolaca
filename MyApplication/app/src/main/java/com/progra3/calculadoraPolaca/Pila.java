package com.progra3.calculadoraPolaca;
public class Pila {
    private Nodo tope;
    private int tamanio;
    public Pila() {
        tope = null;
        tamanio = 0;
    }

    public void insertar(double valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public double eliminar() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        double valor = tope.dato;
        tope = tope.siguiente;
        tamanio--;
        return valor;
    }

    public double verTope() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        return tope.dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }
    public int getTamanio() {
        return tamanio;
    }
}