 class Airplane {
    private String model;
    private int capacity;
    private int fuelLevel;

    // Constructor
    public void insert(String m, int c, int f) {
        model = m;
        capacity = c;
        fuelLevel = f;
    }
    public void takeOff() {
        System.out.println("Airplane " + model + " taking off...");
    }

    public void land() {
        System.out.println("Airplane " + model + " landing...");
    }

    public void refuel() {
        System.out.println("Refueling airplane " + model);
    }

    public void display(){
        System.out.println("Model = "+model+" Capacity = "+capacity+" FuelLevel = "+fuelLevel);
    }
}
public class TestAirplane{
    public static void main(String args[]){
        Airplane passengerPlane = new Airplane();
        passengerPlane.insert("PassengerPlane", 200, 50);
        passengerPlane.takeOff();
        passengerPlane.land();
        passengerPlane.refuel();
        passengerPlane.display();

        Airplane cargoPlane = new Airplane();
        cargoPlane.insert("CargoPlane", 100, 30);
        cargoPlane.takeOff();
        cargoPlane.land();
        cargoPlane.refuel();
        cargoPlane.display();
    }
}

/*
  Airplane PassengerPlane taking off...
Airplane PassengerPlane landing...
Refueling airplane PassengerPlane
Model = PassengerPlane Capacity = 200 FuelLevel = 50
Airplane CargoPlane taking off...
Airplane CargoPlane landing...
Refueling airplane CargoPlane
Model = CargoPlane Capacity = 100 FuelLevel = 30

 */