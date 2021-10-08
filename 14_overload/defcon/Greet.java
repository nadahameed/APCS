/*
HPN - Nada Hameed + Ray, Hugo Jenkins + Boary, Prattay Dey + Winnie
APCS
HW14 - using constructors
10/08/2021
*/

public class Greet{
  public static void main(String[] args){
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
  }
}

/*
DISCOVERIES:
- single quotations can only take a single character in java.
- a contructor with no parameters still runs and can be useful in many cases.
- the difference between the Greet files is that one of them takes an argument while creating the new instance of BigSib

QCC:
- can a constructor take multiple arguments?
- what other parameters could we include to make the code more efficient?
*/
