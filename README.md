# README.md

# Calculadora Postfix

Aplicación Android desarrollada en Java que implementa una calculadora postfix utilizando una estructura de datos tipo pila enlazada manual.

---

# Características

- Implementación manual de pila enlazada
- Operaciones postfix
- Interfaz gráfica estilo calculadora
- Visualización de la pila en tiempo real
- Operaciones soportadas:
  - suma
  - resta
  - multiplicación
  - división
  - módulo
  - potencia

---

# Estructura del proyecto

## Clases principales

### `Nodo.java`
Representa un nodo de la pila enlazada.

### `Pila.java`
Implementa la estructura de pila manual.

### `EvaluadorPostFix.java`
Realiza las operaciones matemáticas postfix.

### `MainActivity.java`
Controla la interfaz gráfica y eventos de botones.

---

# Funcionamiento

La calculadora trabaja utilizando el algoritmo LIFO (Last In First Out).

## Ejemplo

```text
5 ENTER
3 ENTER
+
```

Resultado:

```text
8
```

Proceso interno:

1. Se inserta 5 en la pila
2. Se inserta 3 en la pila
3. Se extraen ambos valores
4. Se realiza la suma
5. El resultado vuelve a insertarse en la pila

---

# Tecnologías utilizadas

- Java
- Android Studio
- XML

---

# Integrantes

- Musus
- Horacio
- Luisa
- Wilder
- Hory