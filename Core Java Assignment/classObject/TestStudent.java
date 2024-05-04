 class Student {
    // Attributes
    private String name;
    private int age;
    private char grade;
    
    // Constructor
    public void insert(String n, int a, char g) {
        name = n;
        age = a;
        grade = g;
    }
    
    // Methods
    public void study() {
        System.out.println(name + " is studying.");
    }
    
    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }
    
    public void submitAssignment() {
        System.out.println(name + " is submitting an assignment.");
    }
}
public class TestStudent{
    public static void main(String args[]){
        Student john=new Student();
        john.insert("john", 23, 'a');
        john.study();
        john.takeExam();
        john.submitAssignment();

        Student jane=new Student();
        jane.insert("jane", 24, 'a');
        jane.study();
        jane.takeExam();
        jane.submitAssignment();

        Student bob=new Student();
        bob.insert("bob", 25, 'a');
        bob.study();
        bob.takeExam();
        bob.submitAssignment();
    }

}

/*OUTPUT 
 john is studying.
john is taking an exam.
john is submitting an assignment.
jane is studying.
jane is taking an exam.
jane is submitting an assignment.
bob is studying.
bob is taking an exam.
bob is submitting an assignment.
 */