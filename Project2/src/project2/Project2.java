package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello! With this program, you have the ability to create and play your own game!");
        System.out.println("Press 'C' to create or 'O' to play.");

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        if (input.equalsIgnoreCase("c")) {
            System.out.println("Please write an introduction/description for your game.");
            PrintWriter writer1 = new PrintWriter("GameIntroduction.txt");
            input = keyboard.nextLine();
            writer1.println(input);
            writer1.close();
            do {
                System.out.println("Specify any commands the player is able to do (such as 'walk forward').");
                System.out.println("NOTICE: You must create a command that will heal the player "
                        + "after they've been wounded.");
                input = keyboard.nextLine();
                PrintWriter writer2 = new PrintWriter(input + ".txt");
                System.out.println("Does this command wound the player?");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("Yes")) {
                    writer2.println("You've been wounded!");
                } else {
                    writer2.println(" ");
                }
                System.out.println("Does this command heal the player?");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                    writer2.println("You have been healed.");
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
            PrintWriter writer3 = new PrintWriter("GameEscapeWord.txt");
            writer3.println(input);
            writer3.close();
            System.out.println("Congratulations! You have finished your game!");
            System.out.println("Would you like to play it? If so, press 'O.'");
            input = keyboard.nextLine();
        }
        if (input.equalsIgnoreCase("O")) {
            File Intro = new File("GameIntroduction.txt");
            Scanner introReader = new Scanner(Intro);
            while (introReader.hasNext()) {
                System.out.println(introReader.nextLine());
            }
            System.out.println("Please enter a command.");
            while (!input.equalsIgnoreCase("GameEscapeWord.txt")) {
                input = keyboard.nextLine();
                File nextCommand = new File(input + ".txt");
                if (nextCommand.exists()) {
                    Scanner nextCommandReader = new Scanner(nextCommand);
                    while (nextCommandReader.hasNext()) {
                        System.out.println(nextCommandReader.nextLine());
                    }
                }
                    while (!nextCommand.exists()) {
                        System.out.println("That is an invalid command. Please try again.");
                        input = keyboard.nextLine();
                        File tryAgain = new File(input + ".txt");
                        if (tryAgain.exists()) {
                            Scanner tryAgainReader = new Scanner(tryAgain);
                            while (tryAgainReader.hasNext()) {
                                System.out.println(tryAgainReader.nextLine());
                            }
                       break; }
                    }
                
                
               
                

            }
        } 

    }
  
    
}
}
