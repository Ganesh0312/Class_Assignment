class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
public class Cat extends Dog{
    void color(){
        System.out.println("Cat Color is black");
    }
    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.color();
        c1.bark();
        c1.eat();
        
    }
}
/* Cat Color is black
Dog is Barking
Animal is Eating*/