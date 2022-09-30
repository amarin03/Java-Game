//Name: Andres Marin
//Date: March 04, 2021
//Description: Final Project
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Disney {

   // Method to welcome the player into the game
   public void introduction(){
      
      //Random number generator to randomize the introductions.
      Random randomNumbers = new Random();
      int randomNum = randomNumbers.nextInt(4);
      
      switch (randomNum){
      
         case 0: 
            System.out.println("Hello!! Welcome to Disney World were dreams come true!!!");
            break;
         case 1: 
            System.out.println("Welcome to Disney World!!! Are you ready to play a game!!");
            break;
         case 2:
            System.out.println("You have just arrived at Disney World! You have some very important choices ahead of you.");
            break;
         case 3:
            System.out.println("In a galaxy far far away our hero has just arrived at Disney World!! "+
                               "They are about to embark in an adventure of a life time!!");
            break;
      }  
   }
}
   
      
      
     
     
