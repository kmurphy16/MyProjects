/**
*@author Kevin Murphy
*@version April 07, 2019
*  Homework 5
*  Adventure Game
*  Top: This is the beginning phase of building a simple, text-based adventure
*  game.  The player can explore the game world by traveling north, east,
*  south and west and is given a description of the area and options they have
*  to explore.
*/

import java.util.Scanner;

public class Game1 {
// Setup a variable and initialize it to hold the current room number that the player is
     public static int currentRoom = 0;
     static boolean gameOver = true;


     final int NUMBER_OF_ROOMS = 8;
     final int NORTH = 0;
     final int EAST = 1;
     final int WEST = 2;
     final int SOUTH = 3;

     final int southCell = 0;
	final int blockA = 1;
	final int southHall = 2;
	final int guardStation = 3;
	final int blockB = 4;
	final int prisonLobby = 5;
	final int northCell = 6;
	final int courtyard = 7;

     String[] rmDescription = new String[NUMBER_OF_ROOMS];
          rmDescription[0] = "You are in the southern jail cell";
          rmDescription[1] = "You entered Cell Block A";
          rmDescription[2] = "You decide to enter the hall";
          rmDescription[3] = "You are in the prison guard station";
          rmDescription[4] = "You entered Cell Block B";
          rmDescription[5] = "You are in the prison lobby";
          rmDescription[6] = "You are in the northern jail cell";
          rmDescription[7] = "You are in the courtyard";



     public static void main(String[] args) {
          initWorld();

     }//end main

     public static void initWorld() {
          //cleanly initiatilize all rooms inside of 1 method


     } //end initWorld method


} //end room class
class Player {
     int currentRoom = 0;
     currentRoom = roomExits[current][-1]

}
     int[][] roomExits = {
                              { 1, -1, -1,-1},
                              { 4,  2, -1, 0},
                              {-1,  3,  1,-1},
                              { 5, -1,  2,-1},
                              { 6, -1, -1, 1},
                              { 7, -1, -1,-3},
                              {-1, -1, -1, 4},
                              {-1, -1, -1, 5}
                         }


     while(game == true) {
		int tempRoom = currentRoom;

		System.out.println(descriptions [currentRoom]);

		System.out.println("Which direction would you like to go? n, e, s, w, or q to quit");

		String userDirection = input.nextLine();

		if (userDirection.equals("q")) {
			game = false;
			System.out.println("Thanks for playing!");
		}
		else if (userDirection.equals("n")) {
			currentRoom = exits [currentRoom][NORTH];
		}
		else if (userDirection.equals("e")) {
			currentRoom = exits [currentRoom][EAST];
		}
		else if (userDirection.equals("w")){
			currentRoom = exits [currentRoom][WEST];
		}
		else if (userDirection.equals("s")) {
			currentRoom = exits [currentRoom] [SOUTH];
		}
		else {
			System.out.println("You've entered an invalid input.");
		}
		if (currentRoom == -1) {
			System.out.println("There is no exit in this direction.");
			currentRoom = tempRoom;
		}
// if the player selected (n)orth
// we would use the 0th column value
// if the player selected (e)ast
// we would use the 1th column value
// if the player selected (w)est
// we would use the 2th column value
// if the player selected (s)outh
// we would use the 3th column value

          // while(gameOver != false) {
          //      if([what goes here][] != -1) {
          //           if(direction.equals("North")) {
          //           //change currentRoom[i] using value of j [i][j] of NORTH(0)
          //           currentRoom = roomExits[currentRoom][];
          //           }
          //      }
                    // if the player selected (q)uit
                    // exit program setting loop control variable to false

          // } //end while loop

} // end class
