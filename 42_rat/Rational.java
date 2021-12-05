/*

TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS
HW41: Be More Rational
2021-12-06
time spent: 45 min

DISCOS:
- compareTo utilizes signals/flags

QCCs:
- what's the most efficient way to revert a rational to its original state?
- is there a way to reduce the sum/difference in one method?
 -> without having to add/subtract and then reduce

*/

public class Rational{

  public int num;
  public int den;

  public Rational(){
    num = 0;
    den = 1;
  }

  public Rational(int p, int q){
    if (q == 0){
      num = 0;
      den = 1;
      System.out.println("not possible!");
    } else {
       num = p;
       den = q;
    }
  }

  public double floatValue(){
    double decimal = (double)num / den;
    return decimal;
  }

  public String toString(){
    return (num + " / " + den);
  }

  public void multiply(Rational input){
    num *= input.num;
    den *= input.den;
  }

  public void divide(Rational input){
    num *= input.den;
    den *= input.num;
  }

  //add
  public void add(Rational input){
    //creating ints n and d to so that it doesn't affect the conversion of the input's num and den
    int n = num * input.den;
    int d = den * input.den;
    input.num *= den;
    input.den *= den;
    num = n + input.num;
    den = d;
  }

  //subtract
  public void subtract(Rational input){
    //creating ints n and d to so that it doesn't affect the conversion of the input's num and den
    int n = num * input.den;
    int d = den * input.den;
    input.num *= den;
    input.den *= den;
    num = n - input.num;
    den = d;
  }

  //gcd helper
  public static int gcd( int a, int b ) {

    if (a == 0) {
      return b;
    }
    if (b == 0) {
      return a;
    }
    if (a <= b) {
      return gcd(a, b-a);
    } else {
      return gcd(a-b, b);
    }
  }

  //simplify
  public void reduce(){
    int gcd = gcd(num, den);
    num = num / gcd;
    den = den / gcd;
  }

  //compareTo
  public int compareTo(Rational input){
    subtract(input);
    if (num > 0) {
      return 1; //input is smaller
    }
    if (num == 0) {
      return 0; //they're the same
    } else {
      return -1; //input is larger
    }
  }
}
