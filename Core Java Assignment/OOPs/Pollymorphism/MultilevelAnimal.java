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
class Dog extends Cat{
    void eating(){
        System.out.println("Eating Meat ");
    }
}
class Lion extends Dog{
    void eating(){
        System.out.println("Eating Rat");
    }
}
public class MultilevelAnimal {
    public static void main(String[] args) {

        Animal c=new Cat();
        c.eating();

        Animal d=new Dog();
        d.eating();

        Animal l=new Lion();
        //l.eating();
        l.eating();
        
    }    
}
 