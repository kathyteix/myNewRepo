import java.io.*;
import java.util.Scanner;
import java.util.List;

public class WarmUp20Sept22 {
    public static void main(String[] args){
        //Create a file
        try {
            File myFile = new File("C:/javaScratch/myTextFile.txt");
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
            FileWriter myWriter = new FileWriter("C:/javaScratch/myTextFile.txt");
            myWriter.write("This is line one written to my new file I just created!\n");

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

        // 4) Advanced: Open a text file and read the contents into a linear array. First Attempt
        try {
            long fileLength = 0;
            File myFile = new File("C:/javaScratch/myTextFile.txt");
            int count =0;
            String fileArray[] = new String[100];

            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
                count++;
            }
 /*
            for (int i=0;i<104;i++){
                fileArray[i] =myReader.nextLine();
            }
            myReader.close();
            System.out.println("File has " + count + " lines.");

            //Reading array
            for (int i=0;i<101;i++){
                System.out.println("In array line " + fileArray[i]);
            }

 */
        }
        catch (FileNotFoundException e){
            System.out.println("File Reading Exception Caught");
            e.printStackTrace();
        }

        //Second Attempt
        // 4) Advanced: Open a text file and read the contents into a linear array.
        String path = "C:/javaScratch/addresses.csv";
        String line = "";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            //check for end of file
            while ((line = bf.readLine()) != null) {
                //System.out.println(line);
                String[] values = line.split(",");
                System.out.println("\nName: " + values[0] + ", City: " + values[3]);
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
