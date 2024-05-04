/* 9)Write a Java Program for Single Inheritance of Parent. Take a method called void
talk() and void Play()
*/
class Parent{
    public void talk(){
        System.out.println("Parent Talking to chid");
    }
}
class Child extends Parent{
    void play(String play){
        System.out.println("Child Playing "+play);
    }
}
public class TestParent{
    public static void main(String[] args) {

        Child c=new Child();
        c.talk();
        c.play("cricket");
        
    }
}