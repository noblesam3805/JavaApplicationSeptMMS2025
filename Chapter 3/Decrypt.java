import java.util.ArrayList;
import java.util.Scanner;

public class DecryptDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter encrypted number: ");
        String number = input.nextLine();

        ArrayList<Integer> digits = new ArrayList<>();

        // STEP 1: convert characters to digits
        for (int i = 0; i < number.length(); i++) {
            digits.add(number.charAt(i) - '0');
        }

        // STEP 2: swap back
        for (int i = 0; i < digits.size() - 1; i += 2) {

            int temp = digits.get(i);

            digits.set(i, digits.get(i + 1));

            digits.set(i + 1, temp);
        }

        // STEP 3: decrypt digits
        for (int i = 0; i < digits.size(); i++) {

            digits.set(i, (digits.get(i) + 10 - 7) % 10);
        }

        // STEP 4: print result
        System.out.print("Decrypted number: ");

        for (int d : digits) {
            System.out.print(d);
        }

        input.close();
    }
}