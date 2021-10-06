/* public class Greet {
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
  
  result:
  $ javac Greet.java
Word up freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom
  
  
  */



public class BigSib {
  String a;
  public String setHelloMsg(String helloMsg){
    a = helloMsg;
  }
  public String greet(String name){
    String x = name;
    return (a + " " + x);
  }
}

  
 /*   public class BigSib {
    public static void greet(String name){
        System.out.println("It's quite nice to see you, " + name + "!");
    }
}

*/
