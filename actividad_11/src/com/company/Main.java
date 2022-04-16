package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean area = false;
        boolean perimetro = false;
        boolean opcionValida;
        char queCalcular;
        char queFigura;
        double resultado = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("¿Qué quieres calcular? \na)Área \nb)Perimetro");
            queCalcular = scanner.next().toLowerCase().charAt(0);

            switch (queCalcular) {
                case 'a':
                    area = true;
                    opcionValida = true;
                    break;
                case 'b':
                    perimetro = true;
                    opcionValida = true;
                    break;
                default:
                    System.out.println("Selecciona \"a\" o \"b\"");
                    opcionValida = false;
                    break;
            }
        } while (!opcionValida);

        do {
            System.out.println("¿Qué figura quieres calcular? \na) Circulo \nb) Cuadrado \nc) Rectángulo" +
                    "\nd)Triángulo Equilátero \ne) Triángulo Rectángulo");
            queFigura = scanner.next().toLowerCase().charAt(0);

            switch (queFigura) {
                case 'a':
                    System.out.println("En cm ¿cuál es el radio del circulo?");
                    double radio = scanner.nextDouble();
                    Circle circulo = new Circle(radio);

                    if (area) resultado = circulo.getArea();
                    if (perimetro) resultado = circulo.getPerimeter();
                    opcionValida = true;
                    break;

                case 'b':
                    System.out.println("En cm ¿cuál es la longitud del lado?");
                    double lado = scanner.nextDouble();
                    Square cuadrado = new Square(lado);

                    if (area) resultado = cuadrado.getArea();
                    if (perimetro) resultado = cuadrado.getPerimeter();
                    opcionValida = true;
                    break;

                case 'c':
                    System.out.println("En cm ¿cuál es la altura del rectángulo?");
                    double altura = scanner.nextDouble();
                    System.out.println("En cm ¿cuál es el ancho del rectángulo?");
                    double ancho = scanner.nextDouble();
                    Rectangle rectangulo = new Rectangle(altura, ancho);

                    if (area) resultado = rectangulo.getArea();
                    if (perimetro) resultado = rectangulo.getPerimeter();
                    opcionValida = true;
                    break;

                case 'd':
                    System.out.println("En cm ¿cuál es la longitud del lado del triángulo?");
                    double side = scanner.nextDouble();
                    EquilateralTriangle triangulo = new EquilateralTriangle(side);

                    if (area) resultado = triangulo.getArea();
                    if (perimetro) resultado = triangulo.getPerimeter();
                    opcionValida = true;
                    break;

                case 'e':
                    System.out.println("En cm ¿cuánto mide el primer cateto?");
                    double catetoA = scanner.nextDouble();
                    System.out.println("En cm ¿cuánto mide el segundo cateto?");
                    double catetoB = scanner.nextDouble();
                    RectangleTriangle rectangleTriangle = new RectangleTriangle(catetoA, catetoB);

                    if (area) resultado = rectangleTriangle.getArea();
                    if (perimetro) resultado = rectangleTriangle.getPerimeter();
                    opcionValida = true;
                    break;

                default:
                    System.out.println("Opción no valida, escoge \"a\", \"b\", \"c\", \"d\" o \"e\"");
                    opcionValida = false;
                    break;
            }
        } while (!opcionValida);

        System.out.println(resultado);
    }
}
