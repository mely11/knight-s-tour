

public class BaseCases {



    static public KnightsTour[][] BCASE = new KnightsTour[12][12];
    int n = 12;
    public BaseCases() {
        BCASE[3][7] = new KnightsTour(new RectangularChessboard(3,7), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1}, {7, 3}, {5, 2}, {7, 1}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1} ,
                {2, 3}, {1, 2}, {3, 3}, {4, 1}, {6, 2}, {4, 3}, {2, 2}}));

        BCASE[3][8] = new KnightsTour(new RectangularChessboard(3,8), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1}, {1, 2}, {3, 3}, {4, 1}, {2, 2},
                {4, 3}, {8, 1}, {7, 3}, {5, 2}, {7, 1}, {8, 3}}));

        BCASE[3][9] = new KnightsTour(new RectangularChessboard(3,9), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {6, 3}, {5, 1}, {7, 2}, {9, 1}, {8, 3}, {7, 1}, {9, 2}, {7, 3}, {5, 2}, {3, 3}, {1, 2},
                {3, 1}, {2, 3}, {1, 1}, {5, 3}, {4, 1}, {2, 2}, {4, 3}, {8, 1}, {9, 3}}));

        BCASE[3][10] = new KnightsTour(new RectangularChessboard(3,10), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {10, 1}, {9, 3}, {8, 1}, {10, 2}, {8, 3}, {4, 1},{2, 2}, {4, 3}, {5, 1}, {6, 3}, {7, 1},
                {9, 2}, {7, 3}, {5, 2}, {3, 3}, {1, 2}, {3, 1}, {2, 3}, {1, 1}, {5, 3}, {9, 1}, {10, 3}}));
        int k = (n - 7) % 4 + 7;
        int j = (n - k)/4;
        if (k == 7){
            BCASE[3][7] = new KnightsTour(new RectangularChessboard(3,7), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1}, {7, 3}, {5, 2}, {7, 1}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1} ,
                    {2, 3}, {1, 2}, {3, 3}, {4, 1}, {6, 2}, {4, 3}, {2, 2}}));
            for (int i = 0; i < j; i++){
                int l = 4 * i;
                BCASE[3][n] = new KnightsTour(new RectangularChessboard(3, n ), RectangularChessboardSquare.tourBuilder(new int[][]{{l + 8, 3}, {l + 10, 2}, {l + 8, 1}, {l + 9, 3}, {l + 11, 2}, {l + 9, 1}, {l + 10, 3}, {l + 8, 2}, {l + 10, 1},
                        {l + 11, 3}, {l + 9, 2}, {l + 11, 1}}));
            }
        if (k == 8){
            BCASE[3][8] = new KnightsTour(new RectangularChessboard(3,8), RectangularChessboardSquare.tourBuilder(new int[][] {{1, 3}, {2, 1}, {4, 2},{6, 1},{8, 2}, {6, 3}, {5, 1}, {7, 2}, {5, 3}, {1, 1}, {2, 3}, {3, 1}, {1, 2}, {3, 3}, {4, 1}, {2, 2},
                    {4, 3}, {8, 1}, {7, 3}, {5, 2}, {7, 1}, {8, 3}}));
            for (int o = 0; o < j; o++){
                int l = 4 * o;
                BCASE[3][n] = new KnightsTour(new RectangularChessboard(3, n ), RectangularChessboardSquare.tourBuilder(new int[][]{{l + 9, 3}, {l + 11, 2}, {l + 9, 1}, {l + 10, 3}, {l + 12, 2}, {l + 10, 1}, {l + 11, 3}, {l + 9, 2}, {l + 11, 1},
                        {l + 12, 3}, {l + 10, 2}, {l + 12, 1}}));
        }
        }
        }

    }



}
