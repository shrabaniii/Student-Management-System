package student;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                students.add(new Student(id, name));

                System.out.println("Student Added!");

            } else if (choice == 2) {

                for (Student s : students) {
                    System.out.println("ID: " + s.id +
                            " Name: " + s.name);
                }

            } else if (choice == 3) {

                System.out.println("Goodbye!");
                break;
            }
        }

        sc.close();
    }
}
