//1)Create a class Person with a default constructor that initializes the name to "Unknown" and age to 0.
public class Person{

    String name;
    int age;

    Person(){
        name="Unknown";
        age=0;

        System.out.println("Name = "+name+" Age = "+age);
    }
    public static void main(String[] args) {
        Person p1=new Person();     
    }
}

// Name = Unknown Age = 0