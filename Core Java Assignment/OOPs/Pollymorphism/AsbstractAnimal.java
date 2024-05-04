abstract class Animal{
    abstract void eat();
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating ");
    }
}
public class AsbstractAnimal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}
