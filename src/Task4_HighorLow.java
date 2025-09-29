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

            System.out.println("Enter a number");
            if (in.hasNextInt())
            {
                numToGuess = rnd.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();

            }
        }while(!done);




    }
}
