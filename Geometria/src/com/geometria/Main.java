package com.geometria;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.printf("Área do Quadrado: %.2f\n", quadrado.calcularArea());

        Retangulo retangulo = new Retangulo(4, 6);
        System.out.printf("Área do Retângulo: %.2f\n", retangulo.calcularArea());

        Circulo circulo = new Circulo(3);
        System.out.printf("Área do Círculo: %.2f\n", circulo.calcularArea());
    }
}