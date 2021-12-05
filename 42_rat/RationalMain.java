public class RationalMain{

  public static void main(String[] args){

    Rational r = new Rational(2, 3);
    Rational s = new Rational(1, 2);
    Rational t = new Rational(10, 15);
    Rational test = new Rational(4, 4);

    System.out.println("--------------------");

    System.out.println("initial rationals:");
    System.out.println("r -> " + r.toString());
    System.out.println("s -> " + s.toString());
    System.out.println("t -> " + t.toString());
    System.out.println("test -> " + test.toString());

    System.out.println("--------------------");

    System.out.println("float:");
    System.out.println("r -> " + r.floatValue());
    System.out.println("test -> " + test.floatValue());

    System.out.println("--------------------");

    System.out.println("multiplication:");
    r.multiply(s);
    System.out.println("r * s -> " + r.toString());

    System.out.println("--------------------");

    System.out.println("division:");
    r.divide(s);
    System.out.println("r / s -> " + r.toString());

    System.out.println("--------------------");

    System.out.println("reduction:");
    t.reduce();
    System.out.println("t reduced -> " + t.toString());
    test.reduce();
    System.out.println("test reduced -> " + test.toString());

    System.out.println("--------------------");

    System.out.println("addition:");
    r.add(s);
    System.out.println("r + s -> " + r.toString());

    System.out.println("--------------------");

    System.out.println("subtraction:");
    r.subtract(s);
    System.out.println("r - s -> " + r.toString());

    System.out.println("--------------------");

    System.out.println("comparison:");
    System.out.println("r compared to s -> " + r.compareTo(s));
    System.out.println("r compared to t -> " + r.compareTo(t));

    //keep in mind that no Rationals are being reverted to their initial value
  }
}
