class Employee{
    float salary=40000;
}
public class programer extends Employee{
    int bonus=1000;

    public static void main(String[] args) {
        programer p1=new programer();

        System.out.println("Salary = "+p1.salary);
        System.out.println("Bonus = "+p1.bonus);
    }
}