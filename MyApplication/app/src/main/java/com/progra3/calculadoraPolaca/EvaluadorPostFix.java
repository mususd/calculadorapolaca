package com.progra3.calculadoraPolaca;
public class EvaluadorPostFix {
    public static double operar(Pila pila, String operador) {
        if (pila.getTamanio() < 2) {
            throw new RuntimeException("Operandos insuficientes");
        }
        double b = pila.eliminar();
        double a = pila.eliminar();
        double resultado;
        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new RuntimeException("División entre cero");
                }
                resultado = a / b;
                break;
            case "%":
                if (b == 0) {
                    throw new RuntimeException("Módulo entre cero");
                }
                resultado = a % b;
                break;
            case "^":
                resultado = Math.pow(a, b);
                break;
            default:
                throw new RuntimeException("Operador inválido");
        }
        pila.insertar(resultado);
        return resultado;
    }
}