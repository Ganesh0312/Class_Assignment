class Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class Bark extends Animal {
    public void Eat(){
        System.out.println("Eating");
    }
}
public class BabyCat extends Bark{
    public void weep(){
        System.out.println("Weeping");
    }
    public static void main(String[] args) {
        
        BabyCat b1=new BabyCat();

        b1.bark();;
        b1.Eat();
        b1.weep();
    }
    
}
