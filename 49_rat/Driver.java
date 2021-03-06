public class Driver {
  public static void main(String[] args){
    Rational a = new Rational(2, 3);
    Rational b = new Rational(1, 2);
    Rational c = new Rational(4, 18);

    System.out.println("Testing add():");
    a.add(b);
    System.out.println("a: " + a); // 7/6
    System.out.println("b: " + b); // 1/2

    System.out.println("\nTesting subtract():");
    a.subtract(b);
    System.out.println("a: " + a); // 2/3
    System.out.println("b: " + b); // 1/2

    System.out.println("\nTesting reduce():");
    c.reduce();
    System.out.println("c: " + c); // 2/9

    System.out.println("\nTesting compareTo():");
    System.out.println(a.compareTo(b)); // positive integer

    Integer x = 2;

    // System.out.println("\nTesting compareTo():");
    // System.out.println(a.compareTo(2));
    // System.out.println(a.compareTo(x));

    System.out.println("\nTesting equals():");
    System.out.println(a.equals(2));
    System.out.println(a.equals(x));
    System.out.println(b.equals(0.5));
  }
}
