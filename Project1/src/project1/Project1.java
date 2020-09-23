
package project1;

import java.util.Scanner;

public class Project1 {

   
    public static void main(String[] args) {
    System.out.println("Welcome to ASYLUM ESCAPE.");     
    System.out.println("You were hiking in the woods and became lost. It was starting to become dark, so you"
                + " started to look for shelter."); 
    System.out.println("You decided that you would resume trying to find help after you had gotten a good night's sleep.");
    System.out.println("You found an abandoned asylum and decided to sleep there. As soon as you got inside, the doors shut behind you.");
    System.out.println("Your goal is to escape from the asylum.");
    System.out.println("Press 'x' to learn how to play the game.");
//Greeted player to game. Told them how to access help menu.


    Scanner keyboard = new Scanner(System.in);
    String help = keyboard.nextLine();
if (help.equalsIgnoreCase("x"))
  {
    System.out.println("The game will not end until you type in the secret word.");
    System.out.println("Navigtion: W = go forward, A = go left, S = go backwards, D = go right");
    System.out.println("Actions: F = turn on flashlight, C = ask 'Is anyone there?' P = pick lock, E = eat food, Z = sleep");
    System.out.println("Press 'H' for a hint.");
    System.out.println("Warning: you will get sick after you eat, and will be forced to take a short nap in order to get better.");
  }
//Created 'help' button.

 

    
    
    
    
    
    
   }



                
                

    

