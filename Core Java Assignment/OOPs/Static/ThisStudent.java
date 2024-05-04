public class ThisStudent{
    String name;
    int id;
    float salary;
    ThisStudent(String name,int id, float salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void display(){
        System.out.println(" Name="+name+" id= "+id+" salary = "+salary);
    }

    public static void main(String[] args) {

        ThisStudent s1=new ThisStudent("Ganesh", 3, 4000000);
        s1.display();
        
    }
    
}