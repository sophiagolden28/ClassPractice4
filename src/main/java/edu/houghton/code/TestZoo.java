/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.code;

/**
 *
 * @author Sound Room
 */
public class TestZoo {
    
    public static void main(String[] args) {
        
        //make zoo object
        Zoo myZoo = new Zoo();
        
        //make animal objects
        Animal snail = new Animal(3.5f, "Snail", 1);
        Animal elephant = new Animal(50000, "Elephant", 4);
        
        myZoo.addAnimal(snail);
        myZoo.addAnimal(elephant);
        
        myZoo.print();
       
        //while the zoo isn't full we add the snail
        while (myZoo.isZooFull() == false) {            
            myZoo.addAnimal(snail);   
        }
        
        System.out.println("");
        
        //add another one to make it say it's full
        myZoo.addAnimal(snail);   
        
        System.out.println("");
        
        //print the contents of the zoo to check if it's full of snails
        myZoo.print();
    }
    
    
    
}
