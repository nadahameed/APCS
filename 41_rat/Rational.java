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
  
  public int num;
  public int den;
  
  public Rational(){
    num = 0;
    den = 1;
  }
  
  public Rational(int p, int q){
    num = p;
    den = q;
  }
  
  public String toString(){
    String s = num + " / " + den;
    return s;
  }
  
  public float floatValue(){
    return (float)(num / den);
  }
  
  public void multiply(Rational factor){
    this().p *= factor.p;
    this().q *= factor.q;
  }
  
  public void divide(Rational factor){
    this().p *= factor.q;
    this().q *= factor.p;
  }
}
