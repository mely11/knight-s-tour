public class RectangularChessboardSquare {

    // Might need to fiddle with this a little bit -- should the chessboard be part of it?
    // Possibly not.

    int x;
    int y;
    RectangularChessboard board;


    RectangularChessboardSquare(int x, int y, RectangularChessboard board) {

        this.x = x;
        this.y = y;
        this.board = board;



    }


    /**
     * Checks if the given square is actually on the chessboard.
     * @return
     */
    private boolean checkValidity() {

        return true;

    }

}
