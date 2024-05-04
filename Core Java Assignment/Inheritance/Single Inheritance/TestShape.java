/*4)Write a Java Program for Single Inheritance of Shape. Take a method called void
draw() and void calculateArea() */

class Shape{
     double length;
     double width;

    public void draw(String shape){
        System.out.println("Drawing "+shape+" Shape");
    }
}

class Rectangle extends Shape{
    public void area(double length, double width){
        this.length=length;
        this.width=width;

        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}
public class TestShape {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.draw("Rectangle");
        r1.area(5, 10);
    }
    
}
