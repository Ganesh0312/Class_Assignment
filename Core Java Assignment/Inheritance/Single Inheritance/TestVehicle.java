/* 3)Write a Java Program for Single Inheritance of Vehicles. Take a method called void
drive() and void honk()
*/
class Vehicle{
    String name;
    String car;
    public void drive(String name,String car){
        this.name=name;
        this.car=car;
        System.out.println(name+" Drives "+car+" Car");
    }
}
class Mastang extends Vehicle{
    void honk(){
        System.out.println("Mastang Making sound");
    }
}
public class TestVehicle{
    public static void main(String[] args) {

        Mastang m=new Mastang();
        m.drive("Ganesh", "Mastang");
        m.honk();
        
    }
}