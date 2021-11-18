/*
TNPG: doubleN - Nicole Zhou + Ducky, Nada Hameed + Ray
APCS
HW38 - Spin Class
2021-11-18
time spent: 45 min

DISCO:
- You cannot check whether 3 boolean expressions are the same

QCC:
- It'd be interesting to try and incorporate a monetary system into this
- Is there a specific purpose for machine02?
- What's the purpose of toString()?

*/


public class Slots {

  //instance variable to represent master copy for slot machine
  private static final String[] FRUITS = {
    "lime", "lime", "lime",
    "peach", "peach", "peach",
    "lemon", "lemon", "lemon",
    "cherry", "cherry", "cherry",
    "rambutan", "rambutan", "rambutan",
    "watermelon", "watermelon", "watermelon"};

  private String[] _fruits; //to be init'd by each instance


  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public Slots()
  {
    //allocate memory for _fruits based on size of FRUITS:
    _fruits = new String[FRUITS.length];

    //copy elements of FRUITS into _fruits:
    for (int i = 0; i < FRUITS.length; i += 1){
      _fruits[i] = FRUITS[i];
    }
  }


  /*=====================================
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString()
  {
    String s = ("" + _fruits[0] + "\t" + _fruits[1] + "\t" + _fruits[2]);
    return s;
  }


  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
 private void swap( int i, int j )
  {
    String atI = _fruits[i];
    String atJ = _fruits[j];
    _fruits[i] = atJ;
    _fruits[j] = atI;
  }


  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
  public void spinOnce()
  {
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
    for(int i = 0; i < _fruits.length; i++){
      int j = (int)(Math.random()*(_fruits.length - 1));
      swap(i, j);
  }
}


  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot()
  {
    boolean retBoo = false;
    retBoo = ((_fruits[0] == _fruits[1]) && (_fruits[1] == _fruits[2]));
    return retBoo;
  }


  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct,
    false otherwise
    =====================================*/
  public boolean miniWin()
  {
    boolean retBoo = false;
    retBoo = (((_fruits[0] == _fruits[1]) && (_fruits[1] == _fruits[2])) ||
              ((_fruits[0] != _fruits[1]) && (_fruits[1] != _fruits[2]) &&
               (_fruits[0] != _fruits[2])));
    return retBoo;
  }


  //main() method for testing
public static void main( String[] args ) {
    //usage: move bar below down 1 line at a time to test functionality...


    Slots machine01 = new Slots();
    Slots machine02 = new Slots();

    //test to verify slot machines function indepently
    System.out.println();
    System.out.println( "Machine01 initial state:\t" + machine01 );
    System.out.println( "Machine02 initial state:\t" + machine02 );

    System.out.println( "\nSpinning machine01...\n" );

    machine01.spinOnce();

    System.out.println();
    System.out.println( "Machine01 state:\t" + machine01 );
    System.out.println( "Machine02 state:\t" + machine02 );
    System.out.println();


    //test gamble-until-you-win mechanism

    System.out.println( "Preparing to spin until a mini win! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "WIN\n" );


    System.out.println( "Preparing to spin until...jackpot! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.jackpot() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }

    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "JACKPOT!\n" );

  }//end main

}//end class Slots
