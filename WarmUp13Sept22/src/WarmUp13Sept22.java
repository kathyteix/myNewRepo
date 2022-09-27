import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class WarmUp13Sept22 {
    //Method that builds array and displays it
    static void myArrayMethod(){
        int num1 = 0;
        String[] animals = {"lion", "tiger", "bear"};

        // Output the array of animals
        for (int i=0; i<3; i++){
            System.out.println(" in the for loop of myArrayMethod and.. i = " + i);
            System.out.println(" animal at element number " + i + " is " + animals[i]);
        }

        //Find the length of the arry
        num1 = animals.length;

        //Output the length of the array
        System.out.println("\nThe length of the animals array is: " + num1 + "\n");

        //Use the length of the array in a loop control variable to output the animal array
        for (int i=0; i<num1; i++){
            System.out.println(" in the for loop control variable animal array and .. i = " + i);
            System.out.println("    animal at element number " + i + " is " + animals[i]);
        }
    }

    //Fill new array with animal01 and animal02 and output
    static  void myArrayMethod02(String animal01, String animal02){
        System.out.println("\nHello from myArrayMethod02");
        System.out.println("animal01 is " + animal01);
        System.out.println("animal02 is " + animal02);

        String[] myArray02 = {animal01, animal02};
        int num2=0;
        num2 = myArray02.length;
        for (int i=0; i<num2;i++){
            System.out.println("\nMy animals in array02 are " + myArray02[i]);
        }
    }

    public static void main(String[] args){
        System.out.println("\nHello from my WarmUp13Sept22");

        //Call Method that builds array and displays it
        myArrayMethod();

        //Call method that will Fill new array with animal01 and animal02 and output
        myArrayMethod02("cat","dog");

        //Create empty array with a specific number and populate
        int[] myInts = new int[5];
        myInts[0] = 33;
        myInts[1] = 59;
        myInts[2] = 50;
        myInts[3] = 56;
        myInts[4] = 11;

        for (int i=0; i<5; i++){
            System.out.println("\n myInts[" + i + "] = " + myInts[i]);

        }
    }
}
