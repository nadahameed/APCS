/*

TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS
HW41: Be Rational
2021-12-02
time spent: 1 hr

DISCOS:
- there is no difference between using this.num and just num
- precondition: num and den are ints

QCCs:
- would it have been more efficient to include accessors?
- how would we implement a simplify method?

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

  //simplify

  /*add
  public void add(Rational input){

  }*/

  //subtract


  //gcd helper
  public static int gcd(int a, int b){
    int x = 1;
    int gcd = 1;
    while ((x <= a) && (x <= b)){
      if ((a % x == 0) && (b % x == 0)){
        gcd = x;
      }
      x += 1;
    }
    return gcd;
  }

  //compareTo

}
