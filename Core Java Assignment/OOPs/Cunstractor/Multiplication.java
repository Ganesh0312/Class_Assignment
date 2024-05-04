public class Multiplication{
    int a,b,c,d,e,g;

    Multiplication(int n1, int n2){
        a=n1;
        b=n2;

        System.out.println("multiplication of 2 no= "+(a*b));
    }

    Multiplication(int n1, int n2,int n3, int n4){
        a=n1;
        b=n2;
        d=n3;
        e=n4;

        System.out.println("multiplication of 4 no= "+(a*b*d*e));
    }

    Multiplication(int n1, int n2,int n3, int n4,int n5){
        a=n1;
        b=n2;
        d=n3;
        e=n4;
        g=n5;

        System.out.println("multiplication of 5 no= "+(a*b*d*e*g));
    }

    public static void main(String args[]){
        Multiplication m=new Multiplication(5,5);
        Multiplication m2=new Multiplication(5,5,5,6);
        Multiplication m3=new Multiplication(5,5,6,7,8);
    }
    
}