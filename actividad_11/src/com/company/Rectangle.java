package com.company;

public class Rectangle implements Shape {

    private double altura;
    private double ancho;

    public Rectangle(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    @Override
    public double getArea() {
        return altura*ancho;
    }

    @Override
    public double getPerimeter() {
        return (altura*2)+(ancho*2);
    }
}
