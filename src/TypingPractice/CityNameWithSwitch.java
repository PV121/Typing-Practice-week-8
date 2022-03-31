package TypingPractice;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class CityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();
        //Create object and call instance method
        CityNameWithSwitch cityName = new CityNameWithSwitch();
        cityName.printCityName(city);
        //Closing the scanner object
        scanner.close();
    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Ahemdabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Dakor");
                break;
            case "E":
                System.out.println("Elora");
                break;
            case "F":
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}

