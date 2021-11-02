/*

Coding Bat
String-2
doubleChar

*/

public class DoubleChar {

  public static String doubleChar(String str) {
    String a = "";
    for (int i = 0; i < str.length(); i++) {
      String b = str.substring (i, i + 1);
      System.out.println(i + " -> " + b);
      a += b + b;
      System.out.println(" a -> " + a);
     }
     return (a);
  }

  public static void main(String[] args) {
    System.out.println(doubleChar("cat"));
  }
}
