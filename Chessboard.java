public abstract class Chessboard {

    abstract ChessboardSquare[] getLeft(ChessboardSquare start);

    abstract ChessboardSquare[] getRight(ChessboardSquare start);

    abstract ChessboardSquare[] getUp(ChessboardSquare start);

    abstract ChessboardSquare[] getDown(ChessboardSquare start);

    public ChessboardSquare[] getKnightMoves(ChessboardSquare start, Knight k) {

        // we want a generic algorithm here to get the knight moves based on the topology of
        // the chessboard we define above -- though in simpler cases, it would be easier
        // to override this

        return null;
    }

    abstract ChessboardSquare makeNextMove(ChessboardSquare start, Knight k);


}
