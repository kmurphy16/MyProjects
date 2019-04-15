/*
 * Homework 2
 *@author Kevin Murphy
 *@version February 15, 2019
*/

import java.util.Scanner;

public class Homework2
{

    public static void main(String[] args)
    {
		// Initialize variables we will need
		// Initialize a variable that represents the lowest possible number to (what type should this be)
		int lowerBound = 0;
        // Initialize a variable that represent the highest possible number to 100  // (what type should this be?)
		int upperBound = 100;
		// Initialize a variable in which to store the number of guesses we’ve made to 0
		int tries = 0;
		// Declare a variable in which to store an initial guess
		int guess;
		// Declare a variable to store user input (make this an int)
		int userResponse;
		// Initialize a Scanner object (call the variable you assign it to "input" //for consistency with class examples)
		Scanner input = new Scanner(System.in);
		// Prompt the user to choose a number (this is simply output –the program //shouldn’t know the number)
		System.out.println("Choose a number from 1 to 100:\n");
		
		
		
		// Make the initial guess and store guess
		guess = (upperBound+lowerBound)/2;
		
		// Increment the value in the variable storing number of guesses.
		tries += 1;


		// Present this guess to user
		System.out.printf("Is your number %d?\n", guess);
		/* Present prompt to user prompt using print() ("Enter 1 if this was a correct guess,  2 if your number is higher, and 3 if your number is lower:"*/
		System.out.print("[1] correct guess,\n[2] number is higher, \n[3] number is lower:\n");
		// Use Scanner to grab the nextInt() the usertypes in, and store it.
		userResponse = input.nextInt();
		
		// While (haven't guessed the correct number as "correctGuess")			correctGuess == false)
		while(userResponse != 1)
		{
			
			// Modify range for next guess
			if(userResponse == 2)
			{
				lowerBound = guess;
			}
			if(userResponse == 3)
			{
				upperBound = guess;
			}
			// Generate next guess
			guess =(upperBound+lowerBound)/2;
			tries += 1;
			// Present guess to user
			System.out.printf("Is your number %d\n", guess);
			// Present prompt to user ("Enter 1 if this was a correct guess,  2 if your	number is higher, and 3 if your number is lower:")*/
			System.out.printf("[1] correct guess,\n[2] number is higher, \n[3] number is lower:\n");
			// Use Scanner to grab the nextInt() the user types in, and store it.
			userResponse = input.nextInt();
			
		}		
		
				
		//	Print out number of steps it took to guess the "correctGuess"
		System.out.printf("I guessed your number in " + tries + " tries!\n");
    }
}

	