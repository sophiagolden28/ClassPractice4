/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code;

/**
 *
 * @author Sound Room
 */
public class NewTestZoo {
    
    public static void main(String[] args) {
        
        //makes a new zoo
        Zoo newZoo = new Zoo();
        
        //make animal objects
        Animal elephant = new Animal(50000, "Elephant", 4);
        Animal spider = new Animal(1.4f, "Spider", 1);
        Animal snake = new Animal(14, "Snake", 1);
        
        //fills it with an elephant, spider, and snake
        newZoo.addAnimal(elephant);
        newZoo.addAnimal(spider);
        newZoo.addAnimal(snake);
        
        //print the contents to the terminal
        newZoo.print();
        
        //print the average mass and average legs
        int averageMass = newZoo.totalMass() / newZoo.numberOfAnimals();
        int averageLegs = newZoo.totalLegs() / newZoo.numberOfAnimals();
        
        System.out.println("Average mass: " + averageMass);
        System.out.println("Average legs: " + averageLegs);
        
        //STOPPED IN THE MIDDLE OF * 4 OF FANCY STUFF!!!!!!!!!!
        
    }
    
    
    
    
    
    
    
    
    
    
}
