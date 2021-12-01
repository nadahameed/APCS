public class RationalMain{
  
  public static void main(String[] args){
    
    Rational r = new Rational(2, 3);
    Rational s = new Rational(1, 2);
    System.out.println(r.toString());
    System.out.println(s.toString());
    
    r.multiply(s);
    System.out.println(r.toString());
  }
}
