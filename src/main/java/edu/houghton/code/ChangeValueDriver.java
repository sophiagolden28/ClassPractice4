package edu.houghton.code;

import java.util.Scanner;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 *
 * In this class your should test your ChangeValue Class
 */
public class ChangeValueDriver{
    public static void main(String[] args) {
        //instantiate your scanner object
        Scanner scannerObject = new Scanner(System.in);
        
        //declare the local val1 and val2 integer variables
        int val1;    
        int val2;
        
        //prompt the user for input of two integers
        System.out.println("Please enter an integer: ");
        val1 = scannerObject.nextInt();
        
        System.out.println("Please enter another integer: ");
        val2 = scannerObject.nextInt();

        //instantiate a changeValue object here
        ChangeValue change = new ChangeValue(val1, val2);
        
        //call the object method print it here
        change.print();

    }

}