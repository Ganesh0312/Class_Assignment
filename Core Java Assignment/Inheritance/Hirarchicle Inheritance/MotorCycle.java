/* 17)Write a Java Program for Multilevel Inheritance of Vehicle */

import javafx.scene.input.MouseButton;

class Vehicle{
    String brand;
    int year;
    int door;
    String type;
}
class Car extends Vehicle{
    
    public void carMethod(String brand, int year,int door){
        System.out.println("Brand of Car= "+brand+" year Of Modification = "+year+" No of Door in Car = "+door);

    }
}
public class MotorCycle extends Vehicle{
     MotorCycle(String brand, int year,String type ){
        this.brand=brand;
        this.year=year;
        this.type=type;
     }

     public void display(){
        System.out.println("Brand of MotorCycel= "+brand+
        " year Of Modification = "+year+" Type Of MotorCycle = "+type);
     }

     public static void main(String[] args) {
        Car c1=new Car();
        c1.carMethod("Toyota,",2020,4);

        System.out.println();

        MotorCycle m1=new MotorCycle("Honda", 2019,"Sports");
        m1.display();
     }
}