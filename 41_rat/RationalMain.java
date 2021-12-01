public class RationalMain{
  
  public static void main(String[] args){
    
    Rational r = new Rational(2, 3);       //Stores rational number 2/3
    Rational s = new Rational(1, 2);       //Stores rational number 1/2
    System.out.println(r.toString());
    System.out.println(s.toString());
    System.out.println(r.multiply(s));      //Multiplies r by s, changes r to 2/6.  s remains 1/2
  }
}
