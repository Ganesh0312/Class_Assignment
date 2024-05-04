/*12)Write a Java Program for Multilevel Inheritance of Employees. Take two subclasses:
Manager And Director.print salary name and department.print the output like same
*/
class Employee{
    String name;
    float salary;
    void insertEMP(String name, float salary){
        this.name=name;
        this.salary=salary;
    }
    void displayEMP(){
        System.out.println("Employee Details:");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
    }
}
class Manager extends Employee{
    String dept;
    void insertManager(String name, float salary,String dept){
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    void displayManager(){
        System.out.println("Manager Details:");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
        System.out.println("Department = "+dept);
    }
}

public class Director extends Manager{
    String devision;
    void insertDirector(String name, float salary,String dept,String devision){
        this.name=name;
        this.salary=salary;
        this.dept=dept;
        this.devision=devision;
    }
    void displayDirector(){
        System.out.println("Director Details:");
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary);
        System.out.println("Department = "+dept);
        System.out.println("Division = "+devision);
        
    }

    public static void main(String args[]){

        Director d1=new Director();
        d1.insertEMP("Ganesh",3000);
        d1.displayEMP();

        System.out.println();

        d1.insertManager("Umesh",30000,"Engineering");
        d1.displayManager();
        System.out.println();
        
        d1.insertDirector("vishal",4000,"Managment","Operations");
        d1.displayDirector();

    }
    
}
