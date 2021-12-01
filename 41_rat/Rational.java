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
  
  public floatValue(){
    return (float)(num / den);
  }
  
  public Multiply(Rational factor){
    this.p = this.p * factor.p;
    this.q = this.q * factor.q;
  }
  
  public Divide(Rational factor){
    this.p = this.p / factor.p;
    this.q = this.q / factor.q;
  }
  
  public static void main(String[] args){
    
    Rational r = new Rational(2,3); //Stores rational number 2/3
    Rational s = new Rational(1,2); //Stores rational number 1/2
    System.out.println(r);
    System.out.println(s);
    System.out.println(r.multiply(s)); //Multiplies r by s, changes r to 2/6.  s remains 1/2
  }
}
