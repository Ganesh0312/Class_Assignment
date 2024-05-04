class Addition{
    static int add(int a,int b){
        return a+b;
    }

    /*static void add(int a,long b){
        System.out.println(a+b);
    }*/

    static double add(int a, int b, int c){
        return a+b+c;
    }
}
public class TestAddition{
    public static void main(String[] args) {

        /*Addition ad=new Addition();
        ad.add(10, 20);*/

        System.out.println("Two No addition = "+Addition.add(10, 20));
        System.out.println("Two No addition = "+Addition.add(10, 20));
        System.out.println("Three No Addition = "+Addition.add(11, 22,33));
        
    }
}