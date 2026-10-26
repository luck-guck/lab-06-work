import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // Loop to bulletproof gallons input
        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a valid number.");
            }
        } while (!done);

        done = false;
        // Loop to bulletproof MPG input
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a valid number.");
            }
        } while (!done);

        done = false;
        // Loop to bulletproof price per gallon input
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a valid number.");
            }
        } while (!done);

        double costPer100Miles = (100.0 / mpg) * pricePerGallon;
        double totalDistance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
        System.out.println("Car can go " + totalDistance + " miles with a full tank of gas.");
    }
}