//1)Write a Java Program for Single Inheritance of Animals. Take a method called void eat() and void bark().
class Animal{
    public void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is Barking");
    }
}
public class TestAnimal{
    public static void main(String args[]){
        Dog b=new Dog();
        b.bark();
        b.eat();
    }
}
/*Dog is Barking
Animal is Eating */