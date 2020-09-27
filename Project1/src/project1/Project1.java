
package project1;

import java.util.Scanner;

public class Project1 {

   
    public static void main(String[] args) {


    
        System.out.println("Welcome to ASYLUM ESCAPE.");     
        System.out.println("You were hiking in the woods and became lost. It was starting to become dark, so you"
                    + " started to look for shelter."); 
        System.out.println("You decided that you would resume trying to find help" 
                + " after you had gotten a good night's sleep.");
        System.out.println("You found an abandoned asylum and decided to sleep there. As soon as you got inside,"
                + "the doors shut behind you.");
        System.out.println("Your goal is to escape from the asylum.");
        System.out.println("Press 'x' to learn how to play the game.");
//Greeted player to game. Told them how to access help menu.
    
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.nextLine();
    String help = "x"; 
    String escape = "window";
    String forward = "w";
    String left = "a";
    String backwards = "s";
    String right = "d";
    String flashlight = "f";
    String who = "c";
    String lock = "p";
    String hint = "h";
    String sleep = "z";
    String eat = "e";
    String word = "q";
    
 
    while (! input.equalsIgnoreCase(escape))
    { 
    while (input.equalsIgnoreCase("q"))
    {
        System.out.println("Type in the secret word in order to escape.");
        input = keyboard.nextLine();
        if (!input.equalsIgnoreCase(escape))
        {
            System.out.println("That's incorrect. Press 'Q' if you want to try again.");
            input = keyboard.nextLine();
        }
    }
    while (input.equalsIgnoreCase(help))
    {
        System.out.println("The game will not end until you type in the secret word.");
        System.out.println("Press 'Q' when you're ready to type in the secret word.");
        System.out.println("Navigation: W = go forward, A = go left, S = go backwards, D = go right");
        System.out.println("Actions: F = turn on flashlight, C = ask 'Is anyone there?'" 
                + " P = pick lock, E = eat food, Z = sleep");
        System.out.println("Press 'H' for a hint on the secret word.");
        System.out.println("Warning: you will get sick after you eat, and will be forced to take a" 
                + " short nap in order to get better.");
        
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
        System.out.println("You call out and ask if anyone is there. No one responds.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("p"))
    {
        System.out.println("You try to pick the lock on the door, but it doesn't budge.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("h"))
    {
        System.out.println("Hint: The secret word is something that most buildings have.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("z"))
    {
        System.out.println("You lie down to take a short nap.");
        input = keyboard.nextLine();
    }
    while (input.equalsIgnoreCase("e"))
    {
        System.out.println("You eat some food, and start to feel sick from it.");
        input = keyboard.nextLine();
        while (! input.equalsIgnoreCase("z"))
        {
            System.out.println("You feel too ill to try and find a way out."
                    + " You think taking a nap would probably make you feel better.");
            input = keyboard.nextLine();
        }
    }
    }
   
    if (input.equalsIgnoreCase("window"))
    {
        System.out.println("You climb through one of the windows and escape.");
        System.out.println("Congratulations! You have beat the game.");
    }


    }}



                
                

    

