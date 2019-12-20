import javafx.util.Pair;

import java.util.ArrayList;

public class KnightsTour {

    private int n, m;
    private int[][] tour;


    public KnightsTour(int n, int m, int[][] tour) {
        this.n = n;
        this.m = m;
        this.tour = tour;
        if (!checkValidity()) {
            System.out.print("This knight's tour isn't actually a knight's tour!");
        }

    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public int[][] getTour() {
        return tour;
    }


    public boolean checkValidity() {



        for (int i = 0; i < getN() * getM()-1; i++) {

            if (!(Math.abs(getTour()[i][0] - getTour()[i + 1][0]) == 1 && Math.abs(getTour()[i][1] - getTour()[i + 1][1]) == 2) || !(Math.abs(getTour()[i][0] - getTour()[i + 1][0]) == 2 && Math.abs(getTour()[i][1] - getTour()[i + 1][1]) == 1)) {
                return false;
            }
        }

        //TODO: Have other conditions in here too, like checking if each thing is in here exactly once.



        return true;
    }


//---------------------------------------------------
    // The following methods will likely be necessary to code some of the combination/assembly algorithms.
    // I don't know for sure though.


    //TODO: Implement an algorithm here that reverses a given knight's tour -- that is, returns the tour, but backwards.
    public KnightsTour getReversed() {

        return null;

    }


    //TODO: Implement an algorithm here that shifts a given knight's tour n spaces down and m spaces over
    public KnightsTour getTranslated(int dn, int dm) {

        return null;
    }

    //TODO: Implement an algorithm here that rotates a knight's tour by 90 degrees
    public KnightsTour getRotated() {

        return null;
    }

    //TODO: Implement an algorithm here that reflects a knight's tour diagonally
    public KnightsTour getReflected() {

        return null;

    }

    //-------------------------


    public static KnightsTour LinWei3(int m) {

        BaseCases bc = new BaseCases();

        if (m < 11) {
            return bc.BCASE[3][m];
        } else {
            return LinWei3(m-4).combine3(LinWei3(4));
        }
    }


    //TODO: Implement code here that combines knight's tours of height 3; will require
    public KnightsTour combine3(KnightsTour k) {



        return k;

    };



    //-----------------------------------------

    //TODO: This code.
    public static KnightsTour LinWei5ormore(int n, int m) {


        // Divide the chessboard into 4 quadrants, making sure that the top-left one is the only one with an odd dimension.
        // Find knight's tours for each of them.
        // Combine the knight's tours as shown on my brainstorming sheet. Remember to reflect the bottom-left tour.


        return null;



    }

    //--------------------------------------------



}
