import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\nStudent Details:");

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Marks: " + marks);

        sc.close();
    }
}