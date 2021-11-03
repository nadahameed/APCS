/*
Team NBJ - Nada Hameed, Brian Kang, Jun Hong Wang
APCS
HW 29 - Which Way Do You Roll?
11/03/2021
time: ~1 hour

DISCO:
- there has to be something that deals with when i is < 1000 for recursion
--> for the iterative way, it may have been more efficient to have if i < 1000 ... similar to what is done for recursion

QCC:
- is there a way to use less variables? (are all of the variables in this code necessary?)

*/

public class Commafier{
//iterative commafier
  public static String commafyI (Integer i){
    String str = i.toString();
    String output = "";
    int counter = 0;
    for(int c = str.length() - 1; c >= 0; c-- ){
      counter++;
      String sub = str.substring(c, c + 1);
      if (counter % 3 == 0 && counter != str.length()) {
        output = ("," + sub + output);
      } else {
        output = sub + output;
      }
    }
    return output;
  }

  public static String commafyR (Integer i){
//recursive commafier
    String str = i.toString();

    if (i < 1000) {
      return (str);
    }

    int sub = Integer.parseInt(str.substring(0, str.length() - 3));

    return (commafyR(sub) + "," + str.substring(str.length() - 3));
  }

  public static void main(String[] args){

    for(String input : args) {
      Integer number = Integer.parseInt(input);
      System.out.println(commafyI(number));
      System.out.println(commafyR(number));
    }

    /*
    System.out.println(commafyI(1234));
    System.out.println(commafyI(1));
    System.out.println(commafyI(1234567));
    System.out.println(commafyI(123456));

    System.out.println(commafyR(123456));
    System.out.println(commafyR(123));
    System.out.println(commafyR(1234567890));
    */
  }
}
