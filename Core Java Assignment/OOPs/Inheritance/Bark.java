class Animal{
    void bark(){
        System.out.println("Barking");
    }
}
public class Bark extends Animal {
    public void Eat(){
        System.out.println("Eating");
    }
    public static void main(String[] args) {
        
        Bark b1=new Bark();

        b1.bark();;
        b1.Eat();
    }
    
}
