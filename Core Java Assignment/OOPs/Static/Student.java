public class Student {
    String name;
    int id;
   static String collage="SVPM";

    public Student(String n, int i){
        name=n;
        id=i;
        
    }
    void display(){
        System.out.println("name = "+name+" id = "+id+" Collage = "+collage);
    }

    public static void main(String[] args) {
        Student s1=new Student("Ganesh",1);
        s1.display();

        Student s2=new Student("Ganesh",3);
        s2.display();
    }
}
