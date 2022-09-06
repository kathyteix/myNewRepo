import java.util.Scanner;


public class WarmUp01Aug22 {

    // Method to determine the day of the week
     static String dayOfWeek(int day){
         String theDay = "";
        switch (day) {
            case 1:
                theDay = "Sunday";
                break;
            case 2:
                theDay = " Monday";
                break;
            case 3:
                theDay = "Tuesday";
                break;
            case 4:
                theDay = "Wednesday";
                break;
            case 5:
                theDay = "Thursday";
                break;
            case 6:
                theDay = "Friday";
                break;
            case 7:
                theDay = "Saturday";
                break;
            default:
                theDay = "You need to enter 1-7";
        }
        return theDay;
    }

    // Method that will return the largest number entered of 3
    static int highestNumber(int num1, int num2, int num3){
        int highNum = 0;

        // Decision structure - find which number is largest entered
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

        System.out.println("\n\n Welcome to WarmUp 01 September 22!\n\n");

        // Variables for 3 integers entered
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Ask for input
        System.out.println("\nEnter a first number:");
        num1 = myInput.nextInt();

        System.out.println("\nEnter a second number:");
        num2 = myInput.nextInt();

        System.out.println("\nEnter a third number:");
        num3 = myInput.nextInt();

        System.out.println("\nThe highest number you entered was: " + highestNumber(num1,num2, num3) );

        // Second method to determine the day of the week
        int theDay = 0;

        System.out.println("\nEnter a a number from 1 to 7 to determine the day of the week:");
        theDay = myInput.nextInt();
        System.out.println("\nBased on the number you entered, today is " + dayOfWeek(theDay) + "\n") ;
    }
}
