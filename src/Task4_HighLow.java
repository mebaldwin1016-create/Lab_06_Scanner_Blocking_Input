import java.util.Random;
import java.util.Scanner;

public class Task4_HighLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean done = false;

        int numToGuess = rnd.nextInt(10) + 1;// 0-9 + 1 -> 1-10
        int guess = 0;

        String newLine = "";
        String trash = "";

        do {
            System.out.println("Try to guess a number (1-10) in one try: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                newLine = in.nextLine();
                done = true;

                if (guess == numToGuess) {
                    System.out.println("Excellent you guessed my number: " + numToGuess);
                } else if (guess < numToGuess) {
                    System.out.println("No. That is lower than my number: " + numToGuess);
                } else {
                    System.out.println("No. That is higher than my number: " + numToGuess);
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a number");
                done = false;
            }
        }
        while (!done);

    }
}