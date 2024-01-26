package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputerTest {
    @Test
    public void testGetTotalMemory() {
        CPU cpu = new CPU("Intel", "i7-9700K", 3.6);
        GPU gpu = new GPU("Nvidia", "GTX 1080", 8);
        RAM ram = new RAM("Corsair", "Vengance LPX", 8);
        Storage storage = new Storage("Samsung", "970 EVO Plus", 512);
        Computer computer = new Computer(cpu, gpu, ram, storage);
        double expected = 16;
        double actual = computer.getTotalMemory();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testGetTotalCapacity() {
        CPU cpu = new CPU("Intel", "i7-9700K", 3.6);
        GPU gpu = new GPU("Nvidia", "GTX 1080", 8);
        RAM ram = new RAM("Corsair", "Vengance LPX", 8);
        Storage storage = new Storage("Samsung", "970 EVO Plus", 512);
        Computer computer = new Computer(cpu, gpu, ram, storage);
        double expected = 520;
        double actual = computer.getTotalCapacity();
        assertEquals(expected, actual, 0);
    }
}