/*

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
