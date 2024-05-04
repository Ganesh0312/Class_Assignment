
class Dog {
    protected void eat(){
        System.out.println("Eating");
    }
}
public class StaticAnimal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
    
}

