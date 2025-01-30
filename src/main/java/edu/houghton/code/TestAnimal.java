package edu.houghton.code;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 */

public class TestAnimal {
    public static void main(String[] args) {
        
        //1. snail
        Animal snail = new Animal(3.5f, "Snail", 1);
        snail.print();
        
        //2. population count and number of alive animals
        System.out.println();
        System.out.println("Population count: " + snail.getAnimalPopulation());
        System.out.println("Alive animals: " + snail.getAnimalsAlive());
        System.out.println();
        
        //3. create animal object with one-argument constructor: parrot
        Animal parrot = new Animal("Parrot");
        parrot.print();
        
        //4. population count and number of alive animals
        System.out.println();
        System.out.println("Population count: " + snail.getAnimalPopulation());
        System.out.println("Alive animals: " + snail.getAnimalsAlive());
        System.out.println();
        
        //5. change the parrot's mass to 4.2
        parrot.setMass(4.2f);
        
        //6. creating another Animal using the three-argument constructor, printing it, and repeating step 2
        Animal turtle = new Animal(13.1f, "Turtle", 4);
        turtle.print();
        
        System.out.println();
        System.out.println("Population count: " + snail.getAnimalPopulation());
        System.out.println("Alive animals: " + snail.getAnimalsAlive());
        System.out.println();
        
        //7. declare 2 baby animal Animal objects
        Animal babyAnimal1;
        Animal babyAnimal2;
        
        //8. reproduce the parrot and turtle and assign returned objects to the baby objects
        babyAnimal1 = parrot.reproduce();
        babyAnimal2 = turtle.reproduce();
        
        //9. kill the snail :(     and repeat step 2
        snail.die();
        
        System.out.println();
        System.out.println("Population count: " + snail.getAnimalPopulation());
        System.out.println("Alive animals: " + snail.getAnimalsAlive());
        System.out.println();
        
        //10. using the babyAnimal1 object, access the counter variable and change its value to 500
        babyAnimal1.counter = 500;
        
        //11. do step 2 again with any of the 3 created animal objects
        System.out.println();
        System.out.println("Population count: " + parrot.getAnimalPopulation());
        System.out.println("Alive animals: " + parrot.getAnimalsAlive());
        System.out.println();
        
        //12. using Animal, access the counter variable and change its value to 15, then repeat step 11
        Animal.counter = 15;
        
        System.out.println();
        System.out.println("Population count: " + turtle.getAnimalPopulation());
        System.out.println("Alive animals: " + turtle.getAnimalsAlive());
        System.out.println();
        
        //13. kill all the animals :(
        parrot.die();
        turtle.die();
        babyAnimal1.die();
        babyAnimal2.die();
               
        //14. do step 2 again
        System.out.println();
        System.out.println("Population count: " + snail.getAnimalPopulation());
        System.out.println("Alive animals: " + snail.getAnimalsAlive());
        System.out.println();
       
    }
    
    
    
    
    
}
