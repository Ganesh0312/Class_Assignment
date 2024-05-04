
class Animal {
    void eat(){
        System.out.println("Eating Animal");
    }
}
class Dog extends Animal {
    void eat(){
        System.out.println("Eating Dog");
    }
}
public class StaticAnimal1 {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.eat();
    }
    
}

