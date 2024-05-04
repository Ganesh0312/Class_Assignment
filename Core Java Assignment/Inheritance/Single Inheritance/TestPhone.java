/* 7)Write a Java Program for Single Inheritance of a Phone. Take a method called void
call() and void surfInternet()*/

// Parent class
class Phone {
    public void call() {
        System.out.println("Calling...");
    }
    
    public void surfInternet() {
        System.out.println("Surfing the internet...");
    }
}

class Smartphone extends Phone {
       
}

public class TestPhone {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.call(); 
        myPhone.surfInternet(); 
    }
}
