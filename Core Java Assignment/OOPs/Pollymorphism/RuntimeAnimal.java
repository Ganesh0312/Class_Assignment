class Animal{
    void eating(){
        System.out.println("Eating ");
    }
}
class Cat extends Animal{
    void eating(){
        System.out.println("Eating Bread");
    }
}
class Dog extends Animal{
    void eating(){
        System.out.println("Eating Meat ");
    }
}
class Lion extends Animal{
    void eating(){
        System.out.println("Eating Rat");
    }
}
public class RuntimeAnimal {
    public static void main(String[] args) {

        Cat c=new Cat();
        c.eating();

        Dog d=new Dog();
        d.eating();

        Lion l=new Lion();
        l.eating();
        
    }    
}
