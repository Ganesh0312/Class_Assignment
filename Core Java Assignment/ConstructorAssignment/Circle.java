// 7)Create a class Circle with a parameterized constructor that initializes the radius of the circle.
public class Circle{
    int dimeter;
    int radios;

    Circle(int d){
        dimeter=d;
        radios=dimeter/2;

        System.out.println("Radius of Circle = "+ radios);
    }

    public static void main(String args[]){
        Circle c=new Circle(24);
    }
}
// OUTPUT ;- Radius of Circle = 12