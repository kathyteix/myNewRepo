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
/*
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
*/

        // Create an inner loop (for loop)  (repetition) control structure:
        for (int i = 0; i < 3; i++){
            System.out.println("\nOuter For loop " + i);
            for (int x = 0; x < 5; x++){
                System.out.println("Inner For loop " + x);
                x++;
            }
        }
        System.out.println("\nEnd of inner loop (for loop)");

        // Create an inner loop (while loop)  (repetition) control structure:
        int i = 0;
        int x = 0;

        //outer loop
        while (i < 5){
            System.out.println("\nOuter While loop " + i);
            x = 0;
            while (x < 3){
                System.out.println("Inner While loop " + x);
                x++;
            }
            i++;
        }
    }
}