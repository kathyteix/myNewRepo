import java.util.Scanner;
import java.util.Arrays;

public class WarmUp15sep {

     static void myArrayMethod01(){
        int num1 = 0;
        String[][] gmyAnimals = new String[3][3];
        Scanner myInput = new Scanner(System.in);

        //Prompt user to enter 3 animal types
        for (int i=0; i<3; i++){
            System.out.println("\nEnter an animal type " + i );
            gmyAnimals[i][i] = myInput.nextLine();
            for (int j=0;j<3;j++) {
                System.out.println("\nEnter name " + i );
                gmyAnimals[i][j] = myInput.nextLine();
            }
        }

        //Display full array with animal types and their names
         for (int i=0;i<3; i++){
             for (int j=0;j<3;j++){
                 System.out.println(gmyAnimals[i][j] );
             }

         }
         System.out.println();
    }

    //Second array sends in values for array
    static void myArrayMethod02(String animal01, String animal02, String animal03){
        System.out.println("\n Hello from myArrayMethod02\n\n");
        System.out.println("\n animal01 is " + animal01 + "\n");
        System.out.println("\n animal02 is " + animal02 + "\n");

        String[] myNewArray = {animal01, animal02,animal03};

        // TODO: fill new array with animal01 and animal02 and output!
        //Display full array with animal types and their names
        for (int i=0;i<3; i++){
            System.out.println(myNewArray[i] );
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("\nWelcome to Java WarmUp on Arrays");
        System.out.println("\n==========================");
        System.out.println("\nThursday Sept 15, 2022");

        //Create two methods using arrays

        //First array will contain the list of animal types
        myArrayMethod01();
        myArrayMethod02("Leo","MGM", "Simba");

    }
}
