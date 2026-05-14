# Calculadora Postfix e Infix – Programación III

Aplicación Android desarrollada en Java que permite:

- Convertir expresiones Infix a Postfix.
- Evaluar expresiones Postfix.
- Visualizar el funcionamiento interno de una pila dinámica.
- Mostrar paso a paso las operaciones realizadas.
- Implementar estructuras de datos utilizando listas enlazadas.

---

# Descripción General

El proyecto consiste en el desarrollo de una aplicación Android capaz de:

- Evaluar expresiones matemáticas en notación Postfix.
- Convertir expresiones Infix a Postfix.
- Mostrar el procedimiento paso a paso del uso de la pila.
- Implementar pilas dinámicas utilizando listas enlazadas.
- Validar errores matemáticos y sintácticos.

La aplicación fue desarrollada en Java utilizando Android Studio.

---

# FASE 1 – Análisis del Problema

## Problema identificado

Muchos estudiantes presentan dificultades para comprender:

- El funcionamiento de las pilas.
- La evaluación de expresiones postfix.
- La conversión de expresiones infix a postfix.
- El comportamiento LIFO (Last In, First Out).

Por ello se desarrolló una aplicación interactiva que permita visualizar el proceso completo de conversión y evaluación.

---

## Objetivo General

Desarrollar una aplicación Android capaz de convertir y evaluar expresiones matemáticas utilizando pilas dinámicas implementadas manualmente.

---

## Objetivos Específicos

- Implementar una pila dinámica usando listas enlazadas.
- Convertir expresiones infix a postfix.
- Evaluar expresiones postfix.
- Mostrar paso a paso el funcionamiento interno de la pila.
- Implementar manejo de errores matemáticos.
- Crear una interfaz amigable para el usuario.

---

## Requerimientos Funcionales

- Ingresar expresiones matemáticas.
- Convertir expresiones infix a postfix.
- Evaluar expresiones postfix.
- Mostrar resultados.
- Mostrar procedimiento paso a paso.
- Limpiar la interfaz.
- Soportar operadores:
  - `+`
  - `-`
  - `*`
  - `/`
  - `^`
  - `%`

---

## Requerimientos No Funcionales

- Interfaz intuitiva.
- Código modular.
- Respuesta rápida.
- Manejo de excepciones.
- Compatibilidad con Android.

---

# FASE 2 – Diseño del Sistema

## Arquitectura del Proyecto

```text
com.progra3.myapplication
│
├── ui
│    └── MainActivity.java
│
├── logic
│    ├── ConversorPostfix.java
│    └── EvaluadorPostFix.java
│
├── models
│    ├── Nodo.java
│    ├── NodoOperador.java
│    ├── Pila.java
│    └── PilaOperadores.java
```

---

## Clases del Proyecto

| Clase | Función |
|---|---|
| MainActivity | Interfaz gráfica |
| ConversorPostfix | Conversión infix → postfix |
| EvaluadorPostFix | Evaluación postfix |
| Pila | Pila dinámica numérica |
| Nodo | Nodo numérico |
| PilaOperadores | Pila dinámica de operadores |
| NodoOperador | Nodo de operadores |

---

## Diseño de Pilas

Se implementaron pilas dinámicas utilizando listas enlazadas.

### Características

- Inserción dinámica.
- Eliminación dinámica.
- Manejo de tope.
- No se utilizó `Stack` de Java.
- Implementación manual de estructuras.

---

# FASE 3 – Desarrollo del Sistema

## Conversión Infix → Postfix

La conversión fue implementada utilizando:

- Prioridad de operadores.
- Manejo de paréntesis.
- Pila de operadores.

---

## Prioridad de Operadores

| Operador | Prioridad |
|---|---|
| `+ -` | 1 |
| `* / %` | 2 |
| `^` | 3 |

---

## Ejemplo de Conversión

### Entrada Infix

```text
(5+3)*2^2
```

### Salida Postfix

```text
5 3 + 2 2 ^ *
```

---

## Evaluación Postfix

El algoritmo realiza:

1. Lectura de tokens.
2. Inserción de números en pila.
3. Extracción de operandos.
4. Aplicación de operadores.
5. Inserción de resultados parciales.

---

## Operadores Soportados

| Operador | Descripción |
|---|---|
| `+` | Suma |
| `-` | Resta |
| `*` | Multiplicación |
| `/` | División |
| `%` | Módulo |
| `^` | Potencia |

---

## Visualización Paso a Paso

La aplicación muestra:

- Inserciones en pila.
- Operaciones realizadas.
- Resultados parciales.
- Estado del tope.

---

# FASE 4 – Pruebas del Sistema

## Casos de Prueba

| Expresión | Resultado |
|---|---|
| `5+3*2` | `11` |
| `(5+3)*2` | `16` |
| `10%3` | `1` |
| `2^3` | `8` |
| `(8+2)*5` | `50` |

---

## Manejo de Errores

Errores implementados:

- División entre cero.
- Módulo entre cero.
- Expresión inválida.
- Pila vacía.
- Operador desconocido.
- Expresión mal formada.

---

# FASE 5 – Implementación de Interfaz

## Características visuales

- Tema oscuro.
- Diseño moderno.
- Botones interactivos.
- Interfaz responsive.
- Resultados visuales claros.

---

## Ejemplos de Uso

### Infix

```text
(5+3)*2
```

### Postfix

```text
5 3 + 2 *
```

Importante:

- Infix se ingresa sin espacios.
- Postfix se ingresa con espacios.

---

# UML DEL SISTEMA

El sistema fue modelado utilizando diagramas UML para representar:

- Relaciones entre clases.
- Responsabilidades.
- Estructura de pilas dinámicas.
- Flujo general del sistema.

---

# FASE 6 – Conclusiones

- Se implementó correctamente una pila dinámica usando listas enlazadas.
- La aplicación convierte expresiones infix a postfix correctamente.
- El evaluador postfix procesa operaciones matemáticas adecuadamente.
- El sistema permite visualizar el comportamiento interno de la pila.
- El proyecto demuestra la aplicación práctica de estructuras de datos en Android.

---

# FASE 7 – Mejoras Futuras

- Soporte para variables.
- Historial de operaciones.
- Funciones trigonométricas.
- Mejoras visuales con Material Design.
- Animaciones del comportamiento de la pila.
- Soporte para más operadores matemáticos.

---

# Tecnologías Utilizadas

- Java
- Android Studio
- XML
- Programación Orientada a Objetos
- Estructuras de Datos
- Pilas Dinámicas

Integrantes:
- Diego Musus
- Wilder Canel
- Luisa Carrillo
- Hory Lopez
- Horacio Bernal
