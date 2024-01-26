package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {
    @Test
    void testTruck() {
        Truck truck = new Truck("Ford", "F-150", 2015, 100, 2);
        assertEquals("Ford", truck.getMake());
        assertEquals("F-150", truck.getModel());
        assertEquals(2015, truck.getYear());
        assertEquals(2, truck.getNumAxles());

        truck = new Truck("RAM", "1500 TRX", 2022, 150, 2);
        assertEquals(2, truck.getNumAxles());
    }
}