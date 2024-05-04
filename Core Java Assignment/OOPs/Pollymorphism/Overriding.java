class vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }
}
class Bike extends vehicle{
    void run(){
        System.out.println("Bike is Running");
    }

}
public class Overriding {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.run();
        b1.run();
    }
    
}
