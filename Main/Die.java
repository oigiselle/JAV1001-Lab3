
// Giselle Salvador
// A00244514
// Mobile Application Development - MAPD
// JAV-1001 - 11329 - App Development for Android - 202201 - 001
// Lab - 02


import java.util.Random;



public class Die{

    String name;
    int dieSides;
    int currentNumberUp;
    int randomSideUp;

// 0 argument constructor 
// Default type/name: "d6"; default number of sides: 6; random side up generated from the roll method
    public Die(){

    name = "d6";
    dieSides = 6;
    if (currentNumberUp == 0){
        currentNumberUp = roll();
    
    }
    
    }

/* A 1 argument constructor
Number of sides is the parameter. Default type/name: "d{number of sides}" random side up generated from 
the roll method*/
    

    public Die(int dieSides){
        this.dieSides = dieSides;
        name = "d"+dieSides;
        
        if (currentNumberUp == 0){
            currentNumberUp = roll();
        
        }
    
    }

/*A 2 argument constructor
Both the number of sides and the type are parameters; random side up generated from the roll method*/

    public Die(int dieSides, String name){

       
        this.dieSides = dieSides;
        this.name = "d"+dieSides;
        if (currentNumberUp == 0){
            currentNumberUp = roll();
        
        }


    
    }

// The roll dice method using random
     public int roll() {
        Random random = new Random();
        randomSideUp = random.nextInt(1, dieSides) + 1;
        
        return randomSideUp;
    
        }



}



