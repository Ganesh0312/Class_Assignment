public class JavaIfelse
{
	public static void main(String args[])
	{
	//Write a java program odd and even number using if else statement
		/*int a=10;
		if(a%2==0)
		{
			System.out.println("Number is even");
		}else{
		System.out.println("Number is Odd");
		}*/

	//Write a java program using Ternary Operator for odd and even number
	/*int a=11;
	String msg=(a%2==0)? "Number is even": "Number is Odd";
	System.out.println(msg);*/

	//Print "1" if x is equal to y, print "2" if x is greater than y, otherwise print "3".
	/*int x=22,y=33;
	if(x==y)
	{
	   System.out.println("1");
	}
	if(x>y)
	{
		System.out.println("2");
	}else{
		System.out.println("3");
	}*/

	//Example: Check if a Number is Positive or Negative using if else
	/*int a=22;
	if(a>0)
	{
		System.out.println("number is positive");
	}else{
		System.out.println("Number is Negative");
	}*/
	 
	//Write a Java program to check if a year is a leap year.
	/*int year=2024;
	if(year%4==0)
	{
		System.out.println("Year is Leap Year");
	}else{
		System.out.println("Year is not leap year");
	}*/

	//Write a Java program to check if a character is a vowel or a consonant.
	/*char ch='b';
	if(ch=='a'|| ch=='e' || ch=='o' || ch=='u' || ch=='i')
	{
		System.out.println("Character is a Vowel");
	}else{
		System.out.println("Character is Constant");
	}*/

	//Write a java program for grading system for fail, D grade, C grade, B grade, A grade
	/*char ch='c';
	if(ch=='A'){
	System.out.println("A Grade");
	}
	else if(ch=='B'){
		System.out.println("B Grade");
	}
	else if(ch=='c'){
		System.out.println("C Grade");
	}
	else if(ch=='d'){
		System.out.println("D Grade");
	}else{
		System.out.println("Fail");
	}*/
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/*int marks=70;
	if(marks>=85){
	System.out.println("A Grade");
	}
	else if(marks<=84 && marks>=75){
		System.out.println("B Grade");
	}
	else if(marks<=74 && marks>=65){
		System.out.println("C Grade");
	}
	else if(marks>64 && marks>45){
		System.out.println("D Grade");
	}else{
		System.out.println("Fail");
	}*/

	//Write a java Program to check POSITIVE, NEGATIVE or ZERO
	/*int a=-10;
	if(a>0)
	{
		System.out.println("Number is Positive");
	}else if(a==0){
		System.out.println("Number is Zero");
	}else{
		System.out.println("Number is Negative");
	}*/

	//Write a Java program to determine the season based on the given month.
	/*String m="May";
	if(m=="December"||m=="January"|| m=="February"|| m=="March" || m=="April")
	{
		System.out.println("Season is Winter");
	}
	else if(m=="May" || m=="June" || m=="July" || m=="Agust")
	{
		System.out.println("Season is Summer");
	}else{
		System.out.println("Season Is Monsoon");
	}*/




	//Write a java program take two variables as age and weight compare with nested if statement

	int age=19;
	int weigth=50;
	if(age>18)
	{
		if(weigth>=50)
		{
		  System.out.println("eligible  for Blood Donation");
		}else{
		  System.out.println("Not Eligible for Blood Donation");
		}
	}else{
		System.out.println("Age must be greater than 18");
	}
		
	
	}
}






















