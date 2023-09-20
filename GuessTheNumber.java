import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5;
        int attempts = 0;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < targetNumber) {
                System.out.println("Too low!");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                break;
            }

            if (attempts < maxAttempts) {
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            } else {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
