/*
NHS -- Nada Hameed + Ray, Hugo Jenkins + Boary
APCS
HW13 -- using a constructor method
10/07/2021
*/

public class BigSib {
  String helloMsg;
  public BigSib(String a){
    helloMsg = a;
  }
  public String greet(String name){
    return(helloMsg + " " + name);
  }
}

/*
DISCOVERIES:
- This is basically a shortcut of 12_bigsib
- Earlier code:
  
  public class BigSib {
    String helloMsg;
    public BigSib(String a){
      a = helloMsg;
    }
    public String greet(String name){
      return(helloMsg + " " + name);
    }
  }
  
  -> returned null [name] for all four big sibs
  
UNRESOLVED QS:
- 
*/
