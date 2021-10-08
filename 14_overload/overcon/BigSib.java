public class BigSib {
  String helloMsg;
  public BigSib(String a){
    helloMsg = a;
  }
  public String greet(String name){
    return(helloMsg + " " + name);
  }
