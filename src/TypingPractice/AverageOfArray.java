package TypingPractice;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */

public class AverageOfArray {

    public static void main(String[] args) {

        // Numeric array declaration
        int[] numArray = {139, 9546, 1899, 2541, 8654, 6874, 5487, 2543, 654};
        int sum = 0;
        // Calculating the sum of arrays value
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        // Finding the average of arrays value
        int average = sum / numArray.length;
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are: " + average);
    }
}



