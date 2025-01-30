package edu.houghton.code;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 *
 * Todo:
 *
 * Private instance variables to store age of the House, its type (Detached, Semi-Attached, Attached) and its cost.
 *
 * 4 constructors: No argument (sets age to 50, type to Attached and cost to 100000), one argument constructor (sets cost to a value, age - 50 and type - Attached), two argument constructors (sets age to a value, cost to a value , and type to Attached), three argument constructors (sets age to a value, cost to a value, and type to Attached, semi-detached, or detached)
 *
 * 3 Accessor/Getter methods: - methods to return age, type and cost respectively
 *
 * 5 Mutator/Setter methods: - 3 methods for setting the three values independently, a method to set all three values and a method to set age and cost of the house.
 *
 * A public method called estimatePrice() that returns cost of a house based on type and age. An attached cost $100,000, appreciates 1% every year in first five years and 2% every year afterwards. A Semidetached cost $150,000, appreciates 2% every year in first five years and 3% every year afterwards. A detached costs $200,000, appreciates 2% every year in first five years and 2% every year afterwards.
 *
 * A toString() method that returns type of the house and its age and its cost.
 *
 * An equals() method to test for equality of two objects of class House based on type and age.
 *
 * isLessThan() and isGreaterThan() method to compare between the prices of two objects of class House.
 *
 *
 * Hints:
 *  You can generate the toString() method and equals() method body by
 */
public class House {

    //declare your variables
    private int age;
    private String type;
    private int cost;

    //create your constructors
    
    //Constructor 1 (no argument)
    public House() {
        this.age = 50;
        this.type = "Attatched";
        this.cost = 100000;
 
    }
    
    //Constructor 2 (one argument)
    public House(int cost) {
        this.cost = cost;
        this.age = 50;
        this.type = "Attatched";
        
    }
    
    //Constructor 3 (two arguments)
    public House(int age, int cost) {
        this.cost = cost;
        this.age = age;
        this.type = "Attatched";
        
    }
    
    //Constructor 4 (three arguments)
    public House(int age, int cost, String type) {
        this.cost = cost;
        this.age = age;
        
        //condition ? expression if true : expression if false
        this.type = (type == "Detatched" || type == "Semi-detatched" || type == "Attatched") ? type : "Attatched";
        
    }

    //create your getter methods
    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    //Create the setter methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    //set all at once
    public void setAgeTypeCost(int age, String type, int cost) {
        this.age = age;
        this.type = type;
        this.cost = cost;
    }
    
    //set age and cost together
    public void setAgeCost(int age, int cost) {
        this.age = age;
        this.cost = cost;
    }
    
    //create your estimatePrice method
    public int estimatePrice(String type, int age){
        
        int cost = 0;
        int agePlaceholder = this.age;
        
        if(this.type == "Attatched") {
            
            //attatched starts at 100,000
            cost = 100000;
            
            if(agePlaceholder >= 5){
                //goes up 1% for first five years
                cost = (int) (cost * Math.pow(1.01, 5));
                
                //goes up 2% every year after that
                agePlaceholder -= 5;
                cost = (int) (cost * Math.pow(1.02, agePlaceholder));
                
            }
        }
        
        if(this.type == "Semi-detatched") {
            
            //Semi-detatched starts at 150,000
            cost = 150000;
            
            if(agePlaceholder >= 5){
                //goes up 2% for first five years
                cost = (int) (cost * Math.pow(1.02, 5));
                
                //goes up 3% every year after that
                agePlaceholder -= 5;
                cost = (int) (cost * Math.pow(1.03, agePlaceholder));
                
            }
            
        }
        
        if(this.type == "Detatched") {
            
            //Detatched starts at 200,000
            cost = 200000;
            
            if(agePlaceholder >= 5){
                //goes up 2% for first five years
                cost = (int) (cost * Math.pow(1.02, 5));
                
                //goes up 2% every year after that
                agePlaceholder -= 5;
                cost = (int) (cost * Math.pow(1.02, 5));
                
            }   
        }
        
        return cost;
    }
    
    //create the toString() method
    //to do this, right click -> generate -> toString
    @Override
    public String toString() {
        return "This house's age is "+ age + ", its type is " + type + ", and its cost is $" + cost + '.';
    }

    //create the equals() method
    //to do this, right click -> generate -> override methods - > equals()
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    //create the isLessThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isLessThan(House obj) {
        if (this.cost < obj.cost) {
            return true;
        } else {
            return false;
        }
    }

    //create the isGreaterThan() method
    //this will be similar to how your equals method definition looks like
    public boolean isGreaterThan(House obj) {
        if (this.cost > obj.cost) {
            return true;
        } else {
            return false;
        }
    
    }
    
}
