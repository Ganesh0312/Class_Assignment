// 4)Create a class Country with a default constructor that initializes the name to "Unknown" and population to 0.

public class Country{

    String name;
    int population;

    Country(){
        name="Unknown";

        System.out.println(" Name = "+name+" Population = "+population);
    }

    public static void main(String[] args) {
        Country c=new Country();
    }
}

// OUTPUT -  Name = null Population = 0