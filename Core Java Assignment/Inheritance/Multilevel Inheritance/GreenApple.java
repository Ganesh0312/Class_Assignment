class Fruit {
    public void eat() {
        System.out.println("Eating fruit...");
    }
}

class Apple extends Fruit {
    public void bite() {
        System.out.println("Biting an apple...");
    }
}

class GreenApple extends Apple {
    public void sourTaste() {
        System.out.println("Green apple has a sour taste...");
    }
    public static void main(String[] args) {
        GreenApple g1 = new GreenApple();
        
        g1.eat(); 
        g1.bite(); 
        g1.sourTaste(); 
    }
}