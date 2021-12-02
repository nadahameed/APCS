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

  public void multiply(Rational factor){
    num *= factor.num;
    den *= factor.den;
  }

  public void divide(Rational factor){
    num *= factor.den;
    den *= factor.num;
  }
}
