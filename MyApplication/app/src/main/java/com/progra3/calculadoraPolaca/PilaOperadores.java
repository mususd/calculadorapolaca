package com.progra3.calculadoraPolaca;
public class PilaOperadores {
    private NodoOperador tope;
    public PilaOperadores() {
        tope = null;
    }
    public void insertar(String valor) {
        NodoOperador nuevo = new NodoOperador(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
    public String eliminar() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        String valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }
    public String verTope() {
        if (estaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        return tope.dato;
    }

    public boolean estaVacia() {
        return tope == null;
    }
}