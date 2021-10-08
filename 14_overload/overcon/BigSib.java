/*
HPN - Nada Hameed + Ray, Hugo Jenkins + Boary, Prattay Dey + Winnie
APCS
HW14 - using contructors
10/08/2021
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
- single quotations can only take a single character in java.
- a contructor with no parameters still runs and can be useful in many cases.
- the difference between the Greet files is that one of them takes an argument while creating the new instance of BigSib

QCC:
- can a constructor take multiple arguments?
- what other parameters could we include to make the code more efficient?
*/
