import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        //Create a scanner object for input
        Scanner userInputObject = new Scanner(System.in);

        //declare variables
        int first_Number = 0;
        int second_Number = 0;
        float total = 0;
        int result_Largest = 0;

        //Ask for input
        System.out.println("\n Enter a number between 1 and 100");
        first_Number = userInputObject.nextInt();

        System.out.println("\n Enter a second number");
        second_Number = userInputObject.nextInt();

        //Add the two numbers and display it
        total = first_Number + second_Number;
        System.out.println("\n The sum of " + first_Number + " plus " + second_Number + " = " + total);

        //multiply the second number
        total = first_Number * second_Number;
        System.out.println("\n The multiplication result of " + first_Number + " * " + second_Number + " = " + total);

        //display the largest number entered
        if (first_Number < second_Number){
            System.out.println("\n The largest number you entered was " + second_Number);
        } else {
            System.out.println("\n The largest number you entered was " + first_Number);
        }
    }
}
