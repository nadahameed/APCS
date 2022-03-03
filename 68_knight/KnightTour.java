// TNPG: Stack Underflow: Nada Hameed + Ray, Ariel Fuchs + Skelly Duckler, Russell Goychayev + Duck
// APCS pd7
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent:  1 hr + class time

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 *  - move a knight on a chessboard until all the squares are filled
    -> if you can't move the knight further while there are empty squares, go back one move, and try another possibility
    -> repeat the last two steps until the board has been entirely traversed by the knight once/sq
 * DISCO
    - use Math.random() to have a random starting position
    - big O of n^2
 *
 * QCC
    - pushing farther not complete
    - why does it take more time sometimes even though the computer follows the same pattern?
    - larger boards are very taxing to the computer!
 *
 * Mean execution times for boards of size n*n:
 * n=5   3.97s    across 4 executions (4.03, 3.75, 4.13, 3.97)
 * n=6   30.67s    across 1 executions
 * n=7   1142.03s    across 1 executions
 * n=8   1496.31s    across 1 executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    //tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    int startX = 2+(int)(Math.random()*n);
    int startY = 2+(int)(Math.random()*n);
    tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for(int i = 0; i < _board.length; i++){
      //fill in first 2 rows
      _board[0][i] = -1;
      _board[1][i] = -1;
      //last 2 rows
      _board[n + 2][i] = -1;
      _board[n + 3][i] = -1;
      //first 2 col
      _board[i][0] = -1;
      _board[i][1] = -1;
      //last 2 col
      _board[i][n + 2] = -1;
      _board[i][n + 3] = -1;
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved ) System.exit(0);

    //primary base case: tour completed
    if ( moves == (_board.length-4)*(_board.length-4)+1) { //if (moves>_sideLength*_sideLength)
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves. (abc- priority, 8 possibilities)
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      findTour(x + 1, y + 2, moves + 1); //a
      findTour(x + 2, y + 1, moves + 1); //b
      findTour(x + 2, y - 1, moves + 1); //c
      findTour(x + 1, y - 2, moves + 1); //d
      findTour(x - 1, y - 2, moves + 1); //e
      findTour(x - 2, y - 1, moves + 1); //f
      findTour(x - 2, y + 1, moves + 1); //g
      findTour(x - 1, y + 2, moves + 1); //h

      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
        _board[x][y] = 0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder
