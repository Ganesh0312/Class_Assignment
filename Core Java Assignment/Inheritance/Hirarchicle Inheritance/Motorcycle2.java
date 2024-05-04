/* 21)Write a Java Program for Multilevel Inheritance of Vehicle */

class Vehicle {
    protected String type;
    protected String color;
    protected int wheels;

    public Vehicle(String type, String color, int wheels) {
        this.type = type;
        this.color = color;
        this.wheels = wheels;
    }

    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String type, String color, int wheels, int doors) {
        super(type, color, wheels);
        this.doors = doors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + doors);
    }
}

class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(String type, String color, int wheels, int gears) {
        super(type, color, wheels);
        this.gears = gears;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Gears: " + gears);
    }
}

class MotorCycle2 extends Vehicle {
    private String transmission;

    public MotorCycle2(String type, String color, int wheels, String transmission) {
        super(type, color, wheels);
        this.transmission = transmission;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Transmission Type: " + transmission);
    }

    public static void main(String[] args) {
        Car car = new Car("Car", "Red", 4, 4);
        Bicycle bicycle = new Bicycle("Bicycle", "Blue", 2, 6);
        MotorCycle2 motorcycle = new MotorCycle2("Motorcycle", "Black", 2, "Manual");

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println();

        System.out.println("Bicycle Details:");
        bicycle.displayInfo();

        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayInfo();
       
    }
}

