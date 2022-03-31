package TypingPractice;

import java.util.Arrays;

/* Write a Java program to sum values of an array.
 */
public class SumOfArray {

    public static void main(String[] args) {
        // Numeric array declaration
        int[] numArray = {139, 9546, 1899, 2541, 8654, 6874, 5487, 2543, 654};
        int sum = 0;

        // Calculating the Sum of arrays value using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Sum of all the values of the array are: " + sum);
    }
}


