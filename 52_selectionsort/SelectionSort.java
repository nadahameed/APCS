// CNN: Nicole Zhou + Duck, Corina Chen + Binktop, Nada Hameed + Ray
// APCS pd6
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: 1.5 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 * Find the first term (of whatever order) and swap it to the end
 * Find the second term and swap it to the second-to-last place
 * Repeat until it's in order (no more swaps made)
 *
 * DISCO
 * seems easier to have the sorting go from the greatest to least
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n-1 passes
 * q1: What do you know after pass p?
 * a1: the first p elements have been sorted
 * q2: How do you know if sorted?
 * a2: it is in the order you want it to be in
 * q3: What does a pass boil down to?
 * a3: it's simply the action of seeking for the item you wish to find and then
 * switching it into the position that is allocated for it
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
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
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for(int pass = data.size() - 1; pass > 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;

      for(int x = 0; x <= pass; x++) {

        if((data.get(maxPos)).compareTo(data.get(x)) < 0) {
          maxPos = x;
        }
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag

      }

      Comparable subby = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, subby);

      System.out.println( "after swap: " +  data );//diag
    }

  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


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
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
        /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
