package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;
    public Board(Character[][] matrix) {
        board = matrix;
    }

    /*
    * 00 | 01 | 02
    * ---+----+---
    * 10 | 11 | 12
    * ---+----+---
    * 20 | 21 | 22
    * */

    public Boolean isInFavorOfX() {
        if (isWinning('X'))
            return true;
        return false;
    }

    public Boolean isInFavorOfO() {
        if (isWinning('O'))
            return true;
        return false;
    }

    public Boolean isTie() {
        if(!isBoardFull())
            return false;
        if (isBoardFull() && (isWinning('O') || isWinning('X')))
            return false;
        return true;
    }


    public String getWinner() {
        if (isWinning('X'))
            return "X";
        if (isWinning('O'))
            return "O";
        return "";
    }

    private Boolean isWinning(Character player) {
        if(     board[0][0].equals(player) && board[0][1].equals(player) && board[0][2].equals(player) ||
                board[1][0].equals(player) && board[1][1].equals(player) && board[1][2].equals(player) ||
                board[2][0].equals(player) && board[2][1].equals(player) && board[2][2].equals(player) ||
                board[0][0].equals(player) && board[1][0].equals(player) && board[2][0].equals(player) ||
                board[0][1].equals(player) && board[1][1].equals(player) && board[2][1].equals(player) ||
                board[0][2].equals(player) && board[1][2].equals(player) && board[2][2].equals(player) ||
                board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player) ||
                board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))
            return true;
        return  false;
    }

    private Boolean isBoardFull() {
        for (Character[] Horizontal : board)
            for (Character space : Horizontal)
                if (space.equals(' '))
                    return false;
        return true;
    }
}

