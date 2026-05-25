import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        System.out.println("Enter number 1: ");
        number = input.nextInt();
        largest = number;

        while (counter < 10) {

            System.out.println("Enter number " + (counter + 1) + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("Largest number is: " + largest);
    }
}
