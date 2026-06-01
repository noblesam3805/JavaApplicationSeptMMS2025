import java.util.Scanner;
import java.util.ArrayList;

/**
write a java program to accept 10numbers find the sum of the 1st 5th and 10th number
and then multiply the sum by the sum of the 3rd, 8th
and 2nd number and substract the result from the sum of the 4th 7th 6th and 9th number and check if the result 
of your last calculation is greater than or equals to 100, if true display'hurray i did it' else display'i still need to learn more in java'
**/

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
//accept 10numbers
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }
//find the sum of the 1st 5th and 10th number
        int sum1 = numbers.get(0) + numbers.get(4) + numbers.get(9);

//sum of the 3rd, 8th and 2nd number
        int sum2 = numbers.get(2) + numbers.get(7) + numbers.get(1);
		
//multiply sum1 by the sum of the 3rd, 8th and 2nd number(sum2)
        int multiplication = sum1 * sum2;

//sum of the 4th 7th 6th and 9th number
        int sum3 = numbers.get(3) + numbers.get(6) + numbers.get(5) + numbers.get(8);

//substract multiplied sums(sum1 times sum2) from sum3
        int result = sum3 - multiplication;

        System.out.println("Result = " + result);

        if (result >= 100) {
            System.out.println("Hurray I did it");
        } else {
            System.out.println("I still need to learn more in Java");
        }
		
		
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("multiplication = " + multiplication);
		System.out.println("sum3 = " + sum3);
		System.out.println("result = " + result);
		
        input.close();
    }
}



//substract the result(sum1 times sum2)from the sum of the 4th 7th 6th and 9th