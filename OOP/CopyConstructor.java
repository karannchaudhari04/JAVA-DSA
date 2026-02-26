package OOP;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Karan";
        s1.password = "secret";
        Student s2 = new Student(s1); // Using copy constructor
         s2.password = "hidden"; // Modifying s2's password
    }
}
class Student {
    int id;
    String name;
    String password;

    Student() {
        
    }

    // Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}
