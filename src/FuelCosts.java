import java.sql.SQLOutput;
import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize
        boolean done = false;
        double gallons = 0;
        double mpg = 0;
        double price = 0;
        String trash = "";
        //do while 1
        do{
            //Prompt1
            System.out.print("How many gallons of gas are in the tank?\nGallons: ");
            if (in.hasNextDouble()){
                //good to go double
                gallons = in.nextDouble();
                in.nextLine(); //clear buffer
                done = true;
            }
            else{
                //trash and repeat
                trash = in.nextLine();
                System.out.println("You entered " + trash + " gallons.");
                System.out.println("Please enter a valid number.");
            }
        }while (!done);
            done = false;

        //do while 2
        do{
            //Prompt2
            System.out.print("What is the fuel efficiency?\nMiles per gallon: ");
            if (in.hasNextDouble()){
                //good to go double
                mpg = in.nextDouble();
                in.nextLine(); //clear buffer
                done = true;
            }
            else{
                //trash and repeat
                trash = in.nextLine();
                System.out.println("You entered " + trash + " mpg.");
                System.out.println("Please enter a valid number.");
            }
        }while (!done);
        done = false;
        //do while 3
        do{
            //Prompt3
            System.out.print("What is the price of gas?\n$: ");
            if (in.hasNextDouble()){
                //good to go double
                price = in.nextDouble();
                in.nextLine(); //clear buffer
                done = true;
            }
            else{
                //trash and repeat
                trash = in.nextLine();
                System.out.println("You entered " + trash + " as the price.");
                System.out.println("Please enter a valid number.");
            }
        }while (!done);

        //print cost to drive 100 miles (100 * $/g / mpg)
        System.out.println("The cost to drive 100 miles is $" + (100.0 * price / mpg) + ".");
        //print how far on a full tank (gal * mpg)
        System.out.println("On a full tank you can drive " + (gallons * mpg) + " miles.");

    }
}
