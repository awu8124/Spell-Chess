package main.java.spellchess.model;

public class Chess {
    public final int BOARD_DIM = 8;

    private Position[][] board;

    public Chess(){
        //instantiation of playing board
        board = new Position[BOARD_DIM][BOARD_DIM];

        //creates a new position for every square of the board
        for(int row = 0; row < BOARD_DIM; row++)
        {
            for(int col = 0; col < BOARD_DIM; col++)
            {
                board[row][col] = new Position(row, col);
            }
        }
    }
}
