import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        // Loop to bulletproof input until the user enters a valid number
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine(); // clear the newline from buffer
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Enter a valid number!");
            }
        } while (!done);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");
    }
}