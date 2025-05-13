import java.util.Random;
import java.util.Scanner;

public class Numguess {

    public static void main(String[] args) {

        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        int attempts = 0;
        int guess;
        int min = 1;
        int max = 100;
        int RandomNum = rm.nextInt((max - min) + 1) + min;

        System.out.println("Number Guessing Game!!");
        System.out.println("Guess a number between (1-100): ");

        do {
            System.out.print("Enter a Guess: ");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number:");
                sc.next();
            }
            guess = sc.nextInt();
            attempts++;

            if (guess < RandomNum) {
                System.out.println("Too Low!! Try Again");
            } else if (guess > RandomNum) {
                System.out.println("Too High!! Try Again");
            } else {
                System.out.println("CORRECT!! The number is: " + RandomNum);
                System.out.println("You Won!!");
                System.out.println("No. of Attempts: " + attempts);
            }

        } while (guess != RandomNum);

        sc.close();
    }
}
