# Roadmap del Proyecto

## Fecha de Entrega
23 de mayo

---



# Fase 1 — Planeación del proyecto

## Actividades
1. Definir objetivo de la calculadora postfix  
2. Analizar requerimientos del proyecto  
3. Crear repositorio GitHub  
4. Configurar ramas (`main`, `develop`)  
5. Crear documentación inicial:
   - README
   - arquitectura
   - roadmap
   - requisitos

## Responsables
- Musus
✅
---

# Fase 2 — Diseño de arquitectura

## Actividades
1. Crear packages:
   - ui
   - logic
   - model
   - utils
2. Definir responsabilidades de clases  
3. Crear clases vacías  
4. Diseñar flujo del sistema  
5. Crear UML completo  
6. Definir relaciones entre clases  
7. Definir estructura de datos manual (Pila + Nodo)

## Responsables
- Musus
✅
---

# Fase 3 — Implementación de estructuras de datos

## Actividades
1. Crear clase `Nodo<T>`  
2. Crear clase `Pila<T>`  
3. Implementar:
   - push
   - pop
   - peek
   - isEmpty
   - size
   - clear
4. Probar funcionamiento de la pila

## Responsables
- Musus
✅
---

# Fase 4 — Implementación de modelos

## Actividades
1. Crear enum `Operacion`
2. Definir operadores:
   - suma
   - resta
   - multiplicación
   - división
3. Crear clase `Historial`
4. Implementar almacenamiento de operaciones

## Responsables
- Musus
- Horacio
---

# Fase 5 — Implementación del tokenizador

## Actividades
1. Crear separación de tokens  
2. Detectar números  
3. Detectar operadores  
4. Manejar espacios  
5. Validar delimitadores  
6. Probar tokenización

## Responsables
- Musus
- Wilder

---

# Fase 6 — Implementación del validador

## Actividades
1. Validar expresión vacía  
2. Validar operadores válidos  
3. Validar números  
4. Validar sintaxis  
5. Validar caracteres inválidos  
6. Manejar errores matemáticos

## Responsables
- Musus
- Hory

---

# Fase 7 — Implementación de la calculadora postfix

## Actividades
1. Evaluar tokens  
2. Implementar algoritmo LIFO  
3. Implementar evaluación postfix  
4. Aplicar operaciones matemáticas  
5. Integrar pila manual  
6. Validar resultados

## Responsables
- Luisa
- Musus

---

# Fase 8 — Desarrollo de interfaz gráfica

## Actividades
1. Crear `activity_main.xml`
2. Agregar:
   - EditText
   - TextView
   - Buttons
3. Diseñar layout  
4. Conectar botones  
5. Mostrar resultados  
6. Mostrar errores

## Responsables
- Luisa
- Musus
- Horacio

---

# Fase 9 — Integración del sistema

## Actividades
1. Conectar UI con lógica  
2. Conectar calculadora con tokenizador  
3. Conectar calculadora con validador  
4. Conectar historial  
5. Validar flujo completo

## Responsables
- Todos

---

# Fase 10 — Testing y depuración

## Actividades
1. Probar operaciones básicas  
2. Probar expresiones inválidas  
3. Probar errores matemáticos  
4. Corregir bugs  
5. Optimizar código  
6. Revisar arquitectura

## Responsables
- Todos

---

# Fase 11 — Documentación final

## Actividades
1. Actualizar README  
2. Agregar UML final  
3. Explicar arquitectura  
4. Documentar clases  
5. Agregar capturas  
6. Agregar instrucciones de ejecución

## Responsables
- Todos

---

# Fase 12 — Entrega final

## Actividades
1. Revisar requerimientos  
2. Generar APK  
3. Hacer commit final  
4. Push a GitHub  
5. Preparar exposición  
6. Explicar:
   - UML
   - Pila manual
   - algoritmo postfix
   - flujo del sistema

## Responsables
- Todos

---

# Fase 13 — Presentación Final

## Objetivos
- Preparar explicación
- Preparar demostración
- Preparar diapositivas

## Responsables
- Todos
