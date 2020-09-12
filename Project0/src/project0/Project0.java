
package project0;

import java.util.Scanner;


public class Project0 {

    public static void main(String[] args) {
    
        System.out.println("Hello! I am the college cost estimator tool.");
        System.out.println("Please input your name to continue.");
        //User is greeted and told to input their name.
        

        String name;
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();
        System.out.println("Hello "+ name + ", please input how many credits you have earned so far.");
        //User inputs name and then prompted to put in number of credits earned so far.
         
        Double creditsEarned;
        creditsEarned = keyboard.nextDouble();
        System.out.println("Now, " + name + ", please type in how many credits you need for an associate's degree.");
        //User asked how many credits needed for associate's.

        
        Double creditsForAssociates;
        creditsForAssociates = keyboard.nextDouble();
        System.out.println(name + ", now type in how many credits you take per semester.");
        //User asked to input how many credits per semester they take.
        
        Double creditsPerSemester;
        creditsPerSemester = keyboard.nextDouble();
        System.out.println(name + ", how much does one credit cost?");
        //User asked how much $ one credit is.
        
        Double cost;
        cost = keyboard.nextDouble();
        
      
       System.out.println("You will need to complete " + 
               Math.ceil((creditsForAssociates - creditsEarned)/creditsPerSemester) +
               " more semesters in order to get your associate's.");
       //User told how many more semesters they will need to take. (Rounded up)
       
       
       Double creditsLeft = creditsForAssociates - creditsEarned;
        System.out.println("It will cost $" + creditsLeft*cost + " (not including supplies and additional fees).");


        
    }
    
}
