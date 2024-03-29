import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Minimum Range of a Number : ");
        int minRange = sc.nextInt(); // inclusive
        System.out.print("Enter Maximum Range of a Number : ");
        int maxRange = sc.nextInt(); // exclusive
        int Number = ThreadLocalRandom.current().nextInt(minRange, maxRange);

        System.out.print("enter no.of chances : ");
        int NoOfAttempts = sc.nextInt();
        int roundsWon = 0;
        boolean playAgain = true;
        while (playAgain) {

            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("\n********************");
            System.out.println("\nI've picked a Number between " + minRange + " and " + maxRange + ". Can you guess what it is ?");

            while (attempts < NoOfAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == Number) {
                    System.out.println("Congratulations 🥳! You guessed the correct Number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else {
                    if (Math.abs(Number - userGuess) < 5) {
                        System.out.println("Too Close! Try again.");
                    } else {
                        System.out.println(Number > userGuess ? ("your guess is too Low ") : "your guess is too High ");
                        System.out.println("you have " + (NoOfAttempts - attempts) + " chances left ");
                    }
                }
            }


            if (!guessedCorrectly) {
                System.out.println("Sorry, you've exceeded the maximum Number of attempts. The correct Number was: " + Number);
            }
            System.out.println("\n********************");
            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next().toLowerCase();
            playAgain = playChoice.equals("yes") || playChoice.equals("y");
        }

        System.out.println("\nThank you for playing! You won " + roundsWon + " round(s).");
        sc.close();
    }
}
