//11) Create a class Student with two constructors: one that takes name,
//age, and grade as parameters, and another that takes only name and age

public class StudentPara{
    String name;
    int age;
    char grade;

    StudentPara(String n, int a,char g){
        name=n;
        age=a;
        grade=g;

        System.out.println("Name = "+name+" age = "+age+" grade = "+grade);
    }
    StudentPara(String n, int a){
        name=n;
        age=a;

        System.out.println("Name = "+name+" age = "+age+" grade = "+grade);
    }

    public static void main(String args[]){
        StudentPara s1=new StudentPara("Ganesh",23,'A');
        StudentPara s2=new StudentPara("Ganesh",23);
    }
}
/*
Name = Ganesh age = 23 grade = A
Name = Ganesh age = 23 grade =
 */