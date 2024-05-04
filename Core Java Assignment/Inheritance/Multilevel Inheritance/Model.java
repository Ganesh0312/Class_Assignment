/*16)Write a Java Program for Multilevel Inheritance of Vehicle */
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
public class Model extends Mastang{
    String color;
    int speed;
    float price;
    void display(String color, int speed, float price)
    {
        this.color=color;
        this.speed=speed;
        this.price=price;
        System.out.println("Color = "+color+" speed = "+speed+" price = "+price);
    }
    public static void main(String[] args) {

        Model m=new Model();
        m.drive("Ganesh", "Mastang");
        m.honk();
        m.display("Black", 250,4000000);
        
    }
}