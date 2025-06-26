import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        //initialize
        int guess = 0;
        String trash = "";
        boolean done = false;
        //Randomize
        int random = generator.nextInt(10) + 1;

        //do while
        do {
            //Prompt
            System.out.print("Guess the random number [1-10]: ");
            //if else
            if (in.hasNextInt()){
                //ok to go int
                guess = in.nextInt();
                in.nextLine(); //clears buffer
                if(guess >= 1 && guess <= 10)
                    done = true; //valid guess
                else{
                    //invalid guess
                    System.out.println("You guessed " + guess);
                    System.out.println("Please enter a number between 1 - 10");
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("You guessed " + trash);
                System.out.println("Please enter a number between 1 - 10");
            }
        }while (!done);

        //Check high low or even
        if(guess == random){
            //On the money
            System.out.println("You guessed right on the money!");
        }else if (guess > random){
            //greater than
            System.out.println("Your guess was high!");
        }
        else {
            //less than
            System.out.println("Your guess was low!");
        }
        System.out.println("Your guess : " + guess + " The random number: " + random);

    }
}
