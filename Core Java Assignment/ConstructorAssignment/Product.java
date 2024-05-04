/*13)Create a class Product with two constructors: one that takes name
and price as parameters, and another that takes only name */

public class Product{
    String name;
    int price;

    public Product(String n,int p){
        name=n;
        price=p;
        System.out.println("Product Name= "+name+" Product price = "+price);
    }
    public Product(String n){
        name=n;
        System.out.println("Product Name= "+name+" Product price = "+price);
    }
    public static void main(String args[]){
        Product p=new Product("Watch",5000);
        Product p1=new Product("Mobile");
    }
}
/*
Product Name= Watch Product price = 5000
Product Name= Mobile Product price = 0
 */