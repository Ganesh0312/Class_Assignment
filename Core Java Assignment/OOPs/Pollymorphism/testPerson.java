class Person{
    String name;
    int id;
   // int salary;

    void insert(String name, int id){
        this.name=name;
        this.id=id;
        //this.salary=salary;
    }
    void display(){
        System.out.println("person name = "+name+"person id= "+id);
    }
}

class Employee extends Person{
    int salary;
    void add(int salary){
        super.insert("Ganesh", 1);
        System.out.println("Employye name ="+super.name+"Employee id = "+super.id+" salary = "+salary);
        
        super.display();
    }
}
public class testPerson {
    public static void main(String[] args) {

        Employee e=new Employee();
        e.add(30000);
        
    }
    
}
