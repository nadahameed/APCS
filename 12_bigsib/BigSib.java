
public class BigSib {
  String a;
  public String setHelloMsg(String helloMsg){
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
