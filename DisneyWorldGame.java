//Name: Andres Marin
//Date: March 04, 2021
//Description: Final Project

/*Pseudocode: generate random number generator to out put a 1 of 4 introductions using switch staments.
              Set boolean to true
              Use scanner to have use input the answers.
              Have while loop be (true)
              Ask user if he would like to play. press y for yes.
              Have user press q to quit and break the loop.
              Create various if else if statements to ask various questions to the user
              The user can pick an option by pressing 1 or 2. 
              If the user chooses correctly it the program will move on to the next if statement. 
              If the user chooses the right answer to the end use the scanner to ouput the one text file with you win statement.
              Ask the user if they want to play again. press y for yes or q to quit.
              If the user chooses wrong use scanner to output one of the various text files with the you lose statement.
              Ask the user if they would like to play again. press y for yes q to quit.
*/
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class DisneyWorldGame{

   // Main method where all other methods are invoked.
   public static void main (String[] args) throws IOException {
       
      Disney myDisneyVisit = new Disney();
      DisneyGame disneyVisit = new DisneyGame();
      myDisneyVisit.introduction();
      disneyVisit.gamePlay();
   }
}
