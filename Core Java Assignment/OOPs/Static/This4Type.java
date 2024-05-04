public class This4Type {
    
    void m(This4Type obj){
        System.out.println("Parameter List ");
    }

    void n(){
        m(this);
        System.out.println("Hello n");
    }
    public static void main(String[] args) {

        This4Type a=new This4Type();
             a.n();
        
    }
    
}
