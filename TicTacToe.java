
public class TicTacToe {
    private final char P1 = 'X';
    private final char P2 = 'O';
    private final char EMPTY = '-';

    private char[][] board;
    public TicTacToe() {
        this.board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = P1;
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
        checkWin();
        return;
    }

    public void reset() {

    }

    public void move() {

    }

    private boolean checkIfCorner(int i, int j) {
        return (i == 0 || i == 2) && (j == 0 || j == 2);
    }

    public void checkWin() {
        int[] tallyTop = new int[4];
        int[] tallySide = new int[4];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (row == col) {
                    tallyTop[0] += board[row][col];
                } 
                if (row + col == (board.length - 1)) {
                    tallySide[0] += board[row][col]; // Top Right Corner
                } 
                tallyTop[col + 1] += board[row][col]; //TODO add value!
                tallySide[row + 1] += board[row][col]; // TODO add value!
            }
        }

        int xWon = 3 * P1; 
        int oWon = 3 * P2;
        for (int i = 0; i < tallyTop.length; i++ ) {
            if(xWon == tallyTop[i] || tallySide[i] == xWon) {
                System.out.println("X Won, You suck O");
                return;
            } else if (oWon == tallyTop[i] || oWon == tallySide[i]) {
                System.out.println("O Won, You suck X");
                return;
            }
        }
        System.out.println("You both suck");
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
