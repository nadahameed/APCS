/*
TNPG: Stack Underflow: Ariel Fuchs + Skelly ducker, Russell Goychayev + Duck, Nada Hameed + Ray
APCS
HW 65 - How many queens can a thinker place [...] QUEENS
2022-02-16
time spent: 1.5 hrs
*/


/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's (empty)
   * postcondition: board has queens in safe positions -> true (empty board -> false)
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve() //do we really need to separate the two methods
  {
    return solveH(0); //start from top left!
  }


  /**
   *Helper method for solve.
   (recursion)
   */
  private boolean solveH( int col ) //traverses by row
  {
    if (col >= _board.length){ //board.length returns the length of the row
      return false; //can't go past length
    }
    for (int row = 0; row < _board.length; row++){
      if (addQueen(row, col)){ //if there's no queen there... -> adds qn there
        if (solveH(col + 1) == true); //then if there's something to the right...
          removeQueen(row, col); //remove queen there
        }
      }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString (modification)...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String s = "";
    for(int row = 0; row < _board.length; row++) { //start with one row
      for(int col = 0; col < _board.length; col++) { //add q's/_'s in that row (traverse columns)
        if (_board[row][col] <= 0) { //no qn
          s += "_";
        }
        if (_board[row][col] == 1) { //yes qn
          s += "Q";
        }
      }
      s += "\n"; //next row
    }
    System.out.println(s);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description> adds a queen, marks sqrs (to the right of it) that this queen threatens
   * precondition: row, col < size; row, col >= 0
   * postcondition: true if you can add a queen, false if not (already a queen there)
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description> removes queen from a position, and marks previously threathened sqrs as nonthreatening
   * precondition: row, col < size; row, col >= 0
   * postcondition: true if there's a queen to remove, false if there's no queen to remove
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description> traverses row and prints values at that pos in the 2d array, then goes to next row, and so on
   * precondition: _board.length > 0
   * postcondition: whole 2d array is printed
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    b.printSolution();
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    b.printSolution();
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    b.printSolution();
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

  }

}//end class
