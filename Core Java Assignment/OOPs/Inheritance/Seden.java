class Vehicle{
    void drive(){
        System.out.println("Driving");
    }

}
class SUV extends Vehicle{
    void accelarate(){
        System.out.println("accleratting");
    }

}
class Sports extends Vehicle{
    void breake(){
        System.out.println("Breaking");
    }
}
public class Seden extends SUV{
    void greving(){
        System.out.println("Greening");
    }
    public static void main(String[] args) {
        Seden s1=new Seden();

        s1.drive();
        s1.accelarate();
        s1.greving();

        
    }
    
}
