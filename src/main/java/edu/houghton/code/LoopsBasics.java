package edu.houghton.code;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 */
public class LoopsBasics {

    //Task 1
    //get the factorials of n positive integers 1,2,…,1000
    public Long getFactorial(int n) {
        
        //Note: this was changed to 1 because if it was 0 as it was originally,
        //the way i do this, the result would have always been 0.
        Long result = 1L;
        
        //"the product of an integer and all the integers below it; e.g. factorial four ( 4! ) is equal to 24."
        
        //your code here
        while (n > 0) {
        
            result = result * n;
            n -= 1;
        
        }
        
        return result;
    }
    
    //Task 2
    //get the sum of the series
    public double sumOfSeries() {
        
        double result = 1;
        
        //your code here
       
        //for loop that counts i and goes up to 100 (start from 2 because if i starts from 1 we get an extra 1 added;
        //we need to start counting this from 1/2 to be added to the initial double result = 1.)
        for (double i = 2; i < 101; i++){
            //add the fraction to the sum starting at one half
            result += 1/i;
        
        }
    
        return result;

    }

    //Task 3
    //gets the sum of a square of odd numbers between 22 and 389
    public int sumOfOddSquares() {
        
        int result = 0;
        
        //your code here
        
        //define start and finish variables
        int start = 22;
        int finish = 389;
        
        //start i at start and end it before finish ("between 22 and 389")
        for (int i = start; i < finish; i++){
            
            //if i mod 2 is 1 (if the number is odd)
            if ((i % 2) == 1){
                                
                //add the square of that number to the result
                result += i * i;
            
            }
            
        }
       
        return result;

    }

}
