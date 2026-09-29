import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Nationality: ");
        String nationality = sc.nextLine();

        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not Eligible for voting");
        }

        sc.close();
    }
}