import java.util.Scanner;
import java.util.Random;

/**
This program:
Simulates how often a player would win if they rolled a pair dice 100 times.
A win is determined by rolling a sum of 7 or 11 with the two dice.
Also, will read input from the keyboard using a Scanner Object and its methods:
determine if the player wishes to execute the simulation again or quit.
uses iteration (while, do while or for) statements
print out a statement with how many wins.

@author Timothy McWatters
@version 1.0

COP2253    Workshop 7
File Name: Craps.java
*/

public class Craps {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      Random randomGenerator = new Random();
      
      int diceRoll = 0;
      int sevens = 0;
      int elevens = 0;
      int notSevenOrEleven = 0;
      int sevensOrElevens = 0;
      int totalRolls = 0;
      String anotherSimulation = "";
      String anotherSimulationCaps = "";
      
      // do while loop to determine if you want to keep running the simulations
      do {
         // roll 2 dice 100 times
         for (int i = 0; i < 100; i++) {
            diceRoll = (randomGenerator.nextInt(6) + randomGenerator.nextInt(6) + 2);
            if (diceRoll == 7) {
               sevens++;
            } 
            else if (diceRoll == 11) {
               elevens++;
            }
            else {
               notSevenOrEleven++;
            }
         }  
         sevensOrElevens = sevens + elevens;
         totalRolls = sevensOrElevens + notSevenOrEleven;
         System.out.printf("The player rolled %d sevens and %d elevens for a total of %d wins out of %d.", sevens, elevens, sevensOrElevens, totalRolls);
         System.out.println();
         System.out.println();
         System.out.println("Type \"Y\" for another simulation, or type any other key to quit.");
         anotherSimulation = keyboard.next();
         anotherSimulationCaps = anotherSimulation.toUpperCase();
      } while (anotherSimulationCaps.equals("Y"));
   }
}