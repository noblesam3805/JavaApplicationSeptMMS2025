public class FacebookGrowth {

    public static void main(String[] args) {

        double users = 1_000_000_000.0;
        int monthsTo15 = 0;
        int monthsTo20 = 0;

        double currentUsers = users;

        while (currentUsers < 1_500_000_000.0) {
            currentUsers *= 1.04;
            monthsTo15++;
        }

        currentUsers = users;

        while (currentUsers < 2_000_000_000.0) {
            currentUsers *= 1.04;
            monthsTo20++;
        }

        System.out.println("Months to reach 1.5 billion users: " + monthsTo15);
        System.out.println("Months to reach 2 billion users: " + monthsTo20);
    }
}