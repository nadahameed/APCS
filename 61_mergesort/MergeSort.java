/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
    merge method:
    - define two counters and set them to 0, one per inputed array
    - compare the values at the indeces of the counters (respectively)
    - add the lesser value to the new merge array
    - increase the counter by one for the array with that lower value you just added
    - continue comparing until there are no more elements left in an array
    - add the remaining elements of the remaining array

    sort method:
    - create two arrays, of roughly the same length
    - set all the values of the arrays to the values of the inputed array
    -> differentiate between left and right (first 10 to left, last 10 to right)
    - merge the two arrays with the previous method
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] bear = new int[a.length + b.length];
    int actr = 0;
    int bctr = 0;
    for(int i = 0; i < bear.length; i++){
      if(actr == a.length){
        bear[i] = b[bctr];
        bctr++;
      }
      else if(bctr == b.length){
        bear[i] = a[actr];
        actr++;
      }
      else if(a[actr] > b[bctr]){
        bear[i] = b[bctr];
        bctr++;
      }
      else{
        bear[i] = a[actr];
        actr++;
      }
    }

    return bear;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] fox )
  {
    if (fox.length <= 1) {
      return fox;
    }
    int mid = (fox.length / 2);
    int[] left = new int[mid];
    int[] right = new int[fox.length - mid];
    for (int i = 0; i < mid; i++) {
      left[i] = fox[i];
    }
    for (int i = 0; i < right.length; i++) {
      right[i] = fox[mid + i];
    }
    return merge(sort(left), sort(right));
  }



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");

      System.out.println("\nbefore sorting:\n");
      printArray(( arr4 ) );
      printArray(( arr5 ) );
      printArray(( arr6 ) );
      printArray(( arr7 ) );

      System.out.println("\nafter sorting:\n");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
