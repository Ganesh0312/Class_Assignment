abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle Shape");
    }
}
class Circle extends Shape{
    void draw(){
       System.out.println("Drawing Circle Shape");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square Shape");
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        Shape r=new Rectangle();
        r.draw();

       Shape c=new Circle();
        c.draw();

       Shape s=new Square();
       s.draw();
    }
}
