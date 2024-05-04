class Animal{
    String species;
    int age;
    String sound;

    public void insert(String s, int a, String so){
        species=s;
        age=a;
        sound=so;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes sound: " + sound);
    }

    public void move() {
        System.out.println("The " + species + " is moving.");
    }

    public void display(){
        System.out.println("Species = "+species+" age= "+age+" sound = "+sound);
    }
}
public class TestAnimal{
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.insert("Lion",5,"Roar");
        lion.makeSound();
        lion.move();
        lion.display();

        Animal elephant = new Animal();
        elephant.insert("Elephant",10,"Trumpet");
        elephant.makeSound();
        elephant.move();
        elephant.display();

        Animal snake = new Animal();
        snake.insert("Snake",3,"Hiss");
        snake.makeSound();
        snake.move();
        snake.display();
        
    }
}

/* 
 * OUTPUT- 
The Lion makes sound: Roar
The Lion is moving.
Species = Lion age= 5 sound = Roar
The Elephant makes sound: Trumpet
The Elephant is moving.
Species = Elephant age= 10 sound = Trumpet
The Snake makes sound: Hiss
The Snake is moving.
Species = Snake age= 3 sound = Hiss
 */