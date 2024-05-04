public class Student
{
	int id;
	String name;
	int age;
	public static void main(String args[])
	{
	  Student s1=new Student();
	  Student s2=new Student();
	  s1.id=1;
	  s1.name="Ganesh";
	  System.out.println(s1.id+ s1.name + s1.age);
	  System.out.println(s2.id+ s2.name + s2.age);
	}
}