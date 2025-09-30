import java.util.Random;
import java.util.Scanner;

public class Task4_HighorLow {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean done = false;

        int numToGuess = rnd.nextInt(10) + 1; // 0-9 + 1 -> 1-10
        int guess = 0;

        String newLine = "";
        String trash = "";

        do {
            System.out.println("Try to guess a number (1-10) in one try: ");
            if (in.hasNextInt())
            {
                numToGuess = rnd.nextInt();
                newLine = in.nextLine();
                done = true;

                do {
                    System.out.println(guess==numToGuess);
                    if (in.hasNextInt()) {
                        guess = in.nextInt();
                        newLine = in.nextLine();
                        System.out.println("You guessed: " + guess);
                        System.out.println("The number was: " + numToGuess);
                        done = true;

                    } else {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid value.");
                        done = false;
                    }
                } while (!done);
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid value.");
                done = false;
            }
        }while(!done);



    }
}
