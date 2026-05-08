# mcic-informatic-figures

Ejercicio de POO en Java — modelado de figuras geométricas con jerarquía de clases y diagrama UML.

## Clases

| Clase | Tipo | Descripción |
|-------|------|-------------|
| `Punto` | Clase | Coordenada 2D (x, y). Calcula distancia a otro punto. |
| `Linea` | Clase | Polilínea de 2 o más puntos. Calcula longitud total. |
| `Poligono` | Abstracta | Base para figuras cerradas. Define `getArea()` y `getPerimetro()`. |
| `Circulo` | extiende `Poligono` | Centro (Punto) + radio. |
| `Triangulo` | extiende `Poligono` | 3 vértices. Área por fórmula de Herón. Acepta 3 `Punto`s o 3 `Linea`s conectadas. |
| `PoligonoConvexo` | extiende `Poligono` | N vértices (mín. 3). Área por triangulación desde el vértice 0. |

## Diagrama de clases

El archivo `diagrama-clases.drawio` contiene el diagrama UML completo. Abrilo en [draw.io](https://app.diagrams.net) con **File → Open from → Device**.

## Ejecutar

Requiere NetBeans con Maven. Abrí el proyecto y ejecutá con **Run Project**.

```
src/main/java/com/mycompany/figuras/Main.java  ← punto de entrada
```

El `Main` demuestra dos enfoques:
- Construir figuras desde `Punto`s directamente
- Construir un `Triangulo` desde 3 `Linea`s conectadas
