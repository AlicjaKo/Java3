package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CarTest {
    @Test
    void testCar() {
        Car car = new Car("Toyota", "Camry", 2010, 100, 4);
        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2010, car.getYear());
        assertEquals(4, car.getNumberOfDoors());

        car = new Car("Toyota", "Corolla", 2022, 150, 2);
        assertEquals(2, car.getNumberOfDoors());
    }
}