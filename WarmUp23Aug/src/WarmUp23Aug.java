// WarmUp23Aug.java
// Name: Kathy Teixeira

import java.util.Scanner;

public class WarmUp23Aug {
    public static void main(String[] args){
        System.out.println("\n Welcome to Java WarmUp ");
        System.out.println("\n ======================= ");
        System.out.println("\n Tuesday August 23, 2022 ");

        // Today we will create a scanner object and get input from the user
        // The user input will be used to demonstrate our knowledge and understanding of
        // the three control structures -- sequence, selection, and repetition!

        // Helpful references for today's coding module:
        // https://www.w3schools.com/java/java_user_input.asp
        // https://www.w3schools.com/java/java_conditions.asp
        // https://www.w3schools.com/java/java_for_loop.asp
        // https://www.w3schools.com/java/java_while_loop.asp
        // https://www.geeksforgeeks.org/system-out-println-in-java/#:~:text=Like%20Article-,
        // Java%20System.,class%20defined%20in%20the%20java.

        // Variable Declaration Section....
        // variables are declared and initialized here.
        // these variables will be used for input, processing and output

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

        // Create a decision control structure
        if (num1 > num2)
        {
            System.out.println("\n " + num1 + " is greater than " + num2);
            System.out.println("\n    num1 is greater than num2!");
        }
        else {
            System.out.println("\n " + num2 + " is greater than " + num1);
            System.out.println("\n    num2 is greater than num1!");
        }

        // Create a repetition control structure
        for (int i = 0; i < 10; i++ ) {
            System.out.println("\n num1 = " + num1 + " and the value of i is: " + i);
        }

        // Create another repetition control structure.
        // memorize: "initialize, check, and change"
        int myLoopControlVariable = 0;

        while (myLoopControlVariable < 10)
        {
            System.out.println("\n num1 = " + num1 + " and the value of myLoopControlVariable is: "
                    + myLoopControlVariable);
            myLoopControlVariable++;
        }

        ///////////// FLASH CODE CHALLENGE SECTION    //////////////////////////////////////////////////
        // flash bonus point challenge! 10 bonus points!
        // Code up a nested decision control structure that gets three integers from the user and outputs
        // the largest!
        // Each lab partner must code this flash challenge for bonus point redemption.

        // Variables for the 3 numbers I need
        int num_one = 0;
        int num_two = 0;
        int num_three = 0;

        // Prompt user for the numbers
        System.out.println("\nPlease enter a number.");
        num_one = scanner.nextInt();

        System.out.println("\nPlease enter a second number");
        num_two = scanner.nextInt();

        System.out.println("\nPlease enter a third and last number");
        num_three = scanner.nextInt();

        // Decision structure - find which number is largest entered
        if (num_one > num_two && num_one > num_three)
        {
            System.out.println("\nThe largest number is the first number you entered " + num_one);
        }
        else if (num_two > num_one && num_two > num_three) {
            System.out.println("\nThe largest number is the second number you entered " + num_two);
        }
        else if (num_three > num_one && num_three > num_two){
            System.out.println("\nThe largest number is the third number you entered " + num_three);
        }
    }
}
