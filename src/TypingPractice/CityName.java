package TypingPractice;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class CityName {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        char city = scanner.next().charAt(0);
        // Object creation
        CityName name = new CityName();
        name.printCityName(city);
        //Closing the scanner object
        scanner.close();
    }

    //Printing city name
    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Ahemdabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Baroda");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chimannagar");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dakor");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Elora");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Faridabad");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}



