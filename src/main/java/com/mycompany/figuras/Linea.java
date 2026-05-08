package com.mycompany.figuras;

import java.util.ArrayList;
import java.util.List;

public class Linea {

    private List<Punto> puntos;

    public Linea(Punto p1, Punto p2) {
        this.puntos = new ArrayList<>();
        this.puntos.add(p1);
        this.puntos.add(p2);
    }

    public Linea(List<Punto> puntos) {
        if (puntos.size() < 2) {
            throw new IllegalArgumentException("Una linea necesita al menos 2 puntos.");
        }
        this.puntos = new ArrayList<>(puntos);
    }

    public void agregarPunto(Punto p) {
        this.puntos.add(p);
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public double getLongitud() {
        double longitud = 0;
        for (int i = 0; i < puntos.size() - 1; i++) {
            longitud += puntos.get(i).distanciaA(puntos.get(i + 1));
        }
        return longitud;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Linea [");
        for (int i = 0; i < puntos.size(); i++) {
            sb.append(puntos.get(i));
            if (i < puntos.size() - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
