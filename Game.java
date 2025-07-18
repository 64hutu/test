import java.util.Random;
import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int numberOfTries;

    public Game() {
        this.randomNumber = generateRandomNumber();
        this.numberOfTries = 0;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Random number between 1 and 100
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}