/*6)Write a Java Program for Single Inheritance of Person. Take a method called void
Introduce() and void study().
 */

 class Person{
    String name;
    public void introduce(String name){
        this.name=name;
        System.out.println(name+" Introducing himself");
    }
 }
 class Student extends Person{
    String sub;
    void study(String sub,String name){
        this.name=name;
        this.sub=sub;
        System.out.println(name+" Doing his Study on "+sub);
    }
 }
public class TestPerson {
    public static void main(String args[]){
        Student s1=new Student();
        s1.introduce("Ganesh");
        s1.study("Java Full-Stack","Ganesh");
    }
    
}
