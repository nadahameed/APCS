/*
TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS pd6
HW43 -- encapsulation (basic SuperArray functionality)
2021-12-07
time spent: 30 mins

DISCOS:
- toString doesn't have to be called => it's now the default toString of _data
  -> convenient

QCCS:
- how would we remove a term?
  -> what's the alternative to left-justification after doing so?

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    /* YOUR IMPLEMENTATION HERE */
    _data = new int[10];
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    /* YOUR IMPLEMENTATION HERE */
    String s = "[";
    for (int i : _data){
      s = s + i + ",";
    }
    s = s.substring(0,s.length() - 1) + "]";
    return s;
  }


  //double capacity of SuperArray
  private void expand()
  {
    /* YOUR IMPLEMENTATION HERE */
    int[] _newArray = new int[2 * _data.length];
    for (int i = 0; i < _data.length; i++) {
      _newArray[i] = _data[i];
    }
    _data = _newArray;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
    int oldVal = _data[index];
    _data[index] = newVal;
    return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );


      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
  }//end main()


}//end class
