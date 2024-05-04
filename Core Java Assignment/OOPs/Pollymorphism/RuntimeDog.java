class Animal{
    void eat(){
        System.out.println("Eatinhg");
    }
}
public class RuntimeDog extends Animal{
    void eat(){
        System.out.println("Eatinhg .... Fastally");
    }

    public static void main(String[] args) {
        RuntimeDog r=new RuntimeDog();
        r.eat();
        r.eat();
    }
    
}
