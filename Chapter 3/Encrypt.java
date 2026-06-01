import java.util.ArrayList;
import java.util.Scanner;

public class EncryptDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = input.nextLine();

        ArrayList<Integer> digits = new ArrayList<>();

        // STEP 1: convert string digits to integers
        for (int i = 0; i < number.length(); i++) {
            digits.add(number.charAt(i) - '0');
        }

        // STEP 2: encrypt digits
        for (int i = 0; i < digits.size(); i++) {
            digits.set(i, (digits.get(i) + 7) % 10);
        }

        // STEP 3: swap neighboring pairs
        for (int i = 0; i < digits.size() - 1; i += 2) {

            int temp = digits.get(i);

            digits.set(i, digits.get(i + 1));

            digits.set(i + 1, temp);
        }

        // STEP 4: print encrypted result
        System.out.print("Encrypted number: ");

        for (int d : digits) {
            System.out.print(d);
        }

        input.close();
    }
}