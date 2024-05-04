 class Book {

    private String title;
    private String author;
    private String genre;

    public void insert(String t, String a, String g) {
        title = t;
        author = a;
        genre = g;
    }
    
    public void read() {
        System.out.println("Reading Book " + title + " by " + author);
    }
    
    public void getAuthorInfo() {
        System.out.println("Author Name: " + author);
        System.out.println(" writted book "+title+ "on geoner "+genre);
    }

 }
 public class TestBook{
    public static void main(String args[]){
        Book fictionBook=new Book();
        fictionBook.insert("Harry Potter", "J. K. Rowling", "fictionBook");   
        fictionBook.read();
        fictionBook.getAuthorInfo();  
        
        Book nonFictionBook=new Book();
        nonFictionBook.insert("Robert Openhammer", "James Baldwin.", "nonFictionBook");   
        nonFictionBook.read();
        nonFictionBook.getAuthorInfo();  

    }
 }

 /*Reading Book Harry Potter by J. K. Rowling
Author Name: J. K. Rowling
 writted book Harry Potteron geoner fictionBook
Reading Book Robert Openhammer by James Baldwin.
Author Name: James Baldwin.
 writted book Robert Openhammeron geoner nonFictionBook */