public class StudentCon{

    int id;
    String name;
    String add;
    String mob;
    int sal;

    StudentCon(int i, String n){
        id=i;
        name=n;        
    }

    StudentCon(int i, String n,String a,String m){
        id=i;
        name=n;
        add=a;
        mob=m;
    }

    StudentCon(int i, String n,String a,String m,int s){
        id=i;
        name=n;
        add=a;
        mob=m;
        sal=s;
    }

    void display(){
        System.out.println(id+" "+name+" "+add+" "+mob+" "+sal);
    }


    public static void main(String[] args) {
        StudentCon s1=new StudentCon(1,"Ganesh");
        StudentCon s2=new StudentCon(1,"Ganesh","Baramati","1234567");
        StudentCon s3=new StudentCon(1,"Ganesh","Baramati","123345",5000);


        s1.display();
        s2.display();
        s3.display();

    }
}