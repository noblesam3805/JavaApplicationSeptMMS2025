import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;

        System.out.println("Enter account number (-1 to stop): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.println("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.println("Enter total charges: ");
            charges = input.nextInt();

            System.out.println("Enter total credits: ");
            credits = input.nextInt();

            System.out.println("Enter credit limit: ");
            creditLimit = input.nextInt();

            newBalance = beginningBalance + charges - credits;

            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println("\nEnter account number (-1 to stop): ");
            accountNumber = input.nextInt();
        }
    }
}
