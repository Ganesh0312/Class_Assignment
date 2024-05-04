public class AconClass {

    AconClass(){
        System.out.println("hello Ganesh");
    }

    AconClass(int a){
        this();
        System.out.println("A= "+a);
    }


    public static void main(String[] args) {
        AconClass a=new AconClass(15);
    }
    
}
