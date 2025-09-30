import java.util.Scanner;

public class Task2_FuelCosts {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;

        double price = 0;
        double cost100 = 0;
        double mpg = 0;
        double dist = 0;
        double tank = 100;

        String newLine = "";
        String trash = "";

        do {
            System.out.println("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                newLine = in.nextLine();
                done = true;

                do {
                    System.out.println("Enter price of gas per gallon: ");
                    if (in.hasNextDouble())
                    {
                        price = in.nextDouble();
                        newLine = in.nextLine();
                        done = true;

                        cost100 = 100 / mpg * price;
                        System.out.println("The price of gas to travel 100 miles is $" + cost100);

                        dist = tank * mpg;
                        System.out.println("The distance  able to be traveled with gas in tank is " + dist + tank);
                    } else {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid value.");
                        done = false;
                    }
                } while (!done);
            }
                else{
                    trash = in.nextLine();
                    System.out.println(trash + " is not a valid value.");
                    done = false;
                }

        }while(!done);




    }
}
