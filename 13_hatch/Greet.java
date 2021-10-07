/*
NHS -- Nada Hameed + Ray, Hugo Jenkins + Boary
APCS
HW13 -- using a constructor method
10/07/2021
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    BigSib remy = new BigSib("Salutations");

    greeting = remy.greet("Dr. Spaceman");
    System.out.println(greeting);
    
    BigSib raine = new BigSib("Hey ya");

    greeting = raine.greet("Kong Fooey");
    System.out.println(greeting);
    
    BigSib rorie = new BigSib("Sup");

    greeting = rorie.greet("mom");
    System.out.println(greeting);

  }
}
