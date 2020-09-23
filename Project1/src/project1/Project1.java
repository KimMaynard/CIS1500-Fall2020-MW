
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
    String help = "x"; 
    String escape = "window";
    String input = keyboard.nextLine();
    String forward = "w";
    String left = "a";
    String backwards = "s";
    String right = "d";
    String flashlight = "f";
    String who = "c";
    String lock = "p";
    
    while (! input.equalsIgnoreCase(escape)) 
    {
    while (input.equalsIgnoreCase(help))
    {
        System.out.println("The game will not end until you type in the secret word.");
        System.out.println("Navigtion: W = go forward, A = go left, S = go backwards, D = go right");
        System.out.println("Actions: F = turn on flashlight, C = ask 'Is anyone there?' P = pick lock, E = eat food, Z = sleep");
        System.out.println("Press 'H' for a hint.");
        System.out.println("Warning: you will get sick after you eat, and will be forced to take a short nap in order to get better.");
        
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("w"))
    {
        System.out.println("You move forward a couple steps.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("a"))
    {
        System.out.println("You start walking to the left.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("s"))
    {   System.out.println("You take a couple steps backwards.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("d"))
    {
        System.out.println("You start walking to the right.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("f"))
    {
        System.out.println("You turn on your flashlight.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("c"))
    {
        System.out.println("You call out and ask if anyone is there.");
    }
    while (input.equalsIgnoreCase("p"))
    {
        System.out.println("You try to pick the lock on the door, but it doesn't budge.");
        input = keyboard.nextLine();
    }
    
    
    
    
    
   }



                
                

    

