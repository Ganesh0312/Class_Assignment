class Student{
	int id;
	int age;
	String name;
	String add;
	}

public class Studentoutside
{
	public static void main(String args[])
	{

	Student s1=new Student();
	Student s2=new Student();

	s1.id=1;
	s1.name="Ganesh";
	s1.age=23;
	s1.add="Baramati";
	
	System.out.println(s1.id + s1.name + s1.age);
	System.out.println(s2.id+ s2.name + s2.age);
  	System.out.println(s1.id);
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.add);
	}
}