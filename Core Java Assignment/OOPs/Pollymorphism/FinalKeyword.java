class bike{
   final void run(){
    System.out.println("Running....");
   }
}
class Honda extends bike{
    /*void run(){
        System.out.println("Running.... Safelly");
    }*/ //run() in Honda cannot override run() in bike
}
public class FinalKeyword {
    /*final int speed=40;
    void run(){
        System.out.println("runing "+speed);
    }*/
    public static void main(String args[]){

        Honda h=new Honda();
        h.run();
    /*FinalKeyword k=new FinalKeyword();
    //k.run();*/
    }
    
}
