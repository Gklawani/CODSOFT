import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int min = 1;
        int max = 100;
        int score = 0;
        int attemptLimit = 5;


        System.out.println("Welcome to Guess the Number Game!");

        do {
            int generatedNumber = r.nextInt(max - min + 1) + min;
            int attempts = 0;
            int userGuess;

            System.out.println("Generated a Number Between " + min + " & " + max + ". Can you guess it?");

            while (true) {
                System.out.print("Enter your Guessing Number: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You Number is Correct" + attempts + " attempts.");
                    score += attempts;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (attempts >= attemptLimit) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Your final score is: " + score);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}