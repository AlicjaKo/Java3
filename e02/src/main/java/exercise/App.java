package exercise;

// TODO 


public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 2014, 10, 5);
        car.accelerate();
        car.getSpeed();
        car.decelerate();
        car.getSpeed();
        car.accelerate();
        car.getSpeed();
        car.accelerate();
        car.getSpeed();
        car.accelerate();
        car.getSpeed();
        car.decelerate();
        car.getSpeed();

        car.getNumberOfDoors();

        Truck truck = new Truck("Man", "Red-one", 2020, 100, 2);
        truck.accelerate();
        truck.getSpeed();
        truck.decelerate();
        truck.getSpeed();
        truck.accelerate();
        truck.getSpeed();
        truck.decelerate();
        truck.getSpeed();
        truck.accelerate();

        truck.getNumAxles();
    }

}

class Vehicle {
    String make;
    String model;
    int year;
    int speed;

    Vehicle() {

    }

    public Vehicle(final String brand, String mod, int age, int fast) {
        this.make = brand;
        this.model = mod;
        this.year = age;
        this.speed = fast;
    }

    public void accelerate() {
        this.speed += 10;
    }
    public void decelerate () {
        this.speed -= 10;
    }
    int getSpeed() {
        return this.speed;
    }
    String getMake() {
        return this.make;
    }
    String getModel() {
        return this.model;
    }
    int getYear() {
        return this.year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(final String brand, String mod, int age, int fast, int num) {
        super.make = brand;
        super.model = mod;
        super.year = age;
        super.speed = fast;
        this.numDoors = num;
    }

    int getNumberOfDoors() {
        return this.numDoors;
    }
}


class Truck extends Vehicle {
    private int numAxels;

    public Truck(final String brand, String mod, int age, int fast, int num) {
        super.make = brand;
        super.model = mod;
        super.year = age;
        super.speed = fast;
        this.numAxels = num;
    }

    int getNumAxles() {
        return this.numAxels;
    }
}