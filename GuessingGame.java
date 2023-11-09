import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("Welcome to the Guessing Game!");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (true) {
                System.out.print("Take a guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                    break;
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }
        } while (true);

        scanner.close();
    }
}
