package edu.houghton.code;

import java.util.Scanner;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test and call the methods you created in the LoopsBasics Class
 */
public class LoopBasicsDriver {


    public static void main(String[] args) {
        //Instantiate the scanner class to accept inputs where necessary
        Scanner scanner = new Scanner(System.in);
        
        //Create an object of your LoopsBasics class
        LoopsBasics loop = new LoopsBasics();
        
        //Test: Task 1 method
        //Use the scanner object to accept the input n
        //Pass the input to the method and print the factorial of n
        System.out.println("Please enter the number you would like the factorial of: ");
        int n = scanner.nextInt();
        System.out.println(n + " factorial is " + loop.getFactorial(n));
        
        //Test: Task 2 method
        //Call the method and print the sum of the series 
        System.out.println("The sum of the series is " + loop.sumOfSeries()+ ".");

        //Test: Task 3 method
        //Call the method and print the sum of the square of odd numbers between 22 and 389
        System.out.println("The sum of the square of odd numbers between 22 and 389 is " + loop.sumOfOddSquares() + ".");


    }
}
