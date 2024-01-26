package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {
    @Test
    void testVehicle() {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2000, 0);
        assertEquals("Toyota", vehicle.getMake());
        assertEquals("Corolla", vehicle.getModel());
        assertEquals(2000, vehicle.getYear());

        vehicle = new Vehicle("Honda", "Civic", 2005, 100);
        assertEquals("Honda", vehicle.getMake());
        assertEquals("Civic", vehicle.getModel());
        assertEquals(2005, vehicle.getYear());
    }
}