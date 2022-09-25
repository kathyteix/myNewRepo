// bigAndSmallNumber java program
// kathy teixeira 09/23/2022

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class bigAndSmallNumber {
    //Sort Array and return the first value which would be the smallest number
    public static int getSmallest(int[] a){
        Arrays.sort(a);
        return a[0];
    }
    public static int getLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total -1];
    }

    public static void main(String[] args){
        System.out.println("\nWelcome to bigAndSmallNumbers Game!");
        //create scanner object
        Scanner myInput = new Scanner(System.in);

        //Create an empty array of 20 elements
        int[] numbers1 = new int[20];
        try {
            //Prompt user to enter twenty numbers - Catch if invalid entry
            for (int i=0;i<20;i++){
                System.out.println("Enter a number for entry: " + i + "\n");
                numbers1[i] = myInput.nextInt();
                if (numbers1[i] != (int)numbers1[i]){
                        throw new InputMismatchException("Invalid Entry");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Must enter a number");
        }

        //Display the numbers entered
        for (int i=0;i<20;i++){
            System.out.printf("\nYou entered numbers: " + numbers1[i]);
        }

        //One example of how to Display the smallest number in the array
        //Pass array to a method to sort return first and last number
        System.out.println("\nSmallest: "+getSmallest(numbers1));
        System.out.println("Largest: "+getLargest(numbers1,20));

        //Another example of finding smallest and largest number in array
        // assign first element of an array to largest and smallest
        int smallest = numbers1[0];
        int largetst = numbers1[0];

        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i] > largetst)
                largetst = numbers1[i];
            else if (numbers1[i] < smallest)
                smallest = numbers1[i];
        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);

    }
}
