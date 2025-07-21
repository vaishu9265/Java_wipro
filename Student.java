import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    // Constructor
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating array to store 3 students
        Student[] students = new Student[3];

        // Input student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            // Create student object and store in array
            students[i] = new Student(id, name, age);
        }

        // Display all student details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
