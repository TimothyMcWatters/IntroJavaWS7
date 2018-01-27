import java.util.Scanner;

/**
This program:
Reads input from the keyboard using a Scanner Object and its methods.
Cchecks the range to validate input and output.
Displays BMI to the user 

@author Timothy McWatters
@version 1.0

COP2253    Work Shop 7
File Name: BMI.java
*/

public class BMI {
   final static int MIN_WEIGHT = 20;
   final static int MAX_WEIGHT = 600;
   final static int MIN_HEIGHT = 36;
   final static int MAX_HEIGHT = 96;

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int weight = 0;
      double weightDouble = 0.0;
      int height = 0;
      double heightDouble = 0.0;
      double BMI = 0.0;

      System.out.println("Enter weight in pounds");
      weight = keyboard.nextInt();
      while ((weight < MIN_WEIGHT) || (weight > MAX_WEIGHT)) {
         System.out.printf("Enter a number between [ %d & %d ]\n", MIN_WEIGHT, MAX_WEIGHT); 
         weight = keyboard.nextInt();
      }
      
      System.out.println("Enter height in inches");
      height = keyboard.nextInt();
      while ((height < MIN_HEIGHT) || (height > MAX_HEIGHT)) {
         System.out.printf("Enter a number between [ %d & %d ]\n", MIN_HEIGHT, MAX_HEIGHT); 
         height = keyboard.nextInt();
      }

      weightDouble = (double)weight;
      heightDouble = (double)height;
      BMI = (weightDouble / (Math.pow(heightDouble, 2)) * 703);
      if ( BMI >= 1 && BMI <= 100) {
         System.out.printf("Your BMI is: %.2f.", BMI);
      }
      else {
         System.out.println("ERROR: Please redo calculations these numbers are physically impossible for a human!");
      }
   }
}