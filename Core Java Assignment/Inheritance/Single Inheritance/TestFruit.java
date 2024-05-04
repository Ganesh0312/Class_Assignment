/* 10)Write a Java Program for Single Inheritance of Fruit. Take a method called void Eat()
and void Peel()*/
// Parent class Fruit
class Fruit {
    
    public void eat() {
        System.out.println("Eating the fruit");
    }
    

    public void peel() {
        System.out.println("Peeling the fruit");
    }
}


class Apple extends Fruit {

    public void takeSeedsOut() {
        System.out.println("Taking out seeds from the apple");
    }
}

public class TestFruit {
    public static void main(String[] args) {
   
        Apple apple = new Apple();
        
        apple.eat();
        apple.peel();
        
        apple.takeSeedsOut();
    }
}
