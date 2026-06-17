import java.util.Scanner;

public class GlobalWarmingQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("=== Global Warming Facts Quiz ===");

        // Question 1
        System.out.println("\n1. What is the main greenhouse gas produced by human activities?");
        System.out.println("1. Oxygen");
        System.out.println("2. Carbon Dioxide");
        System.out.println("3. Nitrogen");
        System.out.println("4. Helium");
        answer = input.nextInt();

        if (answer == 2)
            score++;

        // Question 2
        System.out.println("\n2. Which organization shared the 2007 Nobel Peace Prize with Al Gore?");
        System.out.println("1. NASA");
        System.out.println("2. WHO");
        System.out.println("3. Intergovernmental Panel on Climate Change (IPCC)");
        System.out.println("4. Greenpeace");
        answer = input.nextInt();

        if (answer == 3)
            score++;

        // Question 3
        System.out.println("\n3. Which statement reflects a common view of climate-change skeptics?");
        System.out.println("1. Climate never changes naturally");
        System.out.println("2. Human activity has no effect whatsoever");
        System.out.println("3. Natural factors may play a larger role than currently estimated");
        System.out.println("4. Greenhouse gases do not exist");
        answer = input.nextInt();

        if (answer == 3)
            score++;

        // Question 4
        System.out.println("\n4. Which of the following is often cited as evidence of global warming?");
        System.out.println("1. Melting glaciers");
        System.out.println("2. Increased snowfall everywhere");
        System.out.println("3. Decrease in sea levels");
        System.out.println("4. Growth of polar ice worldwide");
        answer = input.nextInt();

        if (answer == 1)
            score++;

        // Question 5
        System.out.println("\n5. What is the purpose of climate models?");
        System.out.println("1. Predict future climate trends");
        System.out.println("2. Measure earthquakes");
        System.out.println("3. Forecast daily stock prices");
        System.out.println("4. Calculate population growth");
        answer = input.nextInt();

        if (answer == 1)
            score++;

        System.out.println("\nYou scored " + score + " out of 5.");

        if (score == 5) {
            System.out.println("Excellent");
        } else if (score == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");

            System.out.println("\nUseful sources:");
            System.out.println("- NASA Climate");
            System.out.println("- IPCC (Intergovernmental Panel on Climate Change)");
            System.out.println("- NOAA Climate");
            System.out.println("- Climate.gov");
            System.out.println("- Global Warming Policy Foundation (skeptical viewpoint)");
        }

        input.close();
    }
}