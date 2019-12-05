public class KnightsTour {

    RectangularChessboard board;
    RectangularChessboardSquare[] tour;

    /**
     * Represents a knight's tour on a given board as a list of squares the knight visits on the board
     * @param board
     * @param tour
     */
    KnightsTour(RectangularChessboard board, RectangularChessboardSquare[] tour){

        this.board = board;
        this.tour = tour;

        if (checkValidity()) {

            throw new NullPointerException("bad");

        }

    }

    /**
     * Checks if the given knight's tour is indeed a valid knight's tour
     * -- every square on the chessboard is valid, every square on the chessboard is visited once,
     * and every two adjacent squares on the tour are a knight's move away from each other.
     * @return
     */
    private boolean checkValidity() {

        return true;


    }


    // defining a knight's tour object
    // ----------------------------------------------------
    // algorithms to find a knight's tour


    /**
     * Given a 3-by-m board (where m >= 7 or m == 4),
     * find a knight's tour on that chessboard with a divide-and-conquer algorithms
     * @param board
     * @return
     */
    public static KnightsTour findTour3(RectangularChessboard board){

        if (board.getHeight() != 3 || (board.getLength() < 7 && board.getLength() != 4)) {

            return null;
        }




        return null;


    }


    /**
     * The "assembly" step of our divide-and-conquer algorithm --
     * combines a 3-by-k knight's tour (with k >= 7) with a 3-by-4 knights tour
     * to create a 3-by-(k+4) knight's tour.
     * @return
     */
    public KnightsTour combine3(KnightsTour k, KnightsTour four) {

        return null;
    }

}



