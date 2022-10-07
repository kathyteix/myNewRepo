// MidTerm Project
// CppZoo
// kt

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.chrono.IsoChronology;
import java.util.*;
import java.io.*;
import java.util.Random;

public class CppZoo {
    // Global variables
    static String gbirthDate = "";
    static  String ganimalAge = "";
    static String gGender = "";
    static String gAnimalType = "";
    static String gAnimalName = "";
    static String gNewAnimalID = "";

    // Determine animal birthdate by age and season born
     static String genBirthDay(String age, String season){
        // Extracting age from string
        int index = age.indexOf("year");
        String strYear = age.substring(0, index-1);
       int year = Integer.parseInt(strYear);

        // Getting current calendar year and subtracting year to set birth year
        // need to import Calendar library
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = currentYear - year;

       // Finding season from string to determine Month
        int seasonLen = season.length();
        String month = season.substring(8,seasonLen);

        // Trimming any spaces in order to find match
        month = month.trim();

        // Using switch statement to assign birthDate
        switch(month){
            case ("spring"):
                gbirthDate = "Mar 21, " + birthYear;
                break;
            case("fall"):
                gbirthDate = "Sept 22, " + birthYear;
                break;
            case("winter"):
                gbirthDate = "Dec 21, " + birthYear;
                break;
            default:
                gbirthDate = "Jan 1, " + birthYear;
        }
        return gbirthDate;
    }

    // Generate unique animal ID
    static String genUAnimalID(String gAnimalType){
        String animalNamePath = "C:/javaScratch/zooPopulation.txt";
        String line = "";

        //generate random number
        Random randNum = new Random();
        int upperBound = 50;
        String newNum = "";

        int int_random = randNum.nextInt(upperBound);
        newNum = Integer.toString(int_random);

        //Access Zoo Population to see if ID is used
        accessZooPopulationID(newNum);

        //Assign new ID to animal
        gNewAnimalID = gAnimalType.substring(0,2) + newNum;
        return  gNewAnimalID;
    }

    static String stripAge(String age){
        int index = age.indexOf("old");
        ganimalAge = age.substring(0, index+3);
        //System.out.println("age=" + ganimalAge);
        return ganimalAge;
    }

    // Extract gender from first contents of file
    static String stripGender(String age){
         int index = age.indexOf("female");
         if (index == -1){
             gGender = "male";
         }
         else{
             gGender = "female";
         }
        //System.out.println("gender is: " + gGender);
        return  gGender;
    }

    // Strip the animal type from first element of array
    static String stripAnimal(String age){
         if (age.contains("female")){
             int index = age.indexOf("female");
             gAnimalType = age.substring(index+7,age.length());
         }
         else if (age.contains("male")){
             int index = age.indexOf("male");
             gAnimalType = age.substring(index+5, age.length());
         }
        //System.out.println("animal is: " + gAnimalType);
         return  gAnimalType;
    }

    //Access zoo population for new ID
    static boolean accessZooPopulationID(String randNum) {
        String animalNamePath = "C:/javaScratch/zooPopulation.txt";
        String animalId = "";
        Boolean okay = false;

        Scanner sc = null;
        try {
            File file = new File(animalNamePath); // java.io.File
            sc = new Scanner(file);     // java.util.Scanner
            String line;

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                line = line.toLowerCase();
                if (line != ""){
                    animalId = line.substring(2,4);
                    if (isInteger(animalId)){
                        if (animalId.equals(randNum)){
                            okay = true;
                        }
                    }
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return  okay;
    }

    //Method to determine if string is Integer
    static boolean isInteger( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }


    static void createFileAndWrite(){
        //Create a file
        try {
            File myFile = new File("C:/javaScratch/tempAnimalFile.txt");
            if (myFile.createNewFile()){
                System.out.println("File created is: " + myFile.getName());
            }
            else {
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("Exception caught");
        }
        //Write to the new file
        try {
            FileWriter myWriter = new FileWriter("C:/javaScratch/tempAnimalFile.txt");
            //myWriter.write("This is line one written to my new file I just created!\n");

            // 3) Advanced: Create a loop to write 100 lines of text to your new file
            for (int i=0; i<101; i++){
                myWriter.write("\nThis is line: " + i);
            }

            myWriter.close();
            System.out.println("File write completed");
        }
        catch (IOException e){
            System.out.println("File IO Exception caught!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        System.out.println("\nWelcome to my Midterm Project");

        // Open a text file and read the contents into a linear array.
        String arrivingAnimalPath = "C:/javaScratch/arrivingAnimals.txt";
        String line = "";
        String[] contents;
        String age = "";
        String season = "";
        String animalInfo = "";
        String animalColor = "";
        String animalWeight = "";
        String animalFrom = "";
        String animalPark = "";

        // Read the arriving animal file and parse out the info needed
        try {
            BufferedReader bf = new BufferedReader(new FileReader(arrivingAnimalPath));
            //check for end of file
            while ((line = bf.readLine()) != null) {
                contents = line.split(",");
                age = contents[0];
                season = contents[1];
                animalColor = contents[2].trim();
                animalWeight = contents[3];
                animalPark = contents[4];
                animalFrom = contents[5];

                // Calling methods to get specific info needed
                stripAge(age);
                stripGender(age);
                stripAnimal(age);
                genBirthDay(age,season);

                //Call method to determine new ID
                genUAnimalID(gAnimalType);

                //Get current date for arrival date
                DateFormat dateFormat = new SimpleDateFormat("MMMM dd YYYY");
                Date date = new Date();

                animalInfo = gNewAnimalID + ", " + gAnimalName + ", " + ganimalAge + "; birth date " + gbirthDate + "; " + animalColor + "; " + gGender + "; " + animalWeight + "; " + animalPark + "; " + animalFrom + ", arrived " + dateFormat.format(date) ;
                System.out.println(animalInfo);

            }
            bf.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
