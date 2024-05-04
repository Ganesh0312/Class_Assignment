/*19)Write a Java Program for Multilevel Inheritance of Instrument */
class Intrument{
    String name;
    String sound;

    public void insert(String name, String sound){
        this.name=name;
        this.sound=sound;
    }
}
class Guitar extends Intrument{

    public void display(){
        System.out.println("Name Of Intrument = "+super.name+" Sound Of Intrument = "+super.sound);
    }
}
public class Drum extends Intrument {

    public void insertDrum(String name, String sound){
        this.name=name;
        this.sound=sound;
        System.out.println("Name Of Intrument = "+name+" Sound Of Intrument = "+sound);
    }

    public static void main(String[] args) {
        Guitar g=new Guitar();
        g.insert("Guitar", "tight,dry,punchy");
        g.display();

        System.out.println();

        Drum d=new Drum();
        d.insertDrum("Drum", " da-dum-da-dum");
       
    }
    
}
