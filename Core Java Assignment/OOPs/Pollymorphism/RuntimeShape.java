class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
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
public class RuntimeShape {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.draw();

    Circle c=new Circle();
    c.draw();

    Square s=new Square();
    s.draw();
    }
}
