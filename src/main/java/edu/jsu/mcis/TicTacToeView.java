package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeView {
    
    private final Scanner keyboard;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView() {
        
        /* Initialize scanner (for console keyboard) */
        
        keyboard = new Scanner(System.in);
        
    }
	
    public TicTacToeMove getNextMove(boolean isXTurn) {
        
        //loop for user move
        /* Prompt the player to enter the row and the column of their next move.
           Return as a TicTacToeMove object. */
        
        // INSERT YOUR CODE HERE

        System.out.println("It is" + (isXTurn? " (X) ":" (O) ") + " 's turn.");
        System.out.print("Please enter both the row and the column numbers, separated by a space: ");
        int row = keyboard.nextInt();
        int col = keyboard.nextInt();

        TicTacToeMove x = new TicTacToeMove(row,col);
        return x;
    }

    public void showInputError() {

        System.out.println("The location you entered location is either invalid, already marked, or out of bounds.");

    }

    public void showResult(String r) {

        System.out.println(r + "!");

    }
    
    public void showBoard(String board) {
        
        System.out.println("\n\n" + board);
        
    }
	
}
