//Create a class Employee with a parameterized constructor that initializes the name, id, and salary of the employee.

public class Employee{
    String name;
    int id;
    float salary;

    Employee(String n,int i, float sal){
        name=n;
        id=i;
        salary=sal;

        System.out.println(name+" Employee has "+salary+" Salary");
    }
    public static void main(String[] args) {

        Employee e=new Employee("Gaesh", 101, 4000000);
        
    }
}