//2)Create a class Student with a default constructor that initializes the name to "Unknown", age to 0, and grade to 0.

public class Student{
    String name;
    int age;
    char grade;

    Student(){
        name="Unknown";
        age=0;
        grade='O';

        System.out.println("Name = "+name+" age = "+age+" grade = "+grade);
    }

    public static void main(String args[]){
        Student s1=new Student();
    }
}
// Name = Unknown age = 0 grade = O