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

public class Game {
// Setup a variable and initialize it to hold the current room number that the player is

     final int NUMBER_OF_ROOMS = 8;
     final int NORTH=0;
     final int EAST=1;
     final int WEST=2;
     final int SOUTH=3;

     private Room southCell;
     private Room blockA;
     private Room southHall;
     private Room guardStation;
     private Room blockB;
     private Room prisonLobby;
     private Room northCell;
     private Room courtyard;

     public static void main(String[] args) {

} // end main method

     public Prison() {
          this.southCell = new Room("Southern Jail Cell", "You are in the southern jail cell");
          this.blockA = new Room("Cell Block A", "You are in cell block A");
          this.southHall = new Room("Southern Hall", "You are in the southern hall");
          this.guardStation = new Room("Guard Station", "You are in the southern jail cell");
          this.blockB = new Room("Cell Block B", "You are in cell block B");
          this.prisonLobby = new Room("Prison Lobby", "You are in the prison lobby");
          this.northCell = new Room("Northern Jail Cell", "You are in the northern jail cell");
          this.courtyard = new Room("Courtyard", "You are in the courtyard");
          this.createRooms();
     }

     private void createRooms() {
          southCell.setExits(blockA, null, null, null);
          blockA.setExits(blockB, southHall, null, southCell);
          southHall.setExits(null, guardStation, blockA, null);
          guardStation.setExits(prisonLobby, null, southHall, null);
          blockB.setExits(northCell, null ,null ,blockA);
          prisonLobby.setExits(courtyard, null, null, guardStation);
          northCell.setExits(null ,null ,null ,blockB);
          courtyard.setExits(null, null, null, prisonLobby);
     }

     public Room getStartingPoint() {
          return this.southCell;
     }

     public String getDescription() {
          return "Sirens are screaming and lights are flashing...PRISON RIOT---TIME TO ESCAPE!";
     }



} // end class
