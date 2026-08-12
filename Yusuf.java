class Student {
    int rollNo;
    String name;
    double marks;

    void display() {
        System.out.println("Roll: " + rollNo + " Name: " + name + " Marks: " + marks);
    }
}

public class Yusuf {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 123;
        s1.name = "Yusuf Khan";
        s1.marks = 47.0;
        s1.display();
    }
}