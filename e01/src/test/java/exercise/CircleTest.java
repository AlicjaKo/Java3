package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CircleTest {
    @Test
    void testCircle() {
        Circle circle = new Circle(7);
        assertEquals(153, circle.getArea());
        assertEquals(43, circle.getPerimeter());
        
        circle = new Circle(5);
        assertEquals(78, circle.getArea());
        assertEquals(31, circle.getPerimeter());
    }
}