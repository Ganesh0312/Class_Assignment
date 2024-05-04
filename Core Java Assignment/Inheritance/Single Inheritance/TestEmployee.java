/*5)Write a Java Program for Single Inheritance of Employees. Take a method called void
Work() and void Manage()
 */
class Employee{
    String name;
    String dept;

    public void work(String name, String dept){
        this.name=name;
        this.dept=dept;

        System.out.println("Employee "+name+" works in "+dept+" Department" );
    }
}
class Manager extends Employee{

    void manage(){
    System.out.println("Manager Manages All employees");
    }
}
public class TestEmployee {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.work("Ganesh", "Manager");
        m1.manage();
    }
    
}
