import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Initialize
        double celsius = 0;
        double farenheit = 0;
        String trash = "";
        boolean done = false;



        // do while check for good input
        do {
            // Prompt
            System.out.print("What is the temperature in Celisus?: ");

            if(in.hasNextDouble()) //Input is a double
            {
                celsius = in.nextDouble();
                in.nextLine(); //clear buffer
                done = true; //ends loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou said your temperature in Celsius was: " + trash);
                System.out.println("Please enter a valid amount!");
            }
        } while(!done);
        //Convert C to F (C*9/5+32)
        farenheit = (celsius * (9.0/5.0) + 32.0);

        //Output temp in F
        System.out.println("\nThe temperature in farenheit of " + celsius + "°C is " + farenheit + "°F.");
    }
}
