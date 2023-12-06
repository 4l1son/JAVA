package shapes;

import InterfaceCalculable.Calculable;
import factories.Circle;
import factories.Rectangle;
import factories.Square;

public class ShapeFactory {
    public static Calculable createShape(ShapeType shapeType, double... params) {
        switch (shapeType) {
            case SQUARE:
                return new Square(params[0]);
            case RECTANGLE:
                return new Rectangle(params[0], params[1]);
            case CIRCLE:
                return new Circle(params[0]);
            default:
                throw new IllegalArgumentException("ShapeType não suportado: " + shapeType);
        }
    }
}