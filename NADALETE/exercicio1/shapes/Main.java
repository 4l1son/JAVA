package shapes;

import InterfaceCalculable.Calculable;
import shapes.ShapeType;

public class Main {
    public static void main(String[] args) {
        Calculable square = ShapeFactory.createShape(ShapeType.SQUARE, 5);
        System.out.println("Área do quadrado: " + square.calcularArea());

        Calculable rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE, 4, 6);
        System.out.println("Área do retângulo: " + rectangle.calcularArea());

        Calculable circle = ShapeFactory.createShape(ShapeType.CIRCLE, 3);
        System.out.println("Área do círculo: " + circle.calcularArea());
    }
}