import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int targetNumber = generator.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        boolean done = false;

        // Loop to bulletproof guess input between 1 and 10
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a valid integer.");
            }
        } while (!done);

        System.out.println("The computer's random number was: " + targetNumber);

        if (userGuess < targetNumber) {
            System.out.println("Your guess was too low!");
        } else if (userGuess > targetNumber) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}