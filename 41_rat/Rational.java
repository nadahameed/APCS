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
  }

  public double floatValue(){
    return (double)(p/q);
  }

  public String toString(){
    return (p + " / " + q);
  }

  public void multiply(Rational factor){
    p *= factor.p;
    q *= factor.q;
  }
  
 /* public void divide(Rational factor){
    this().p *= factor.q;
    this().q *= factor.p;
  }*/
}
