import java.util.Scanner;
import static java.lang.System.out;


// kt - 08/30/2022
// WARNING: This code has bugs! You must debug this code to have a successful java program!!
//

// Demonstrate your mastery of intelliJ by...
//    1) adding, editing, deleting source files in a project
//    2) create a new java class file with intelliJ and add it to your project
//    3) create a new project and.. add, edit, delete, save, open new *.cpp files -- where are your source files saved?
//    4) break intelliJ and fix ix
//    5) break intelliJ again and fix it again!
//
// Code up a method
//    1) get your method working
//    2) code up a multi-parameter method and use it in a java program!
//    advanced) get two ints from the user and output the sum of the two numbers
//    advanced02) code up a method that use "overloading"

// References:
// https://www.w3schools.com/java/java_methods.asp
// https://www.w3schools.com/java/java_methods_param.asp
// https://www.w3schools.com/java/java_methods_overloading.asp

public class WarmUp30Aug {
    static void anyMethodName() {
        System.out.println("\n\n Hello from anyMethodName()!");
    }

    static int addTwoNumbers(int num1, int numTwo) {
        // declare and initialize a local variable to use in this method
        int result = 0;

        // process the input
        result = num1 + numTwo;

        // return the result of processing!
        return result;
    }

    //multi parameter method using overload
    static int twoNumbers(int number1, int number_2){
        int result = 0;
        result = number1 + number_2;
        return  result;
    }

    static double twoNumbers(double number1, double number2){
        double result = 0;
        result = number1 + number2;
        return  result;
    }

    static int highestNumber(int num1, int num2, int num3){
        // Decision structure - find which number is largest entered
        int highNum = 0;

        if (num1 > num2 && num1 > num3)
        {
            highNum = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            highNum = num2;
        }
        else if (num3 > num1 && num3 > num2){
            highNum = num3;
        }
        return  highNum;
    }

    public static void main(String[] args) {
        //Create a scanner object for input
        Scanner myInput = new Scanner(System.in);

        // variable declaration section
        int num1 = 1;
        int num2 = 2;

        System.out.println("\n\n Welcome to WarmUp 30 Aug 22!\n\n");

        anyMethodName();

        out.println("\n The sum of two numbers is: " + addTwoNumbers(num1, num2) + "\n\n");


        //    2) code up a multi-parameter method and use it in a java program!
        //    advanced) get two ints from the user and output the sum of the two numbers
        //    advanced02) code up a method that use "overloading"

        // Variables for input values
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;

        //Ask for input
        System.out.println("\nEnter a number ");
        num_1 = myInput.nextInt();

        System.out.println("\nEnter a second number");
        num_2 = myInput.nextInt();

        System.out.println("\nEnter a third number");
        num_3 = myInput.nextInt();

        // Display the sum of the numbers
        out.println("\nThe sum of the numbers you entered is: " + twoNumbers(num_1, num_2) + "\n");

        out.println("\nThe sum of two double number is: " + twoNumbers(num_1, num_2) + "\n");

        out.println("\nThe largest number you entered was " + highestNumber(num_1, num_2,num_3) + "\n");

    }
}
