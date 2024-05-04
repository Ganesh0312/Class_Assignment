class CoffeeMachine{


   String brand;
   int capacity;
   int waterLevel;

   public void insert(String b,int c,int w){
    brand=b;
    capacity=c;
    waterLevel=w;
   }

   public void brewCoffee(){
    System.out.println("Brewing coffee...");
   }

    public void refillWater() {
    System.out.println("Refilling water...");
    }

    public void display(){
        System.out.println("Brand = "+brand+" Capacity = "+capacity+" WaterLevel = "+waterLevel);
    }
    
}
public class TestCoffee{
    public static void main(String args[]){

        CoffeeMachine officeCoffeeMachine = new CoffeeMachine();
        officeCoffeeMachine.insert("Worfull", 1000, 500);
        officeCoffeeMachine.brewCoffee();
        officeCoffeeMachine.refillWater();
        officeCoffeeMachine.display();

        CoffeeMachine homeCoffeeMachine = new CoffeeMachine();
        homeCoffeeMachine.insert("LG", 500, 300);
        homeCoffeeMachine.brewCoffee();
        homeCoffeeMachine.refillWater();
        homeCoffeeMachine.display();

    }
}

/*
  OUTPUT-
Brewing coffee...
Refilling water...
Brand = Worfull Capacity = 1000 WaterLevel = 500
Brewing coffee...
Refilling water...
Brand = LG Capacity = 500 WaterLevel = 300
 */