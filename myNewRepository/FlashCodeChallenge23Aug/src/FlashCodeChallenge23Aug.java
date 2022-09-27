// FlashCodeChallenge23Aug
// kt

import java.util.Scanner;

public class FlashCodeChallenge23Aug {
    public static  void main(String[] args){

        // Create a scanner object that will be used for user input.
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("\nPlease enter a second number.");
        num_two = scanner.nextInt();

        System.out.println("\nPlease enter a third and last number.");
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
