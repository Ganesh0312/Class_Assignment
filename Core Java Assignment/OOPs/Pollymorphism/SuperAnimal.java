class Animal{
    String color="black";
}
class Dog extends Animal{
    String color="white";

    void printcolor(){
        System.out.println("color = "+color);
        System.out.println("Color = "+super.color);
    }

    
}
public class SuperAnimal {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.printcolor();
        
    }
    
}
