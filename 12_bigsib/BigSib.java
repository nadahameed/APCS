/*
Nada Hameed, Hugo Jenkins
APCS
HW12 -- returns greetings specific to each big sib -- this is class BigSib called by Greet.java
10/06/2021
*/

public class BigSib {
  String a;
  public void setHelloMsg(String helloMsg){
    a = helloMsg;
  }
  public String greet(String name){
    return(a + " " + name);
  }
}

  
 /* 
DISCOVERIES:
- early code for setHelloMsg: 

    public String setHelloMsg(String helloMsg){
      a = helloMsg;
    }
    
  -> error message: missing return statement
   -> instead of String, it has to be void, because in this method you are not returning anything.

UNANSWERED QS:
-
 */
