package com.Kathy.cit63;
import java.util.Scanner;

public class WarmUp {
    public static void main(String args[]) {
        System.out.println("\n \nWelcome to CIT-63 warmUp 11 Aug 2022 ");
        Scanner userInputObject = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String theName = "";
        theName = userInputObject.nextLine();
        System.out.println("\n \nHello " + theName + " how are you today?");
    }
}
