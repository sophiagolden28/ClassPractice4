package edu.houghton.code;

/**
 * Name : Sophia Golden
 * Course: CSCI 218 - Programming II
 */
public class Animal {
   
    //initialize variables
    float mass;
    String name;
    int legs;
    boolean isAlive;
    
    static int counter;
    static int animals_alive;
    
    //Setter method for the field mass
    public void setMass(float mass) {
        this.mass = mass;
    }
    
    //Getter methods for the three fields
    public String getSpecies() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isIsAlive() {
        return isAlive;
    }
    
    //Constructor 1
    public Animal(String name){
        this.name = name;
        this.isAlive = true;
        
        counter += 1;
        animals_alive += 1;
        
        this.mass = 0;
        this.legs = 0;
    
    }
    
    //Constructor 2
    public Animal(float mass, String name, int legs){
        this.mass = mass;
        this.name = name;
        this.legs = legs;
        
        this.isAlive = true;
        
        counter += 1;
        animals_alive += 1;
    
    }
    
    //print method
    public void print(){
        //have to use conditional because status = true doesn't mean anything
        if (this.isAlive == true){
            System.out.println("Animal: Name = " + name + ", Mass = " + mass + ", Legs = " + legs + ", Status = alive.");
    
        } else {
            System.out.println("Animal: Name = " + name + ", Mass = " + mass + ", Legs = " + legs + ", Status = dead.");
        
        }
        
        
    }
    
    //getAnimalPopulation method
    public int getAnimalPopulation(){
        return counter;
  
    }
    
    //getAnimalsAlive method
    public int getAnimalsAlive(){
        return animals_alive;
        
    }
    
    //reproduce method
    public Animal reproduce(){
        //(mass then name of species then leg number)
        return new Animal(this.mass/2, this.name, this.legs);
 
    }
    
    //die method
    public void die(){
        animals_alive -= 1;
        this.isAlive = false;
    
    }
    
    
    
    
    
    
    
    
    
    
    

}
