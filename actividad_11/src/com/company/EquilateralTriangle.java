package com.company;

public class EquilateralTriangle implements Shape {

    private double lado;
    private double altura;

    public EquilateralTriangle(double lado) {
        this.lado = lado;
        this.altura = calculateAltura();
    }

    public void setLado(double lado) {
        this.lado = lado;
        this.altura = calculateAltura();
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    private double calculateAltura() {
        return (Math.sqrt(3) * this.lado) / 2;
    }

    @Override
    public double getArea() {
        return (lado*altura)/2;
    }

    @Override
    public double getPerimeter() {
        return lado*3;
    }
}
