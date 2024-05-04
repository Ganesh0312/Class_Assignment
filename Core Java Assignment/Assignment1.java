import java.util.Scanner;

public class Assignment1{
    public static void main(String args[]){
       /*  //Write a Java Program to find the multiplication table of a given number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number multiplication table");
        int no=sc.nextInt();
        int mul;
        for(int i=1;i<=10;i++){
            mul=no*i;
            System.out.println(no+"x"+i+" = "+mul);
        } */

        //Write a Java Program to see the implementation of infinite for loop
        //Using while loop
        /*int i=1;
        while(i<=10){
            System.out.println("hello");
        } */
        
        /*// Write a Java Program to see the implementation of infinite for loop only for one particular number
        int no=9;
        for(int i=1;i>=0;){
            System.out.println("No ="+no);
        } */

        //Write a Java Program to perform Conditional AND and OR operations
/*
        int a = 5;
        int b = 10;
        int c = -15;
        if (a > 0 && b > 0) {
            System.out.println("Both 'a' and 'b' are positive");
        } else {
            System.out.println("At least one of 'a' or 'b' is not positive");
        }

        if (b > 0 || c > 0) {
            System.out.println("At least one of 'b' or 'c' is positive");
        } else {
            System.out.println("Neither 'b' nor 'c' is positive");
        }*/

      /*  //Write a Java Program to perform ternary operation
        int a=10;
        int b=20;
        String msg=(a==b)?"A and B Equal":"A And B are not equal";
        System.out.println(msg);
        */

       /* // 8)Write a Java Program to Perform Assignment Operations
        Scanner sc=new Scanner(System.in);
        System.out.println("1.When Values Are Predifined 2.when values are user defined");
        System.out.println("Enter two choise = ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                int num1=10;
                int num2=20;
                  
                num1 +=num1;
                num2 -=num2;
                System.out.println("Value of num1 = "+num1);
                System.out.println("Value of num2 = "+num2);
                break;
            case 2:
                System.out.println("Enter Value of num");
                int num=sc.nextInt();
                 num -=num;
                 System.out.println("value of num = "+num);
        
            default:
                break;
        } */

        //9)Write a Java Program to to create a jagged array which contains two 1D array

        // 10)Write a Java Program to Print the kth Element in the Array with Case1 :pre defined elements Case2: UserDefiend

       /* Scanner sc=new Scanner(System.in);
        System.out.println("1 :pre defined elements 2: UserDefiend");
        System.out.println("Enter two choise");

        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Kth Element of array");
                int k=sc.nextInt();
                int arr[]={1,2,3,4,5};
                System.out.println("Kth Element of Array = "+arr[k]);
                break;
            case 2:
                    System.out.print("Enter the number of elements: ");
                    int n = sc.nextInt();
                    int arr1[] =new int[n];
                    for(int i=1;i<=n;i++){
                        arr1[i]=sc.nextInt();
                    }
                    System.out.println("Enter Kth Element of array");
                    int k1=sc.nextInt();
                    System.out.println("Kth element of array"+arr1[k1]);
                    
        
            default:
                break;
        }  */


    }
}