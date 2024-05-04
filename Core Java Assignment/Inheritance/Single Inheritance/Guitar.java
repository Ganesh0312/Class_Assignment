class Instruments{
    public void playSound(String s){
        System.out.println("playing sound using "+s);
    }
}
public class Guitar extends Instruments {
    public  void strum(){
        System.out.println("Strumming");
    }
    public static void main(String args[]){

        Guitar g=new Guitar();
        g.playSound("Guitar");
        g.strum();

    }
}
