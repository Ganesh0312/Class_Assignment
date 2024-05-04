class Animal{
    void eat(){
        System.out.println("Eatting");
       }
       Animal(String n){
        System.out.println("Animal con"+n);
       }
}
       
class Dog extends Animal{
   Dog(){
    super("Ganesh");
    System.out.println("working");
   } 
}
public class SuperMethod {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.eat();
        
        
    }
    
}
