# Arquitectura del Proyecto

## Nombre del Proyecto
Calculadora de Notación Postfix usando Pilas LIFO

---

# Objetivo General

Desarrollar una aplicación móvil capaz de resolver expresiones
matemáticas en notación postfix (polaca inversa) mediante la
implementación manual de una pila enlazada (LIFO), sin utilizar
estructuras de pila incorporadas en librerías externas.

---

# Arquitectura General

El proyecto estará dividido en módulos independientes para
separar la lógica de estructuras de datos, el procesamiento
matemático y la interfaz gráfica.

---

# Estructura del Proyecto

/src
    /logic
        Nodo.java
        Pila.java
        EvaluadorPostfix.java
        ConversorPostfix.java

    /ui
        MainActivity.java

/docs
/mockups

---

# Descripción de Componentes

## Nodo.java

Representa un nodo individual dentro de la pila enlazada.

Responsabilidades:
- almacenar un dato numérico
- apuntar al siguiente nodo

---

## Pila.java

Implementación manual de una pila LIFO utilizando nodos enlazados.

Responsabilidades:
- insertar elementos
- eliminar elementos
- consultar el elemento superior
- verificar si la pila está vacía

Restricciones:
- no utilizar Stack de Java
- no utilizar push() o pop() de librerías

---

## EvaluadorPostfix.java

Responsable de resolver expresiones en notación postfix.

Responsabilidades:
- leer tokens de la expresión
- operar usando la pila manual
- retornar el resultado final

---

## ConversorPostfix.java

Responsable de convertir expresiones infix a postfix.

Ejemplo:
(5 + 3) * 2
→
5 3 + 2 *

---

## MainActivity.java

Interfaz principal de la aplicación Android.

Responsabilidades:
- capturar expresiones
- mostrar resultados
- visualizar operaciones de pila

---

# Flujo General del Sistema

Usuario ingresa expresión
↓
Conversión a postfix
↓
Evaluación usando pila
↓
Resultado final
↓
Visualización en interfaz

---

# Tecnologías

- Java
- Android Studio
- Git y GitHub

---

# Estructura de Datos Principal

Pila enlazada tipo LIFO.

La pila será implementada manualmente utilizando nodos enlazados.

---

# Objetivo Académico

Aplicar estructuras de datos mediante la implementación manual
de pilas enlazadas para resolver expresiones matemáticas en
notación postfix.
