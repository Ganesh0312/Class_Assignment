//3)Create a class Employee with a default constructor that initializes the name to "Unknown", id to 0, and salary to 0.0.
public class Employee{
    String name;
    int id;
    float salary=0.0f;

    Employee(){
        name="Unknown";
        
        System.out.println("Name = "+name+" id= "+id+" Salary = "+salary);
    }

    public static void main(String[] args) {
        Employee e=new Employee();
    }
    
}
// OUTPUT - Name = Unknown id= 0 Salary = 0.0