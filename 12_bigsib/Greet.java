/*
Nada Hameed, Hugo Jenkins
APCS
HW12 -- returns greetings specific to each big sib -- this is class BigSib called by Greet.java
10/06/2021
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib remy = new BigSib();
    richard.setHelloMsg("Salutations");

    greeting = remy.greet("Dr. Spaceman");
    System.out.println(greeting);
    
    BigSib raine = new BigSib();
    raine.setHelloMsg("Hey ya");

    greeting = raine.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib rorie = new BigSib();
    rorie.setHelloMsg("Sup");

    greeting = rorie.greet("mom");
    System.out.println(greeting);

  }
}

/*
DISCOVERIES:
- the names (richard, remy, raine, and rorie) don't show up at all in the code - they are just representing each "big sib" with personalized greetings not direct to them.

UNRESOLVED QS:
-
*/
