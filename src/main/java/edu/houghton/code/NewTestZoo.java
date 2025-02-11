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

        //makeBaby testing with baby pandas
        //first testing with no pandas in the zoo (should do nothing)
        newZoo.makeBaby("Panda");
        System.out.println("");
        newZoo.print();

        //then testing with making panda objects
        Animal pandaA = new Animal(1200, "Panda", 4);
        Animal pandaB = new Animal(1800, "Panda", 4);

        //and adding them to the zoo
        newZoo.addAnimal(pandaA);
        newZoo.addAnimal(pandaB);

        //printing the contents of the zoo
        System.out.println("");
        newZoo.print();

        //TESTING by making a baby panda
        //making a baby panda
        newZoo.makeBaby("Panda");

        //print zoo again
        System.out.println("");
        newZoo.print();
        
        //to test the length-grower of the array
        //looping for clarity and convenience
        for (int i = 0; i < 7; i++) {
           
            //adding animal
            newZoo.makeBaby("Panda");
            
            //printing zoo
            newZoo.print();
            System.out.println("");

        }
        
        //finally, printing the number of animals in the zoo
        System.out.println("There are " + newZoo.numberOfAnimals() + " animals in the zoo.");
        
    }

}
