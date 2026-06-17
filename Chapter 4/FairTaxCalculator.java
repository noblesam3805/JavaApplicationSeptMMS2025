import java.util.Scanner;

public class FairTaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double housing;
        double food;
        double clothing;
        double transportation;
        double education;
        double healthcare;
        double vacations;

        System.out.print("Enter housing expenses: ");
        housing = input.nextDouble();

        System.out.print("Enter food expenses: ");
        food = input.nextDouble();

        System.out.print("Enter clothing expenses: ");
        clothing = input.nextDouble();

        System.out.print("Enter transportation expenses: ");
        transportation = input.nextDouble();

        System.out.print("Enter education expenses: ");
        education = input.nextDouble();

        System.out.print("Enter healthcare expenses: ");
        healthcare = input.nextDouble();

        System.out.print("Enter vacation expenses: ");
        vacations = input.nextDouble();

        double totalExpenses = housing + food + clothing +
                               transportation + education +
                               healthcare + vacations;

        double fairTax = totalExpenses * 0.23;

        System.out.printf("%nTotal Expenses: $%,.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (23%%): $%,.2f%n", fairTax);

        input.close();
    }
}