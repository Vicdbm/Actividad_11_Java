package com.company;
import java.lang.Math;

public class RectangleTriangle implements Shape {

    private double hipotenusa;
    private double catetoA;
    private double catetoB;

    public RectangleTriangle(double catetoA, double catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = calculateHipotenusa();
    }

    public void setCatetoA(double catetoA) {
        this.catetoA = catetoA;
    }

    public double getCatetoA() {
        return catetoA;
    }

    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }

    public double getCatetoB() {
        return catetoB;
    }

    public void setHipotenusa() {
        this.hipotenusa = calculateHipotenusa();
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public double calculateHipotenusa() {
        return Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
    }

    @Override
    public double getArea() {
        return catetoA*catetoB/2;
    }

    @Override
    public double getPerimeter() {
        return hipotenusa+catetoA+catetoB;
    }
}
