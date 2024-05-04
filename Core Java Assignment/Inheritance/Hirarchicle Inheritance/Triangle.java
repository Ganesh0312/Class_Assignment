
class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public double calculateArea() {
        return 0.0; 
    }

    public double calculatePerimeter() {
        return 0.0; 
    }
}


class Circle extends Shape {
  
    private double radius;

  
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rectangle extends Shape {
    
    private double length;
    private double width;

   
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

   
    public double calculateArea() {
        return length * width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    public static void main(String[] args) {
    
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);

        
        System.out.println("Shape: " + circle.getName());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("Shape: " + rectangle.getName());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println();

        System.out.println("Shape: " + triangle.getName());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}

