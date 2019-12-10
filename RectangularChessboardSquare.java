public class RectangularChessboardSquare {

    // Might need to fiddle with this a little bit -- should the chessboard be part of it?
    // Possibly not.

    int x;
    int y;


    RectangularChessboardSquare(int x, int y) {

        this.x = x;
        this.y = y;

    }


    /**
     * Checks if the given square is actually on the chessboard.
     * @return
     */
    private boolean checkValidity(RectangularChessboard board) {

        return true;

    }



    public static RectangularChessboardSquare[] tourBuilder(int[][] arr) {

        int n = arr.length;
        RectangularChessboardSquare[] output = new RectangularChessboardSquare[n];
        for (int i = 0; i < n; i++) {
            output[i] = new RectangularChessboardSquare(arr[i][0], arr[i][1]);
        }

        return output;

    }

}
