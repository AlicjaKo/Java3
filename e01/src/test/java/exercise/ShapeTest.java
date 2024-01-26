package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {
    @Test
    void testShape() {
        Shape shape = new Shape(4);
        assertEquals(4, shape.getNumberOfSides());

        shape = new Shape(6);
        assertEquals(6, shape.getNumberOfSides());
    }
}