public class Pattern5 {
    public static void main(String[] args) {
        for (int i=0; i<8; i++)
        {
            for (int j=8-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a=7; a>0; a--)
        {
            for (int b=7-a; b>=1; b--)
            {
                System.out.print(" ");
            }
            for (int c=0; c<=a; c++ )
            {
                System.out.print("* ");
            }
            System.out.println();   
        } 
    }
    
}
