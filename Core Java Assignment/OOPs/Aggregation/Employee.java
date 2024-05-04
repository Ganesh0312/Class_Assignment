/*class Address{
    String city,state,country;
    Address(String city,String state, String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}*/
public class Employee{
    String name;
    int id;
    Address address;
    Employee(String name,int id,Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }
    void display(){  
        System.out.println(id+" "+name);  
        System.out.println(address.city+" "+address.state+" "+address.country);  
        }  
    public static void main(String[] args) {
        Address ad=new Address("Baramati", "Maharashtra", "India");
        Address ad1=new Address("Jejuri", "Maharashtra", "India");

        Employee e1=new Employee("Ganesh", 1, ad);
        Employee e2=new Employee("Umesh", 2, ad1);

        e1.display();
        e2.display();;
    }
}