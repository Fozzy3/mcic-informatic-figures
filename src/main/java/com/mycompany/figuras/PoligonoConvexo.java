package com.mycompany.figuras;

import java.util.ArrayList;
import java.util.List;

public class PoligonoConvexo extends Poligono {

    private List<Punto> vertices;

    public PoligonoConvexo(List<Punto> vertices) {
        if (vertices.size() < 3) {
            throw new IllegalArgumentException("Un poligono necesita al menos 3 vertices.");
        }
        this.vertices = new ArrayList<>(vertices);
    }

    public List<Punto> getVertices() {
        return vertices;
    }

    @Override
    public double getArea() {
        // Suma de areas de triangulos formados desde el primer vertice
        double areaTotal = 0;
        Punto origen = vertices.get(0);
        for (int i = 1; i < vertices.size() - 1; i++) {
            Triangulo t = new Triangulo(origen, vertices.get(i), vertices.get(i + 1));
            areaTotal += t.getArea();
        }
        return areaTotal;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        for (int i = 0; i < vertices.size(); i++) {
            Punto actual = vertices.get(i);
            Punto siguiente = vertices.get((i + 1) % vertices.size());
            perimetro += actual.distanciaA(siguiente);
        }
        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PoligonoConvexo [");
        for (int i = 0; i < vertices.size(); i++) {
            sb.append(vertices.get(i));
            if (i < vertices.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
