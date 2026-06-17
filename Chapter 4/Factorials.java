public class Factorials {
    public static void main(String[] args) {

        long factorial = 1;

        System.out.printf("%-5s %-20s%n", "n", "n!");

        for (int n = 1; n <= 20; n++) {
            factorial *= n;
            System.out.printf("%-5d %-20d%n", n, factorial);
        }
    }
}