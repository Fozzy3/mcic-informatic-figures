package com.mycompany.figuras;

public class Triangulo extends Poligono {

    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Constructor desde 3 lineas: cada linea es un lado del triangulo.
    // Los lados deben estar conectados: fin de l1 = inicio de l2, fin de l2 = inicio de l3.
    public Triangulo(Linea l1, Linea l2, Linea l3) {
        Punto fin1 = l1.getPuntos().get(l1.getPuntos().size() - 1);
        Punto inicio2 = l2.getPuntos().get(0);
        Punto fin2 = l2.getPuntos().get(l2.getPuntos().size() - 1);
        Punto inicio3 = l3.getPuntos().get(0);
        Punto fin3 = l3.getPuntos().get(l3.getPuntos().size() - 1);
        Punto inicio1 = l1.getPuntos().get(0);

        if (fin1.distanciaA(inicio2) > 1e-9 || fin2.distanciaA(inicio3) > 1e-9 || fin3.distanciaA(inicio1) > 1e-9) {
            throw new IllegalArgumentException("Las lineas no forman un triangulo cerrado.");
        }

        this.p1 = inicio1;
        this.p2 = inicio2;
        this.p3 = inicio3;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        // Formula de Heron
        double a = p1.distanciaA(p2);
        double b = p2.distanciaA(p3);
        double c = p3.distanciaA(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimetro() {
        return p1.distanciaA(p2) + p2.distanciaA(p3) + p3.distanciaA(p1);
    }

    @Override
    public String toString() {
        return "Triangulo [" + p1 + ", " + p2 + ", " + p3 + "]";
    }
}
