package com.progra3.calculadoraPolaca;

import java.util.HashMap;
import java.util.Map;

public class ConversorPostfix {

    private static Map<String, Integer> precedencia() {

        Map<String, Integer> p = new HashMap<>();
        p.put("+", 1);
        p.put("-", 1);
        p.put("*", 2);
        p.put("/", 2);
        p.put("%", 2);
        p.put("^", 3);
        return p;
    }

    public static String convertir(String infix) {
        Map<String, Integer> prec = precedencia();
        PilaOperadores pila = new PilaOperadores();
        StringBuilder salida = new StringBuilder();
        String expresion = infix.replaceAll("\\s+", "");
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            // NÚMEROS
            if (Character.isDigit(c) || c == '.') {
                StringBuilder numero = new StringBuilder();
                while (i < expresion.length()
                        && (Character.isDigit(expresion.charAt(i))
                        || expresion.charAt(i) == '.')) {
                    numero.append(expresion.charAt(i));
                    i++;
                }
                i--;
                salida.append(numero).append(" ");
            }

            // PARÉNTESIS IZQUIERDO
            else if (c == '(') {
                pila.insertar(String.valueOf(c));
            }
            // PARÉNTESIS DERECHO
            else if (c == ')') {
                while (!pila.estaVacia()
                        && !pila.verTope().equals("(")) {
                    salida.append(pila.eliminar()).append(" ");
                }
                if (!pila.estaVacia()) {
                    pila.eliminar();
                }
            }

            // OPERADORES
            else {
                String op = String.valueOf(c);
                while (!pila.estaVacia()
                        && prec.containsKey(pila.verTope())
                        && prec.get(pila.verTope()) >= prec.get(op)) {
                    salida.append(pila.eliminar()).append(" ");
                }
                pila.insertar(op);
            }
        }
        while (!pila.estaVacia()) {
            salida.append(pila.eliminar()).append(" ");
        }
        return salida.toString().trim();
    }
}