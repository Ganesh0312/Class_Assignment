 class Employee{
    int id;
    String name;
    String designation;
    String department;
    int age;
    float salary;

    void Insert(int i, String n,String d, String dept,int a,float s){
        id=i;
        name=n;
        designation=d;
        department=dept;
        age=a;
        salary=s;
    }

    void Display(){
        System.out.println(id+" "+name+" "+designation+" "+department+" "+age+" "+salary);
    }

    void work(){
        System.out.println(name+" is Working in "+department);
    }

}
public class TextEmployee{
    public static void main(String args[]){
        Employee designer=new Employee();
        Employee developer= new Employee();
        Employee manager=new Employee();

        designer.Insert(1,"Ganesh","developer","designer",23,40000);
        designer.Display();
        designer.work();

        developer.Insert(2,"Umesh","developer","developer",23,30000);
        developer.Display();
        developer.work();

        manager.Insert(3,"vishal","taster","manager",23,40000);
        designer.Display();
        designer.work();
    }
}