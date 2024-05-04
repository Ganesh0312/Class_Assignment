// 10) Create a class Rectangle with two constructors: one that takes length and width as parameters, and another that takes only one parameter

public class Rectangle{
    float length;
    float width;
    float ans;

    Rectangle(float l){
        length=l;
        System.out.println("Length = "+length+" width "+width);
    }

    Rectangle(float l,float w){
        length=l;
        width=w;
        
        ans=length*width;
        System.out.println("Length = "+length+" width "+width);
        System.out.println("Length x width  = "+ans);
    }
    public static void main(String[] args) {
        Rectangle r=new Rectangle(20);

        Rectangle r1=new Rectangle(20,30);
    }
}
/* OUTPUT
Length = 20.0 width 0.0
Length = 20.0 width 30.0
Length x width  = 600.0
 */