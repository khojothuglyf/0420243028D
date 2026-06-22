import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ----- 1. Collect Student Information -----
        System.out.print("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Enter Index Number: ");
        String indexNumber = input.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(input.nextLine());

        System.out.print("Enter Gender (M/F): ");
        char gender = input.nextLine().charAt(0);

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.print("Enter Level (e.g. 100, 200, 300): ");
        int level = Integer.parseInt(input.nextLine());

        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(input.nextLine());

        // ----- 2. Determine Adult Status -----
        boolean isAdult = age >= 18;
        String adultStatus = isAdult ? "YES" : "NO";

        // ----- 3. Determine Academic Classification -----
        String academicClass;
        if (gpa >= 3.5 && gpa <= 4.0) {
            academicClass = "First Class";
        } else if (gpa >= 3.0 && gpa < 3.5) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5 && gpa < 3.0) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        // ----- 4. Display Formatted Student Profile -----
        System.out.println();
        System.out.println("===== STUDENT PROFILE =====");
        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);
        System.out.println("===========================");

        input.close();
    }
}