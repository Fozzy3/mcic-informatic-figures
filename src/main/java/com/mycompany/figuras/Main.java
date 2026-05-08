package com.mycompany.figuras;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        demoDesdePuntos();
        demoDesdeLineas();
    }

    // construir figuras desde Puntos ---
    private static void demoDesdePuntos() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(4, 3);
        Punto p4 = new Punto(2, 5);

        System.out.println("=== PUNTO ===");
        System.out.println(p1 + " | " + p2 + " | " + p3);

        System.out.println("\n=== LINEA ===");
        Linea linea = new Linea(p1, p2);
        System.out.println(linea + " | Longitud: " + linea.getLongitud());

        System.out.println("\n=== POLILINEA ===");
        Linea polilinea = new Linea(Arrays.asList(p1, p2, p3, p4));
        System.out.println(polilinea + " | Longitud: " + polilinea.getLongitud());

        System.out.println("\n=== CIRCULO ===");
        Circulo circulo = new Circulo(new Punto(1, 1), 5);
        System.out.println(circulo);
        System.out.println("Radio: " + circulo.getRadio() + " | Diametro: " + circulo.getDiametro());
        System.out.println("Area: " + circulo.getArea() + " | Perimetro: " + circulo.getPerimetro());

        System.out.println("\n=== TRIANGULO ===");
        Triangulo triangulo = new Triangulo(p1, p2, p3);
        System.out.println(triangulo);
        System.out.println("Area: " + triangulo.getArea() + " | Perimetro: " + triangulo.getPerimetro());

        System.out.println("\n=== POLIGONO CONVEXO (cuadrado) ===");
        PoligonoConvexo cuadrado = new PoligonoConvexo(Arrays.asList(
            new Punto(0, 0), new Punto(4, 0), new Punto(4, 4), new Punto(0, 4)
        ));
        System.out.println(cuadrado);
        System.out.println("Area: " + cuadrado.getArea() + " | Perimetro: " + cuadrado.getPerimetro());

        System.out.println("\n=== POLIGONO CONVEXO (pentagono) ===");
        PoligonoConvexo pentagono = new PoligonoConvexo(Arrays.asList(
            new Punto(2, 0), new Punto(4, 1.5), new Punto(3, 4),
            new Punto(1, 4), new Punto(0, 1.5)
        ));
        System.out.println(pentagono);
        System.out.println("Area: " + pentagono.getArea() + " | Perimetro: " + pentagono.getPerimetro());
    }

    // Triangulo construido desde 3 Lineas conectadas (cada linea es un lado)
    private static void demoDesdeLineas() {
        System.out.println("\n\n--- TRIANGULO DESDE LINEAS ---");

        // Los lados deben estar conectados: fin de uno = inicio del siguiente
        Linea base       = new Linea(new Punto(0, 0), new Punto(4, 0)); // (0,0) -> (4,0)
        Linea derecha    = new Linea(new Punto(4, 0), new Punto(4, 3)); // (4,0) -> (4,3)
        Linea hipotenusa = new Linea(new Punto(4, 3), new Punto(0, 0)); // (4,3) -> (0,0)

        Triangulo t = new Triangulo(base, derecha, hipotenusa);
        System.out.println(t);
        System.out.println("Area: " + t.getArea() + " | Perimetro: " + t.getPerimetro());
    }

}
