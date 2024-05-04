class Bank{
    int rate;
}
class SBI extends Bank{
    void rateOfInterest(){
        //this.rate=rate;
        super.rate=6;
        System.out.println("SBI Interest = "+rate);
    }
}
class ICI extends Bank{
    void rateOfInterest(int rate){
        this.rate=rate;
        System.out.println("ICI Interest = "+rate);

    }
}
class AXIs extends Bank{
    void rateOfInterest(int rate){
        this.rate=rate;
        System.out.println("AXIS Interest = "+rate);
    }
}
public class TestBank {
    public static void main(String[] args) {

        SBI sbi= new SBI();
        sbi.rateOfInterest();

        ICI ici=new ICI();
        ici.rateOfInterest(8);

        AXIs axis=new AXIs();
        axis.rateOfInterest(9);
        
    }
    
}
