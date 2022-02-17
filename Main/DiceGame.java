
// Giselle Salvador
// A00244514
// Mobile Application Development - MAPD
// JAV-1001 - 11329 - App Development for Android - 202201 - 001
// Lab - 03


public class DiceGame{

    public static void main(String[] args){

// Declaring to use the Die.java class
        Die d6, d20, d4;
        d6 = new Die();
        d20 = new Die(20);
        d4 = new Die(4, "d4");

//Starting print out the statements...


        System.out.println();
        System.out.println("Creating a default " + d6.name + "...");
        System.out.println("Creating a " + d20.name + "...");
        System.out.println("Creating a " + d4.name + "...");

        System.out.println("The current side up for " + d6.name + " is " + d6.currentNumberUp + ".");
        System.out.println("The current side up for " + d20.name + " is " + d20.currentNumberUp + ".");
        System.out.println("The current side up for " + d4.name + " is " + d4.currentNumberUp + ".");

// Using classes and calling the roll method

        System.out.println();
        System.out.println("Testing the roll method...");
        System.out.println();
 
        System.out.println("Rolling the " + d6.name + "...");
        System.out.println("The new value to the " + d6.name + " is " + d6.roll());
        System.out.println("Rolling the " + d20.name + "...");
        System.out.println("The new value to the " + d20.name + " is " + d20.roll());
        System.out.println("Rolling the " + d4.name + "...");
        System.out.println("The new value to the " + d4.name + " is " + d4.roll());
        
// Setting the d20 to the 20 side, using roll method as many times as necessary using while loop
        System.out.println();
        System.out.println("Setting the " + d20.name + " to show " + d20.dieSides + "...");

        while(d20.randomSideUp != 20){
           d20.roll(); 
        }
        System.out.println("The side up is now " + d20.randomSideUp + " . Finally!");

        System.out.println();

        System.out.println("-----");
        System.out.println("BONUS");
        System.out.println("-----");
        System.out.println();

        System.out.println("Creating 5 d6...");


// Creating the 5 new dice        
        Die d6a, d6b, d6c, d6d, d6e;

        d6a = new Die();
        d6b = new Die();
        d6c = new Die();
        d6d = new Die();
        d6e = new Die();
        
        int rolls = 0;
        boolean diceEquals = true;

// using while loop while the if contition is not satisfied. 
        while(diceEquals){
            
            d6a.roll();
            d6b.roll();
            d6c.roll();
            d6d.roll();
            d6e.roll();
            
// Everytime that it runs, it sums 1 to int rolls and print the total times at the end
            rolls += 1;
            
            if(d6a.randomSideUp == d6b.randomSideUp && d6b.randomSideUp == d6c.randomSideUp &&
            d6c.randomSideUp == d6d.randomSideUp && d6d.randomSideUp == d6e.randomSideUp){
                diceEquals = false;
            }


        }
        System.out.println();
        System.out.println("It took " + rolls + " rolls.");
        System.out.println();

    }

  

}

// end of the code