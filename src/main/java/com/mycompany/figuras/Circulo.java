package com.mycompany.figuras;

public class Circulo extends Poligono {

    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return 2 * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo [centro=" + centro + ", radio=" + radio + "]";
    }
}
