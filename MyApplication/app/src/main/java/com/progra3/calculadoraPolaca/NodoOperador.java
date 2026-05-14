package com.progra3.calculadoraPolaca;
public class NodoOperador {
    String dato;
    NodoOperador siguiente;
    public NodoOperador(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}