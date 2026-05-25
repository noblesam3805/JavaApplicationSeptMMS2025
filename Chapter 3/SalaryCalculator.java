import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Enter hours worked for employee " + i + ": ");
            double hoursWorked = input.nextDouble();

            System.out.println("Enter hourly rate for employee " + i + ": ");
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;

                grossPay = (40 * hourlyRate) +
                           (overtimeHours * hourlyRate * 1.5);
            }

            System.out.println("Gross pay for employee " + i + " = $" + grossPay);
            System.out.println();
        }
    }
}
