/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
// APCS pd6
// HW40 -- 2D arrays
// 2021-11-30

public class TwoDimArray{
  public static void print1( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    for (int i = 0; i < a.length; i += 1){
      int[] sub = a[i];
      String row = "[" + sub[0];
      for (int x = 1; x < sub.length; x += 1){
        row += ", " + sub[x];
      }
      System.out.println(row + "]");
    }
  }

  public static void print2( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    for (int[] sub : a){
      String row = "[" + sub[0];
      for (int x = 1; x < sub.length; x += 1){
        row += ", " + sub[x];
      }
      System.out.println(row + "]");
    }
  }

  public static int sum1( int[][] a ){
    // YOUR IMPLEMENTATION HERE
    int sum = 0;
    for (int[] sub : a){
      for (int x : sub){
        sum += x;
      }
    }
    return sum;
  }

  public static int sum2( int [][] m ){
    // YOUR IMPLEMENTATION HERE
    int sum = 0;
    for (int i = 0; i < m.length; i += 1){
      sum += sumRow(i, m);
    }
    return sum;
  }

  public static int sumRow( int r, int[][] a ){
    // YOUR IMPLEMENTATION HERE
    int[] sub = a[r];
    int sum = 0;
    for (int i = 0; i < sub.length; i += 1){
      sum += sub[i];
    }
    return sum;
  }

  public static int sumRow2(int r, int[][] m){
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    int[] sub = m[r];
    for (int x : sub){
      summer += x;
    }
    return summer;
  }
  
  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray