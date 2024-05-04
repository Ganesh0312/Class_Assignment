class Car{
    String model;
    String color;
    String speed;

    void insert(String m, String c, String s){
        model=m;
        color=c;
        speed=s;
    }

    void display(){
        System.out.println("Model = "+model+" "+" Color = "+color+" Speed = "+speed);
    }

    void start(){
        System.out.println("Starting Engine");
    }

    void accelerate(){
        System.out.println("accelerating Car");
    }

    void brake(){
        System.out.println("Applying Breaks");
    }    
}
public class TextCar {
    public static void main(String args[]){

        Car sedanCar=new Car();
        sedanCar.insert("sedanCar", "Black", "300Km");
        sedanCar.display();
        sedanCar.start();
        sedanCar.accelerate();
        sedanCar.brake();

        Car suvCar=new Car();
        suvCar.insert("suvCar", "Black", "200Km");
        suvCar.start();
        suvCar.display();
        suvCar.accelerate();
        suvCar.brake();

        Car sportsCar=new Car();
        sportsCar.insert("sportsCar", "Black", "200Km");
        sportsCar.display();
        sportsCar.start();
        sportsCar.accelerate();
        sportsCar.brake();
    }
}
/* OUTPUT :- Model = sedanCar  Color = Black Speed = 300Km
 Starting Engine
 accelerating Car
 Applying Breaks
 Starting Engine
 Model = suvCar  Color = Black Speed = 200Km
 accelerating Car
 Applying Breaks
 Model = sportsCar  Color = Black Speed = 200Km
 Starting Engine
 accelerating Car
 Applying Breaks */