import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalSales = 0;
        int item;

        System.out.println("Enter item number sold (1-4)");
        System.out.println("Enter -1 to finish");

        item = input.nextInt();

        while (item != -1) {

            switch (item) {

                case 1:
                    totalSales += 239.99;
                    break;

                case 2:
                    totalSales += 129.75;
                    break;

                case 3:
                    totalSales += 99.95;
                    break;

                case 4:
                    totalSales += 350.89;
                    break;

                default:
                    System.out.println("Invalid item number");
            }

            System.out.println("Enter next item number (-1 to stop): ");
            item = input.nextInt();
        }

        double earnings = 200 + (0.09 * totalSales);

        System.out.println("Total sales: $" + totalSales);
        System.out.println("Weekly earnings: $" + earnings);
    }
}
