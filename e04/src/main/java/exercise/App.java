package exercise;

// TODO

public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(String[] args) {

    }
}

class Hardware {
    String manufacterer;
    String model;

    Hardware () {

    }
    Hardware(final String brand, String mod){
        this.manufacterer = brand;
        this.model = mod;
    }
}

class CPU extends Hardware {
    double speed;

    CPU(final String brand, String mod, double fast) {
        this.speed = fast;
        super.manufacterer = brand;
        super.model = mod;
    }
    CPU(double fast) {
        this.speed = fast;
    }
    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        return "Manufacter: " + super.manufacterer + "Model: " + super.model + "Speed: "+ this.speed;
    }

}

class GPU extends Hardware {
    double memory;

    GPU(final String brand, String mod, double memo) {
        this.memory = memo;
        super.manufacterer = brand;
        super.model = mod;
    }
    GPU(double memo) {
        this.memory = memo;
    }

    public double getMemory() {
        return this.memory;
    }
    public String toString() {
        return "Manufacter: " + super.manufacterer + "Model: " + super.model + "Memory: "+ this.memory;
    }
}

class RAM extends Hardware {
    double capacity;

    RAM(final String brand, String mod, double capac) {
        this.capacity = capac;
        super.manufacterer = brand;
        super.model = mod;
    }
    RAM(double capac) {
        this.capacity = capac;
    }

    public double getCapacity() {
        return this.capacity;
    }
    public String toString() {
        return "Manufacter: " + super.manufacterer + "Model: " + super.model + "Capacity: "+ this.capacity;
    }
}

class Storage extends Hardware {
    double capacity;

    Storage(final String brand, String mod, double capac) {
        this.capacity = capac;
        super.manufacterer = brand;
        super.model = mod;
    }
    Storage(double capac){
        this.capacity = capac;
    }


    public double getCapacity() {
        return this.capacity;
    }
    public String toString() {
        return "Manufacter: " + super.manufacterer + "Model: " + super.model + "Capacity: "+ this.capacity;
    }
}

class Computer {
    CPU cpu = new CPU("Intel", "XP", 4);
    GPU gpu = new GPU("Nivida", "8IP", 8);
    RAM ram = new RAM("Cort", "1999", 10);
    Storage storage = new Storage("Delia", "KK", 256);

    Computer(CPU c, GPU g, RAM r, Storage s) {
        this.cpu = c;
        this.gpu = g;
        this.ram = r;
        this.storage = s;
    }
    Computer(){
        
    }

    double getTotalMemory() {
        return gpu.getMemory()+ram.getCapacity();
    }
    double getTotalCapacity() {
        return storage.getCapacity()+ram.getCapacity();
    }

    public String toString() {
        return "CPU: " + this.cpu + "GPU: " + this.gpu + "RAM: "+ this.ram + "Storage: " +this.storage;
    }
}

class ComputerDriver {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.getTotalCapacity();
        computer.getTotalMemory();
    }
}