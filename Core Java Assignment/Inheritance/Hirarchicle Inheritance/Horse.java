/* 18)Write a Java Program for Multilevel Inheritance of Animal */

class Animal{
    String name;
    String color;
    int age;
    String sound; 
}
class Cat extends Animal{
    public void insert(String name, String color, int age, String sound){
        this.name=name;
        this.color=color;
        this.age=age;
        this.sound=sound;
    }

    public void display(){
        System.out.println("Cat Details");
        System.out.println("Name Of Cat = "+name);
        System.out.println("Color of Cat = "+ color);
        System.out.println("Age Of Cat = "+age);
        System.out.println("Sound Of Cat = "+sound);
    }
}
public class Horse extends Animal{
    public void insert(String name, String color, int age, String sound){
        this.name=name;
        this.color=color;
        this.age=age;
        this.sound=sound;
    }
    public void display(){
        System.out.println("Horse Details");
        System.out.println("Name Of Horse = "+name);
        System.out.println("Color of Horse = "+ color);
        System.out.println("Age Of Horse = "+age);
        System.out.println("Sound Of Horse = "+sound);
    }
    public static void main(String[] args) {

        Cat c1=new Cat();
        c1.insert("Kitty", "White & Black ", 3,"mewww");
        c1.display();

        Horse h1=new Horse();
        h1.insert("Badal", "Black", 10, "Like Horse");
        h1.display();
    } 
}