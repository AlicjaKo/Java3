package exercise;



public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(String[] args) {
        Square s = new Square(4);
        s.setSideLength(5);
        System.out.println("Area of the square: "+s.getArea());
        System.out.println("Perimeter of the square: "+s.getPerimeter());

        Circle c = new Circle(4);
        c.setRadius(4);
        System.out.println("Area of the circle: "+c.getArea());
        System.out.println("Perimeter of the circle"+c.getPerimeter());
    
    
    }
}

class Shape {
    //paramether
    private int numberOfSides;

    //constructor
    public Shape() {

    }
    public Shape(int n) {
        this.numberOfSides = n;
    }

    //methods
    public void setNumberOfSides(int n) {
        this.numberOfSides = n;
    }
    public int getNumberOfSides() {
        return this.numberOfSides;
    }
}

class Square extends Shape {
    //paramether
    private int sideLength;

    public Square(int side) {
        this.sideLength = side;
    }

    //get/set
    public void setSideLength(int i) {
        this.sideLength = i;
    }
    public int getSideLength() {
        return this.sideLength;
    }

    //methods
    public int getArea() {
        return this.sideLength*this.sideLength;
    }
    public int getPerimeter() {
        return 4*this.sideLength;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int rad){
        this.radius = rad;
    }

    public void setRadius(int r) {
        this.radius = r;
    }
    public int getRadius() {
        return this.radius;
    }

    public int getArea () {
        return  (int)(Math.PI*this.radius*this.radius);
    }
    public int getPerimeter () {
        return (int)(Math.PI*this.radius*2);
    }
}