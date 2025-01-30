package edu.houghton.code;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 *
 */
public class ChangeValue {

    //declare 2 integer instance variables: value1 and value2.
    // These should be declared private.
    private int value1;
    private int value2;

    //Constructor
    public ChangeValue(int val1, int val2){
        this.value1 = val1;
        this.value2 = val2;
        
        //if val1 is greater than 5 set instance var value1 equal to the first value passed to the constructor
        if (val1 > 5){
            value1 = val1;
        } else {
        //if val1 is less than or equal to 5 then set instance variable value1 equal to the first passed value plus the seocnd passed value
            value1 = val1 + val2; 
        }
  
        //if val2 is less than 10 then set instance varialbe value2 equal to the second passed value times the second passed value then add 5
        if (val2 < 10){
            value2 = (val2 * val2) + 5;
        } else {
        //if val2 is greater to or equal to 10 then set instance variable value2 equal to the second passed value
            value2 = val2;
        }
    }

    public void print(){
        System.out.println();
        System.out.println("The result is " + (this.value1 * this.value2) + ".");
        
    }

}
