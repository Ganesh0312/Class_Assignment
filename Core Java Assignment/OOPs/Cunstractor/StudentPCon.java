public class StudentPCon {

    String name;
    int id;
    int age;
    String bGroup;
    StudentPCon(String n, int i,int a, String b){
        name=n;
        id=i;
        age=a;
        bGroup=b;

    }

    public void display(){
        System.out.println(name+" "+id+" "+age+" "+bGroup);
    }

    public static void main(String args[]){
        StudentPCon s1=new StudentPCon("GAnesh", 1, 23, "b+");
        StudentPCon s2=new StudentPCon("Umesh", 2, 25, "A+");

        s1.display();
        s2.display();
    }
    
}
