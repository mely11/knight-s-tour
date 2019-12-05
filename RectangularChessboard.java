public class RectangularChessboard {

    private int height;
    private int length;

    /**
     * Creates a chessboard with n rows and m columns
     * @param m
     * @param n
     */
    RectangularChessboard(int n, int m) {

        height = n;
        length = m;

    }


    public int getHeight(){

        return height;

    }



    public int getLength(){

        return length;

    }


    /**
     * Checks if a knight can move from the given chessboard square to the other given chessboard square
     * @param first
     * @param next
     * @return
     */
    public boolean checkMoveValidity(RectangularChessboardSquare first, RectangularChessboardSquare next) {

        return true;

    }

}
