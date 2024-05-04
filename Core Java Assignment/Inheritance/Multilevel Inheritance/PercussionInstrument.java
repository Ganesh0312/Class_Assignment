/* 15)Write a Java Program for Multilevel Inheritance of Instrument. */


 class Instrument {
    public  void play(){
        System.out.println("Playing the instrument...");
    }
}
class StringInstrument extends Instrument {
    public void stringSound() {
        System.out.println("Producing string sound...");
    }
}
class PercussionInstrument extends StringInstrument {
   
    public void percussionSound() {
        System.out.println("Producing percussion sound...");
    }

    public static void main(String[] args) {
        PercussionInstrument p1 = new PercussionInstrument();
        
        p1.play(); 
        p1.stringSound();         
        p1.percussionSound(); 
    }
}
