package com.company;

public class Circle implements Shape {
    private double radio;
    public static final double PI = 3.141592;

    public Circle(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return PI*radio*radio;
    }

    @Override
    public double getPerimeter() {
        return PI*radio*2;
    }
}
