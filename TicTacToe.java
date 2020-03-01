public class TicTacToe {
    private final char P1 = 'X';
    private final char P2 = 'O';
    private final char EMPTY = '-';

    private char[][] board;

    public TicTacToe() {
        this.board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    /* TODO: 
     * Need to be able:
     *  1. Update the board
     *      a) Get user input
     *      b) Switch player
     *      c) Validate a move
     *  2. Check who the winner is
     *  3. Reset the game
    */
    public void play() {

    }

    public void reset() {

    }

    public void move() {

    }

    public void checkWin() {

    }

/* END */

    public void aiPlay() {

    }

    public void draw() {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("----------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("----------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
