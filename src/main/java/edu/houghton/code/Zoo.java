/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code;

import java.util.Arrays;

/**
 *
 * @author Sound Room
 */
public class Zoo {

    //cages array
    private Animal[] cages;

    //constructor
    public Zoo() {

        //set length of cages array
        cages = new Animal[10];

    }

    //to keep track
    public boolean isZooFull() {

        boolean full = false;

        //full cages to keep track
        int fullCages = 0;

        //for each cage in cages
        for (Animal cage : cages) {
            //if there's a full cage
            if (cage != null) {
                //increment the fullCages variable
                fullCages += 1;
            }
        }

        //if there are no empty cages
        if (fullCages >= cages.length) {
            full = true;
        }

        return full;

    }

    //add animal method to add it to an array
    public void addAnimal(Animal animal) {

        if (this.isZooFull() == true) {
            //modifying so that the zoo is never full
            double newCagesLength;
            newCagesLength = (int) Math.ceil(cages.length * 1.5);
            cages = Arrays.copyOf(cages, (int) newCagesLength);
        }

        //add the animal to the first available spot
        for (int i = 0; i < cages.length; i++) {

            //if cages at that spot is empty...
            if (cages[i] == null) {
                //make the animal that spot in the array
                cages[i] = animal;

                //kill the loop after adding the animal
                break;
            }

        }

        /* THIS IS COMMENTED OUT BECAUSE OF THE MODIFICATIONS
        
        //if there are no empty cages
        if (this.isZooFull() == true) {
            
            System.out.println("The zoo is full!");
             
        } else {
            
            //if there are empty cages
            //for each spot in the array, if the first spot is open we add the animal to it
            for (int i = 0; i < cages.length; i++) {
            
                //if cages at that spot is empty...
                if (cages[i] == null) {
                    //make the animal that spot in the array
                    cages[i] = animal;
                    
                    //kill the loop after adding the animal
                    break;
                }
            
            }
                
        }
         */
    }

    //toString method to print the animals in the zoo
    @Override
    public String toString() {
        return "Animals in the Zoo: " + cages;
    }

    //print method to print the contents of the zoo
    public void print() {

        System.out.println("The animals in the zoo are: ");

        //for each cage in cages
        for (int i = 0; i < cages.length; i++) {

            //check to see if the cage isn't empty
            if (cages[i] != null) {

                //if it isn't, print the animal nicely
                System.out.println("    " + cages[i].name);

            }

        }

    }

    //number of animals method
    public int numberOfAnimals() {

        //full cages to keep track
        int fullCages = 0;

        //for each cage in cages
        for (int j = 0; j < cages.length; j++) {

            //if there's a full cage
            if (cages[j] != null) {

                //increment the fullCages variable
                fullCages += 1;

            }

        }

        //we return the number of full cages (number of animal)
        return fullCages;

    }

    //total mass method
    public int totalMass() {

        //initialize mass variable
        int massTotal = 0;

        //for each animal we know
        for (int i = 0; i < this.numberOfAnimals(); i++) {

            //add their mass to the mass variable
            massTotal += cages[i].mass;

        }

        //return the mass variable
        return massTotal;

    }

    //get the total legs method (basically same as getting the total mass)
    public int totalLegs() {

        //initialize legs variable
        int legsTotal = 0;

        //for each animal we know
        for (int i = 0; i < this.numberOfAnimals(); i++) {

            //add their mass to the mass variable
            legsTotal += cages[i].legs;

        }

        //return the mass variable
        return legsTotal;

    }

    //remove an animal from the zoo method
    public void removeAnimal(Animal animal) {

        //looks through animals and if the name matches deletes the first instance of it
        for (int i = 0; i < cages.length; i++) {

            //if the name matches
            if (animal.name.equals(cages[i].name)) {
                //make its place null
                cages[i] = null;

                //break so we don't take out more than one
                break;
            }

        }

    }

    //reordering method (not sure if i did this right)
    public void reorder() {
        Arrays.sort(cages);
    }

    //make baby method
    public void makeBaby(String speciesName) {

        //make a counter to keep track of how many of a species there are
        int speciesCounter = 0;

        //make 2 placeholder variables to access weight, legs etc. later
        Animal parentA = null;
        Animal parentB = null;

        //for the animals in the zoo
        for (int i = 0; i < cages.length; i++) {

            //if it's not null
            if (cages[i] != null) {

                //if one's name is the required species name
                if (cages[i].name.equals(speciesName)) {

                    speciesCounter += 1;

                    //make the first one parentA if the spot's not filled
                    if (parentA == null) {

                        parentA = cages[i];

                    } else if (parentA != null && parentB == null) {

                        //make the second one parentB if parentA is taken and parentB is not filled
                        parentB = cages[i];

                    }
                    {
                    }

                }

            }

        }

        //if there are 2 or more of the parent species
        if (speciesCounter >= 2) {

            //make the animal that spot in the array
            //find parent avg weight
            float averageParentWeight = (parentA.mass + parentB.mass) / 2;
            //make baby object with parent stats
            Animal baby = new Animal(averageParentWeight, speciesName, parentA.legs);
            
            this.addAnimal(baby);
            
        }

    }

}
