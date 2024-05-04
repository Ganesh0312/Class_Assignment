/* 
12)Create a class Book with two constructors: one that takes title and)
author as parameters, and another that takes only title
*/

public class Book{

    String auther;
    String title;
    public Book(String a,String t){
        auther=a;
        title=t;
        System.out.println("Auther= "+auther+" Title= "+title);
    }

    public Book(String a){
        auther=a;
        System.out.println("Auther= "+auther+" Title= "+title);
    }
    public static void main(String args[]){
        Book b=new Book("Ganesh","Harry potter");
        Book b1=new Book("Naruto");
    }
}
/* Auther= Ganesh Title= Harry potter
Auther= Naruto Title= null */