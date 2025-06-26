import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize
        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;
        //do while 1
        do{
            //Prompt
            System.out.println("What is the width of the rectangle?");
            if (in.hasNextDouble()){
                //good to go double
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered the width as: " + trash);
                System.out.println("Please enter a valid number.");
            }

        }while (!done);
        done = false;

        //do while 2
        do{
            //Prompt2
            System.out.println("What is the height of the rectangle?");
            if (in.hasNextDouble()){
                //good to go double
                height = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered the width as: " + trash);
                System.out.println("Please enter a valid number.");
            }

        }while (!done);
        //Print Area and Perimeter
        double area = width * height;
        double perimeter = 2.0 * (width + height);
        System.out.println("The area of the rectangle is " + area + " and the perimeter of the rectangle is " + perimeter);
        //Print length of diagonal
        double diagonal = Math.sqrt(width * width + height * height);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}
