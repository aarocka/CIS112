package com.hw8;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Hello");
        //Prompt the user for the number of players that want to play your game.
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of players?");
        int numberOfPlayers = reader.nextInt();

        //Prompt each player to enter their name. Create a new Player object for each player,
        // add it to a Node, and then link it into the list.

        /* this is an example of how to make objects with loops
         *
         *  ArrayList<Customer> custArr = new ArrayList<Customer>();
         *  while(youWantToContinue) {
         *      //get a customerName
         *      //get an amount
         *      custArr.add(new Customer(customerName, amount);
         *  }
         *
         */

        for (int i=0; i<numberOfPlayers; i++) {

        }
        
        
        
        //Once all of the players are added choose a random number between 1 and 100 and start playing.
        // Each player gets 1 guess and then the next player gets a turn. The player that guesses the number wins.
        // The players continuing taking turns in a “circular” fashion until one of them wins. Pay special attention
        // to this interaction.

        //For each turn a player can guess a number, a player can choose to leave the game and be removed from the
        // linked-list, or a player can choose to skip their turn and allow a new player to join in the game and be
        // added to the linked-list. You’ll need a small menu system to handle this interaction. If there is only 1
        // player left in the list, that player is the winner.

        //Once a player is declared the winner, prompt them if they’d like to play again. If so, immediately start
        // the next game with the existing players. The player that won the previous game will now go first. If they
        // choose to not play again then show the statistics for each player during the run of games just played
        // (total games played, wins, losses, etc.) and then exit the program.
    }
}
