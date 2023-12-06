// AreaCheckerTest.java
package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.Assertions.assertEquals;

import org.junit.jupiter.Assertions;

public class AreaCheckerTest {

    @Test
    public void testCalcularArea() {
        ShapeFactory squareFactory = new ShapeFactory(5);
        Calculable square = squareFactory.createShape();
        assertEquals(25, square.calcularArea(), 0.001);

        ShapeFactory rectangleFactory = new RectangleFactory(4, 6);
        Calculable rectangle = rectangleFactory.createShape();
        assertEquals(24, rectangle.calcularArea(), 0.001);

        // Adicione testes para as outras figuras geométricas aqui
    }
}