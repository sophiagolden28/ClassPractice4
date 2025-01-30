package edu.houghton.code;

/**
 *  Name : Sophia Golden
 *  Course: CSCI 218 - Programming II
 *
 *
 * Todo:
 * declare 4 house objects using 4 different constructors and output description of the 4 houses.
 *
 * Test your accessor methods.
 *
 * Calculate the estimated price of houses given type and age (include 1 attached and 1 detached)
 *
 * Test out all 5 mutator methods to modify the attributes of different House objects.
 *
 * Test methods toString(), equals() , isLessThan() and isGreaterThan() for different House objects.
 */
public class HouseDriver {
    public static void main(String[] args) {
        //declare 4 house objects using 4 different constructors and output description of the 4 houses.
        House house1 = new House();
        House house2 = new House(100000);
        House house3 = new House(7, 150000);
        House house4 = new House(5, 200000, "Detatched");
        
        System.out.println("House 1: " + house1.toString());
        System.out.println("House 2 " + house2.toString());
        System.out.println("House 3: " + house3.toString());
        System.out.println("House 4: " + house4.toString());
        
        //Test your accessor methods.
        System.out.println("\nAccessor Method: The housetype for House 2 is " + house2.getType() + ", its age is " + house2.getAge() + ", and it costs $" + house2.getCost() + ".");
        
        //Calculate the estimated price of houses given type and age (include 1 attached and 1 detached)
        System.out.println("\nThe estimated price of House 3 is $" + house3.estimatePrice(house3.getType(), house3.getAge()) + ".");    
        System.out.println("The estimated price of House 4 is $" + house4.estimatePrice(house4.getType(), house4.getAge()) + ".");    
      
        //Test out all 5 mutator methods to modify the attributes of different House objects.
        house3.setAge(33);
        System.out.println("\nMutator Method: The new age for House 3 is " + house3.getAge());
        
        house3.setType("Semi-Detatched");
        System.out.println("Mutator Method: The new type for House 3 is " + house3.getType());
        
        house3.setCost(220000);
        System.out.println("Mutator Method: The new cost for House 3 is $" + house3.getCost());
        
        house3.setAgeCost(8, 105000);
        System.out.println("Mutator Method: The new age for House 3 is " + house3.getAge() + " and the new cost for House 3 is $" + house3.getCost());
        
        house3.setAgeTypeCost(99, "Detatched", 130000);
        System.out.println("Mutator Method: The new age for House 3 is " + house3.getAge() + " and the new type for House 3 is " + house3.getType() + " and the new cost for House 3 is $" + house3.getCost());
        
        //Test methods toString(), equals() , isLessThan() and isGreaterThan() for different House objects.
        System.out.println("\ntoString: " + house1.toString());
        
        System.out.println("\nHouse 1 and House 2 are equal is " + house1.equals(house2));
        
        System.out.println("\nHouse 4 is less that House 1 is " + house4.isLessThan(house1));
        
        System.out.println("\nHouse 3 is greater that House 2 is " + house3.isGreaterThan(house2));
        
    }
}
