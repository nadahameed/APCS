// TNPG: CNN - Corina Chen + Binktop, Nicole Zhou + Duck, Nada Hameed + Ray
// APCS pd6
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent: 1 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * 0. Start at one end of the array
 * 1. Compare the two consecutive objects
 * 2. If they are sorted, move on; if not, swap and move on
 * 3. Repeat steps 1 and 2 until you reach the last two elements
 * 4. Repeat 0 to 3 until there are no more swaps
 *
 * DISCO
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: the array is sorted
 * q1: After pass p, what do you know?
 * a1: that the first p objects are sorted
 * q2: How many passes are necessary to completely sort?
 * a2: the number of elements - 1
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    /* YOUR IMPLEMENTATION HERE */

    //outside for loop allows for several passes
    //if it didn't exist, there would only be one pass
    for (int i = 0; i < data.size(); i++){
      for (int x = data.size() - 1; x > i; x--){

        if (data.get(x).compareTo(data.get(x - 1)) < 0){
          Comparable subby = data.get(x);
          data.set(x, data.get(x - 1));
          data.set(x - 1, subby);
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    /* YOUR IMPLEMENTATION HERE */
    ArrayList subby = new ArrayList<Comparable>();
    for (Comparable a : input){
      subby.add(a);
    }
    bubbleSortV(subby);
    return subby;
  }


  public static void main( String [] args )
  {

      /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
