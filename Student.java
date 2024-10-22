
public class Student {
    int rollNumber;
    String name;
    long mobileNumber;

    public Student(int rollNumber, String name, long mobileNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println();
    }
public static void main(String[] args) {
        // Creating objects for 5 students
        Student student1 = new Student(1, "John Doe", 890);
        Student student2 = new Student(2, "Jane Smith", 210);
        Student student3 = new Student(3, "Bob Johnson", 233);
        Student student4 = new Student(4, "Alice Williams", 766);
        Student student5 = new Student(5, "Charlie Brown", 555);

        // Displaying details for each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
    }
}
