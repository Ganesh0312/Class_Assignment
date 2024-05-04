class Rectangle{
    int lenghth;
    int width;

    void insert(int l,int w){
        lenghth=l;
        width=w;
    }

    
    void area(){
        int area=lenghth*width;
        System.out.println(" Area = "+area);
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();

        r1.insert(5, 3);
        r2.insert(11,6);

        r1.area();
        r2.area();
        
    }
    
}
