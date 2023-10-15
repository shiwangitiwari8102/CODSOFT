package Task;

import java.util.Scanner;

import java.util.Random;


public class NumberGuessingGame {

		public static void main(String[] args) {
			
			int roundsWon=0;
			int totalAttempts=0;
			int totalRounds=1;
			
			Random rand = new Random();
			
	       while(true){
	    	   int attempts=0;
	    	   int numberOfAttempts=6;
			
			int randomnumber  = rand.nextInt(100)+1;
	       
			System.out.println("Welcome in Number guessing game ");
			System.out.println("Let's play");
			System.out.println("Enter your guess(1-100)");
			
			Scanner scn = new Scanner(System.in);
			
          while(attempts<numberOfAttempts){
		       int playerguess = scn.nextInt();
		 	   attempts++;
		    
		    if(playerguess== randomnumber) {
		    	System.out.println("Correct! You win!"+" in "+ attempts+" attempts");
		    	roundsWon++;
		    	break;
		    }
		    else if(playerguess<randomnumber){
		    	System.out.println("Nope! The no. is bigger . please enter bigger no.");
		    	
		    }
		    
		    else {
		    	System.out.println(" Nope! The no. is smaller . please enter smaller no.");
		    }
		 
		 }
          
          totalAttempts += attempts;
		 
		    System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scn.next().toLowerCase();
            if (!playAgain.equals("yes")) {
               break;
         }
            totalRounds++;
	   }
			    System.out.println("Total no. of attempts:" +  totalAttempts );
	            System.out.println("Total Rounds Won: " + roundsWon +" out of " +totalRounds + " rounds played");
	            System.out.println("Total Rounds Lost: " + (totalRounds - roundsWon));
			    System.out.println("Thanks for playing");
			    System.out.println("Please visit again!");
			
	}	
		
}




