
package project2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("Hello, and welcome to ...");  
        System.out.println("You can either choose to play the original game, or create your own!");
        System.out.println("Press 'O' to play the original or 'C' to create your own.");
        
        
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        
        //The "c" in front of everything signifies that it is for the create mode.
        if (input.equalsIgnoreCase("c"))
        {
            System.out.println("Please write an introduction/description for your game.");
            PrintWriter writer1 = new PrintWriter("cGameIntroduction.txt");
            input = keyboard.nextLine();
            writer1.println(input);
            writer1.close();
            do
            {    
            System.out.println("Specify any commands the player is able to do (such as 'walk forward').");
            input = keyboard.nextLine();
            PrintWriter writer2 = new PrintWriter(input + ".txt");
            System.out.println("Does this command wound the player?");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Yes"))    
            {
              writer2.println("You've been wounded!");
            }
            else
            {
                writer2.println(" ");
            }
            System.out.println("Please enter a description of what the command does.");
            input = keyboard.nextLine();
            writer2.println(input);
            writer2.close();
            
            System.out.println("Would you like to create another command?");
            input = keyboard.nextLine();
            } while (input.equalsIgnoreCase("yes"));
            
            System.out.println("Please enter in the secret escape word for your game.");
            input = keyboard.nextLine();
            PrintWriter writer3 = new PrintWriter ("cGameEscapeWord.txt");
            writer3.println(input);
            writer3.close();
            System.out.println("Congratulations! You have finished your game!");
            }
    
}}
