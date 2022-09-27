// MidTerm Project
// CppZoo
// kt

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;
import java.util.List;

public class CppZoo {
    static String genBirthDay(String age,String season){
        String birthDate = "";
        return birthDate;
    }
    public static void main(String[] args){
        System.out.println("\nWelcome to my Midterm Project");

        // Open a text file and read the contents into a linear array.
        String path = "C:/javaScratch/animalNames.txt";
        String line = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            //check for end of file
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            bf.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File exception");
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
