/*
Team SN(Snooty Snickers): Nada Hameed, Sophia Eiden
APCS
HW23: What does equality look like?
2021-10-24
time spent: 37 mins (utilitarian methods completed in 30 minutes (exactly!)

DISCO:
 - objects can communicate directly to other objects via obj.var/method.
 - fun probability stuff with flip()! how to put biases into the flip.
QCC:
 - why does bias need to be a variable and not hardcoded if we are not going to manipulate it?

*/

/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin

    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin("quarter");

      //test 2nd overloaded constructor
      Coin wayne = new Coin("dollar", "heads" );

      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();

      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      int matchCtr = 0;
      if (yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
        matchCtr ++;
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      
      while (((yours.headsCtr + wayne.headsCtr) < 10) && (matchCtr == 5)){
      		yours.flip();
      		wayne.flip();
        int matchCtr = 0;
        if (yours.equals(wayne) ) {
          System.out.println( "Matchee matchee!" );
          matchCtr ++;
        }
        else {
          System.out.println( "No match. Firestarter you can not be." );
      }
      }
      //System.out.println("youve hit 10 flips!");
   
   /*
     if ((yours.headsCtr + wayne.headsCtr) == 5){
     System.out.println("5!");
     }
     else {
     yours.flip();
     wayne.flip();
     }
     
      /*===================TOP==========================
      ====================BOTTOM======================*/

  }//end main()
}//end class
