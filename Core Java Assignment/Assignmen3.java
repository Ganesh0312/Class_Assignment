public class Assignmen3{
    public static void main(String args[]){
        //write a java program to find sum of all even no from 1 to 50 using for loop use countinue statement to skip all nummbers

        /* int sum=0;
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                continue;
            }else{
                sum=sum+i;
                System.out.print(" "+i);
            }    
        }
        System.out.println(" = "+sum);
    }

    // Output :- 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 = 650 */

  /*  //write aprogram to print first 10 prime numbers use for loop and break the statment to exit the after finding first 10 prime no 

    for(int i=1;i<=100;i++){
        if(i%2==0){
            System.out.println("Number is prime = "+i);
        }
    }  */

    //Write a java program to find the factorial of given number using do while loop use the countinue statemnt to handle negative number 

   /* // write a java number to find first occurence of no 5 in array.use for loop and break to exit loop when no is found 
    int arr[]={1,2,3,4,5,6,7,8};
    for(int i=1;i<arr.length;i++){
        System.out.println(i +" ");
        if(i==5){
            break;
        }
    } */

 /*   // write a java program to find sum of array no until negative no is not found. use for loop and break to exit lopp when negative no found 
    int arr[]={1,2,3,4,-5,6,7,8};
    int sum=0;
    for(int i=0;i<=arr.length;i++){
        if(arr[i]<0){
            System.out.println("Negative no found");
            break;
        }
        System.out.print(arr[i]+" ");
        sum +=arr[i];
        
    }
    System.out.println(" sumof array number = "+sum);  */

    /* //Write a java program to find specific element in 2d Array using for loop.when elemnt found exit the loop 

    int arr[][]={{1,2,3,4},{5,6,7,8}};
    int num=5;
    for(int i=0;i<=arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==5){
                System.out.println(num+" is Found = "+arr[i][j]);
                break;
            }
        }
    } */

   /* //write a java program to print 1 to 20 expect multiple of 5.use countinue to skip printing multiple of 5

    for(int i=1;i<=20;i++){
        if(i%5==0){
            continue;
        }
        System.out.println(i+" ");
    } */

   /* //write a java program to print sum of 1 to 100 no excludong multiple of use countinue to skip printing multiple of 5
    int sum=0;
    for(int i=1;i<=100;i++){
        if(i%3==0){
            continue;
        }
        sum=sum+i;
        System.out.print(i+" ");
    }
    System.out.println("= "+sum); */

    /* //write a java program to find average of positive number of an array. use continue statement to skip negative no 
    int avg=0, sum=0;
    int count=0;
    int arr[]={2,6,-7,-5,};
    for(int i=0;i<=arr.length;i++){
        if(arr[i]<0){
            continue;
        }else{
        sum=sum+i;
        count++;
        }

    }
    avg=sum/count;
    System.out.println("Average = "+avg); */

    }
}