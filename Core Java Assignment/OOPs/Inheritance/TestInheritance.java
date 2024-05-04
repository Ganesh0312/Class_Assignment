class Animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class Cat extends Animal{
    void weep(){
        System.out.println("Weeping");
    }
}
 class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
 }
public class TestInheritance {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.bark();
        d.eat();
        
        Cat c=new Cat();
        c.eat();
        c.weep();
    }
}
