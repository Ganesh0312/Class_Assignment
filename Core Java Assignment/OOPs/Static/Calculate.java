public class Calculate {

    static int cube1(int x){
        return x*x*x;
    }

    /*static int x=5;
    int cube(){
        return x*x*x;
    }*/

    public static void main(String[] args) {
       // Calculate c=new Calculate();
        
        //System.out.println(c.cube());

        int result=Calculate.cube1(5);
        System.out.println(result);
    }
    
}
