import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(Integer[] numList, int min, int max, int targetNum){
        while (min <= max){
            int current = min + (max - min) / 2;
            System.out.println("Minimum is: " + min);
            System.out.println(("Maximum is: " + max));
            System.out.println("Current is: " + current );

            if (numList[current].equals(targetNum)){
                return current;
            }
            if (targetNum > numList[current]){
                min = current + 1;
            }
            else {
                max = current - 1;
            }
        }
        return targetNum;
    }

    public static void main(String[] args) {
        System.out.println("\nWelcome to Binary Search Program!");

        //create scanner object
        Scanner myInput = new Scanner(System.in);

        //Array of integers
        Integer[] numList = {8,4,2,9,7,1,3,5,6,0};
        Arrays.sort(numList);

        // Convert array to list
        List<Integer> numLinkList = new LinkedList<>(Arrays.asList(numList));

        // Create a LinkedList by converting list
        LinkedList<Integer> linkedList = new LinkedList<Integer>(numLinkList);

        //Find length of array
        int arrLength = numList.length;

        //Prompt user for number to search on
        System.out.println("Enter a number between 0 and 9 to search for.");
        int find = myInput.nextInt();

        //Call method to do binary search for number
        int found = binarySearch(numList,0, arrLength -1, find);

        System.out.println(numLinkList);

        if (found != -1){
            System.out.println("The value was located at index: " + found);
        }
        else {
            System.out.println("The value was not found in the list");
        }

    }
}
