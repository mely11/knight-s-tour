

public class BaseCases {


    static public KnightsTour[][] BCASE = new KnightsTour[12][12];

    public BaseCases() {

        BCASE[3][7] = new KnightsTour(new RectangularChessboard(3,7), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1}, {7, 3}, {5, 2}, {7, 1}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1} ,
                {2, 3}, {1, 2}, {3, 3}, {4, 1}, {6, 2}, {4, 3}, {2, 2}}));

        BCASE[3][8] = new KnightsTour(new RectangularChessboard(3,8), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1}, {1, 2}, {3, 3}, {4, 1}, {2, 2},
                {4, 3}, {8, 1}, {7, 3}, {5, 2}, {7, 1}, {8, 3}}));

        BCASE[3][9] = new KnightsTour(new RectangularChessboard(3,9), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {6, 3}, {5, 1}, {7, 2}, {9, 1}, {8, 3}, {7, 1}, {9, 2}, {7, 3}, {5, 2}, {3, 3}, {1, 2},
                {3, 1}, {2, 3}, {1, 1}, {5, 3}, {4, 1}, {2, 2}, {4, 3}, {8, 1}, {9, 3}}));

        BCASE[3][10] = new KnightsTour(new RectangularChessboard(3,10), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {10, 1}, {9, 3}, {8, 1}, {10, 2}, {8, 3}, {4, 1},{2, 2}, {4, 3}, {5, 1}, {6, 3}, {7, 1},
                {9, 2}, {7, 3}, {5, 2}, {3, 3}, {1, 2}, {3, 1}, {2, 3}, {1, 1}, {5, 3}, {9, 1}, {10, 3}}));


    }



}
