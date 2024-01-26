package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    void testSquare() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
        assertEquals(20, square.getPerimeter());

        square = new Square(3);
        assertEquals(9, square.getArea());
        assertEquals(12, square.getPerimeter());
    }
}