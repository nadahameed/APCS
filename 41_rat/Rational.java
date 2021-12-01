/*

TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS
HW41: Be Rational
2021-12-02
time spent:

DISCOS:
- 

QCCs:
- 

*/

public class Rational{
  
  protected int num;
  protected int den;

  public Rational(){
    p = 0;
    q = 1;
  }

  public Rational(int x, int y){
      num = x;
      den = y;
  }

  public double floatValue(){
    return (p/q);
  }

  public String toString(){
    return (p + " / " + q);
  }

  public void multiply(Rational factor){
    this.p *= factor.p;
    this.q *= factor.q;
  }
  
 /* public void divide(Rational factor){
    this().p *= factor.q;
    this().q *= factor.p;
  }*/
}
