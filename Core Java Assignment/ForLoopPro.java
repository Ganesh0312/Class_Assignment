public class ForLoopPro
{
	public static void main(String args[])
	{
		/* // Print 1 to 10 no
		System.out.println("1 to 10 Number ");
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i);
		}*/

	/* // Calculate sum of No
		int sum=0;
		for(int i=1;i<=10;i++)
		{
		  sum=sum+i; // sum += i;
		   
		}
		System.out.println("Sum of No"+sum); */

	/* // Print even no 1 to 10
		for(int i=1;i<=10; i++) //i+=2
		{
			i=i+1;
			System.out.println("even no= "+i);
		} */
	
	/* // Reverse print no
		System.out.println("1 to 10 Number ");
		for(int i=10;i>=1;i--)
		{
			System.out.print(" "+i);
		} */
	/* //Calculate Factorial 
		int no=5;
		int f=1;
		for(int i=1;i<=5;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+no+" is "+f); */

	/* // Print Squre Patern
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			 	System.out.print("*");
			}
			System.out.println();
		} */


	/* // Print right tringle Patern
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			 	System.out.print("*");
			}
			System.out.println();
		} */

	/*	// Calculate sum of odd no 1 to 10
		int sum=0;
		for(int i=1;i<=10;i+=2)
		{
			sum=sum+i;
		}
			System.out.println("sum = "+sum); */

	/* // fibonicy series
	int n1=0,n2=1;
	int fib=0;
	for(int i=1;i<=10;i++)
	{
	System.out.print(n1+" ");
	fib=n1+n2;
	n1=n2;
	n2=fib;
	}*/
	
	/* //check no is prime
	int num=6;
	for(int i=1;i<num/2;i++)
	{
		if(num % 1==0)
		{
		System.out.println("Number is prime");
		}else{
		System.out.println("Number is not prime");
		}
		String msg=(num % 1==0)?"prime":"not prime";
		System.out.println(msg);
		break;
	}*/
	 
	/* // print numbers using while loop 
	int i=1;
	while(i<=5){
		System.out.print(i+" ");
		i++;
		} */

	/* //Calculate sum of No using while loop

	int i=1;
	int sum=0;
	while(i<=5){
		System.out.print(i+" ");
		sum=sum+i;
		i++;
		}
		System.out.println("= "+sum); */

	 /* // print even number from 1 to 10 using while loop
		int i=0;
		while(i<10)
		{
			System.out.println(i+" ");
			i +=2;
			
		}*/

	/* // Calculate Factorial of Number using while
		int no=5;
		int i=1;
		int f=1;
		while(i<=no)
		{
			f = f*i;
			i++;
		}
		System.out.println("Factorial of no = "+f);*/

	/* // print 1 to 5 no using do while 
		int i=1;
		do{
			System.out.print(i);
		i++;
		}while(i<=5); */

	/* // Calculate sum of numbers 
		int i=1;
		int sum=0;
		do{
			sum=sum+i; // sum +=i;
			System.out.print(" "+i);
			i++;
		}while(i<=10);
		System.out.println(" = "+sum); */

/*	// Print even number from 1 to 10
		int i=2;
		do{
			System.out.print(" "+i);
			i+=2;
		}while(i<=10); */

	// Calculate Factorial of num
		int i=1;
		int no=5;
		int f=1;
		do{

			f=f*i; //f+=i;
			i++;
		}while(i<=no);
		System.out.print(" Factorial of no = "+f);
	


	}
}























