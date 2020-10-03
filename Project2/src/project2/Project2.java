
package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("Hello, and welcome to ZOMBIE SURVIVAL.");  
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
            System.out.println("Would you like to play it?");
            input = keyboard.nextLine();
            }
        if (input.equalsIgnoreCase("O"))
        {   
            //The "o" in front of things specifies that it is for the original game mode.
            File oIntro = new File("oGameIntroduction.txt");
            PrintWriter writer4 = new PrintWriter("oGameIntroduction.txt");
            writer4.println("You woke up one day and saw that everyone--except for you--had turned into a zombie.");
            writer4.println("Your goal is to survive and find a cure for the zombies.");
            writer4.println("Press 'X' to learn how to play.");
            writer4.close();
            Scanner introReader = new Scanner (oIntro);
            while (introReader.hasNext())
            {
                System.out.println(introReader.nextLine());
            }
            
            input = keyboard.nextLine();
            while (input.equalsIgnoreCase("X"))
            {
                File oHelp = new File("oHelp.txt");
                PrintWriter helpWriter = new PrintWriter("oHelp.txt");
                helpWriter.println("Navigation: W = go forward, S = go backwards, A = walk left, D = walk right.");
                helpWriter.println("Commands: F = fight zombie, P = pinch yourself, T = talk to the zombies," 
                        + " C = drive car, Z = sleep. ");
                helpWriter.println("Note: The game will not end until you enter the secret word.");
                helpWriter.close();
                
                Scanner helpReader = new Scanner (oHelp);
                while (helpReader.hasNext())
                {
                    System.out.println(helpReader.nextLine());
                }
                input = keyboard.nextLine();
            }
            
    
        }
    
    }}
