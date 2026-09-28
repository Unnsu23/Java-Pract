import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalAmount = price * quantity;

        System.out.println("\nTotal Amount: " + totalAmount);

        sc.close();
    }
}