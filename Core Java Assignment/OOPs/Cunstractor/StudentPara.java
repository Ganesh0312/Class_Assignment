//8) Create a class Student with a parameterized constructor that initializes the name, age, and grade of the student.

public class StudentPara {

    String name;
    int age;
    char grade;

    StudentPara(String n, int a,char g){
        name=n;
        age=a;
        grade=g;
        System.out.println("Name = "+name+" age = "+age+" grade = "+grade);
    }

    public static void main(String args[]){
        StudentPara s1=new StudentPara("Ganesh",23,'A');
    }
}
// OUTPUT:- Name = Ganesh age = 23 grade = A