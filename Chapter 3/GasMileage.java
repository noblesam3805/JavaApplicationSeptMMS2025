import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter miles driven and gallons used (-1 to stop)");

        miles = input.nextInt();

        while (miles != -1) {

            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.println("Enter miles driven and gallons used (-1 to stop)");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            double overallMpg = (double) totalMiles / totalGallons;
            System.out.println("Combined miles per gallon: " + overallMpg);
        } else {
            System.out.println("No data entered.");
        }
    }
}
