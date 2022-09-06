import java.util.Scanner;

public class WarmUp25Aug {
    public static void main(String[] args){
        System.out.println("\n Welcome to Java WarmUp ");
        System.out.println("\n ======================= ");
        System.out.println("\n Tuesday August 25, 2022 ");

        // Today we will create a couple loops

        // Variable Declaration Section....
        // variables are declared and initialized here.
        // these variables will be used for inpout, processing and output

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Create a scanner object that will be used for user input.
        Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user.
        System.out.println("\n Please enter a value for num1: ");
        num1 = scanner.nextInt();

        System.out.println("\n Enter a second integer: ");
        num2 = scanner.nextInt();

        System.out.println("\n And... one more int, please: ");
        num3 = scanner.nextInt();

        // Output the three numbers.
        System.out.println("\n Thank you for entering these three numbers: " + num1 + ",  " + num2 + ", " + num3);

        // Create a repetition control structure
        for (int i = 0; i < 10; i++ ) {
            System.out.println("\n num1 = " + num1 + " and the value of i is: " + i);
        }

        // Create an inner loop (for loop)  (repetition) control structure:

        // Create an inner loop (while loop)  (repetition) control structure:


    }
}