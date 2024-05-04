// 6) Create a class Person with a parameterized constructor that initializes the name and age of the person.
public class PersonPara {

        String name;
        int age;
    
        PersonPara(String n, int a){
            name=n;
            age=23;
    
            System.out.println("Name = "+name+" Age = "+age);
        }
        public static void main(String[] args) {
            PersonPara p1=new PersonPara("Ganesh",23);     
        }  
    
}
//OUTPUT - Name = Ganesh Age = 23