// CNN: Nicole Zhou + Duck, Corina Chen + BinkTop, Nada Hameed + Ray
// APCS pd6
// HW55 -- Never Fear, Big Oh Is Here!
// 2022-01-12
// time spent

import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  public OrderedArrayList() {
    _data = new ArrayList<Integer> (10);
  }

  // best and worst case: none!
  //execution time: O(n) - goes through each element to create a String
  public String toString() {
    return _data.toString();
  }

  // best case: the index of the removal is the last - can leave the other elements alone
  // execution time: O(1) - doesn't go through each index, just removes one element
  // worst case: the index is the first - all the elements have to be moved down
  // execution time: O(n) - goes through each index and moves everything down
  public Integer remove( int i ) {
    return _data.remove(i);
  }

  // best and worst case: none
  // execution time is constant: O(1) - there are no iterations through the list, it's just the size being collected
  public int size() {
    return _data.size();
  }

  // best and worst case: none
  // execution time is constant: O(1) - only looks at one specific index regardless of the element
  public Integer get( int i ) {
    return _data.get(i);
  }

  // best case: the index is the last, and the list would still be sorted if newVal was set to the last index
  // there's no need to move all the other elements then, and it's still sorted
  // worst case: the index is the first, and newVal is the smallest element
  // newVal would be added to the beginning, and it would belong, meaning that all the following elements would have to be moved over
  // execution time: O(n) - it's a linear relationship because the number of iterations directly depends on the size of the list
  public Integer set(int index, int newVal){
    int oldVal = remove(index);
    addLinear(newVal);
    return oldVal;
  }
  
  // best case: the list's size is 0 and there is space in the array - you just add
  // worst case: the array is filled to the brim, meaning you must first expand the array and then add to it
  //  - also, newVal is the smallest element, because then you'd have to move all the following elements over
  // execution time: O(n) - the method iterates through the whole list, and then adds in the newVal, a direct relationship with size
  public void addLinear(Integer newVal)
  {
    if (size() == 0){
      _data.add(newVal);
    }
    else {
      for (int i = 0; i < size(); i++){
        if (newVal <= _data.get(i)){
          _data.add(i, newVal);
          return;
        }
      }
      _data.add(newVal);
    }
  }

  // best case: the list's size is 0 and there is space in the array
  // worst case: newVal is the smallest or largest within the arrayList, and there isn't enough space in the array
  // execution time: O(log2(x)) - the array is being divded into two repeatedly
  public void addBinary(Integer newVal) {
    int left = 0;
    int right = size() - 1;
    if ( size() == 0 ) {
      _data.add(newVal);
    }
    else {
      while (left < right ) {
        int mid = ( left + right ) / 2;
        if (_data.get(mid) == newVal) {
          _data.add(mid, newVal);
          break;
        }
        else if (_data.get(mid) < newVal ) {
          left = mid + 1;
        }
        else {
          right = mid - 1;
        }
      }
      _data.add(newVal);
    }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ )
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
