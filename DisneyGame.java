//Name: Andres Marin
//Date: March 04, 2021
//Description: Final Project
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class DisneyGame{

   private String [] foodNames;
   private String [] ridenames;

   //Method to give player the choice to play or quit.
   public int userOutput(String play){
   
      if (play.equals("y")){  
      }
      else if (play.equals("q")){
         System.out.print("Ok bye, Come back to play anytime!!");
         return 0;
      }
      else{
         System.out.println("Oooops it seems you have made a mistake try again!" );
         return 1;
      }
      return 2;   
   }
   
   //Method to print loss message with out repeating code.
   public boolean lossOption(String msg, Scanner keyboard){
      System.out.print(msg+ "\nYou lose would you like to play again? Click y for yes and q to quit. ");
      String play = keyboard.nextLine();
      int output = userOutput(play);
      if (output == 0){
         return false;
      }
      return true;
   }
     
   // Main game play method.     
   public void gamePlay () throws IOException {
   
      // The names of all the foods and rides in the game.
      String [] foodNames = {"Hamburger", "HotDog", "beer", "Nachos", "Turkey Leg"};
      String [] rideNames = {"Expedition Everest", "Splash Mountain", "Haunted Mansion",
                             "Big Thunder Mountain", "Space Mountain", "Rock 'N' Roll Rollercoaster",
                             "Twilight Zone TOT", "Avatar Flight Passage", "Gorilla Falls Exploration",
                             "It's a Small World", "Kali River Rapids"};
      
      //File with message when the player wins.                      
      String winner = "Winner.txt";
      String winner2 = "Winner2.txt";
   
      File win = new File(winner);
      File won = new File(winner2);
      Scanner inputFile = new Scanner(win);
      Scanner inputFile2 = new Scanner(won);
       
      Scanner keyboard = new Scanner(System.in);
      Scanner keyboard2 = new Scanner(System.in);
      
      int game = 0;
   
      //Main code for the game with while loop and if else statments.
      while (true){
       
         System.out.print("Are you ready to play?? Type y to play and q to quit. ");
         String play = keyboard.nextLine();
         int output = userOutput(play);
         
         if (output == 0){
            break;
         }
         else if (output == 1 ){
            continue;
         }
         
         System.out.print("Would you like to 1. get something to eat or 2. go on a ride? Press 1 or 2. ");
         int playGame = keyboard2.nextInt();
         
         if (playGame == 1 ){
            System.out.print("Would you like to 1. eat a " +foodNames[0] + " or 2. eat a " +foodNames[1]+ "? Press 1 or 2. ");
            playGame = keyboard2.nextInt();
               
            if (playGame == 1){
               System.out.print("MMMM!! That " + foodNames[0] + " was delicious =). \nWould you like to 1. ride on " + 
                                rideNames [0] + " or 2. ride on " + rideNames [1] + "? Pres 1 or 2. ");
               playGame = keyboard2.nextInt();
                     
               if (playGame == 1){
                  if (lossOption("Uh Oh!! You have thrown up on the ride and have been kicked out of the park =(. ", keyboard)){
                     continue;
                  }
                  else {
                     break;
                  } 
               }                     
               else if (playGame == 2){
                  System.out.print("WOOO!! That was fun!!\nWould you like to 1. go get a " +foodNames[2] + " or 2. ride on " + rideNames [2] +
                                   " Press 1 or 2. ");
                  playGame = keyboard2.nextInt();
                            
                  if (playGame == 1){
                     if(lossOption("OOOH Mann, it seem that you've drank too much " + foodNames[2] +" and have jumped in a fountain ={." ,keyboard)){
                        continue;
                     }
                     else {
                        break;
                     }   
                  }
                  else if (playGame == 2){
                     if (lossOption("Oh No!!! You have been scared out of your socks and fainted!! ={",keyboard)){
                        continue;
                     }
                     else {
                        break;
                     }   
                  }
               }      
            } 
            else if (playGame == 2){
               if (lossOption("OOH NOO!! You have gotten food poisoning because you never know what is in a " +foodNames[1] + ":'{.", keyboard)){
                  continue;
               }
               else{
                  break;
               }
            }
         }
         else if (playGame == 2){
            System.out.print("Would you like to 1. ride on " + rideNames [3] + " or 2. ride on " +  rideNames [4] +"? Press 1 or 2. ");
            playGame = keyboard2.nextInt();
            
            if (playGame == 1){
               System.out.print("Oh Yeah that was fun!!! Would you like to 1. go get some " + foodNames[3]+ " or 2. ride on " +rideNames [5] +" ? Press 1 or 2. ");
               playGame = keyboard2.nextInt();
                         
               if (playGame == 1){
                  if (lossOption("Bad News!!! it seems that you have lost your wallet on " + rideNames [3] +" now you can't get food :(!!", keyboard)){
                     continue;
                  }
                  else {
                     break;
                  } 
               }
               else if (playGame == 2){
                  System.out.print("OHH YEAHH!! That was great! Now would you like to 1. go on " +rideNames [6]+ 
                                   " or 2. go on " +rideNames [7]+ "? Press 1 or 2. ");
                  playGame = keyboard2.nextInt();
                                  
                  if (playGame == 1){
                     if (lossOption("Well.... you have gotten dizzy on " +rideNames [6]+" and had to go to the medical center ={.", keyboard)){ 
                        continue;
                     }
                     else {
                        break;
                     }  
                  }
                  else if (playGame == 2){
                     System.out.print("THAT WAS AWESOME!! Would you like to 1. go get a " +foodNames [4] +" or 2. go on " +rideNames [8]+
                                      "? Press 1 or 2. ");
                     playGame = keyboard2.nextInt();
                     if (playGame == 1){
                        System.out.print("YUUUMMM!!! That was goood! Would you like to 1. Ride on " +rideNames [10]+" or 2. ride on " +rideNames [9]+
                                         " Press 1 or 2. ");
                        playGame = keyboard2.nextInt(); 
                        if (playGame == 1){
                           if (lossOption("Oh NO!!! you have gotten wet and are beginning to come down with a cold.... you gotta go home :{.", keyboard)){
                              continue;
                           }
                           else {
                              break;
                           } 
                        }
                        else if (playGame ==2){
                           System.out.println( inputFile.nextLine());
                           System.out.print(inputFile2.nextLine() + " Would you like to play again? press y for yes and q to quit. ");
                           play = keyboard.nextLine();
                           output = userOutput(play); 
                           if (output == 0){
                              break;
                           }
                           if (output == 1 ){
                              continue;
                           }
                           inputFile.close();
                        }
                     }
                     else if (playGame == 2){
                        if (lossOption("Oh Great!!! You have been taken by a Gorilla and they are holding you like a baby ={.", keyboard)){
                           continue;
                        }
                        else {
                           break;
                        } 
                     }
                  }
               }
            }
            else if (playGame == 2){
               if (lossOption("Uh Oh it seems " +rideNames [4] + " has taken you all the way to outer space ={!!", keyboard)){
                  continue;
               }
               else {
                  break;
               } 
            }
         }
      }   
   }
}
