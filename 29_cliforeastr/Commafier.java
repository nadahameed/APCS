/*
Team NBJ - Nada Hameed, Brian Kang, Jun Hong Wang
APCS
HW 29 - Which Way Do You Roll?
11/03/2021

DISCO:
- there has to be something that deals with when i is < 1000

QCC:
- is there a way to use less variables?

*/

public class Commafier{

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

    String str = i.toString();

    if (i < 1000) {
      return (str);
    }

    int sub = Integer.parseInt(str.substring(0, str.length() - 3));

    return (commafyR(sub) + "," + str.substring(str.length() - 3));

  }

/*
    String str = i.toString();
    int counter = 0;
    String output = "";
    if (counter < str.length()) {
      counter++;
      String sub =
      if (counter % 3 == 0) {
        output =  "," + sub + output;
      }
    }
  }
*/
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
