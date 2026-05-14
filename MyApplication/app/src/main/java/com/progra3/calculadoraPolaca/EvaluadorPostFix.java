package com.progra3.calculadoraPolaca;

public class EvaluadorPostFix {
    public static double evaluar(String expresion) {
        Pila pila = new Pila();
        String[] tokens = expresion.trim().split("\\s+");
        for (String token : tokens) {
            if (esNumero(token)) {
                pila.insertar(Double.parseDouble(token));
            } else {
                if (pila.getTamanio() < 2) {
                    throw new RuntimeException("Expresión inválida");
                }
                double b = pila.eliminar();
                double a = pila.eliminar();
                double resultado;
                switch (token) {
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
                        throw new RuntimeException("Operador desconocido: " + token);
                }
                pila.insertar(resultado);
            }
        }

        if (pila.getTamanio() != 1) {
            throw new RuntimeException("Expresión mal formada");
        }
        return pila.eliminar();
    }

    private static boolean esNumero(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}