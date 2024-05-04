public class Aclass {
    void n(){
        System.out.println("My method is n");
    }
    void m(){
        System.out.println("My method is m");
    }
    void p(){
        System.out.println("My method is p");
        this.n();
        this.m();
    }

    public static void main(String[] args) {

    Aclass a=new Aclass();
    a.p();

    a.m();
        
    }
    
}
