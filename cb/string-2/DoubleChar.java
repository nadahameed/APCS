/*

Coding Bat
String-2
doubleChar

*/

public class DoubleChar {
  public String doubleChar(String str) {
  String a = "";
  for (int i = 0; i < str.length(); i++) {
    a += str.substring (i, i + 1);
  }
  return a;
}
  public static void main(String[] args) {
    doubleChar("cat");
  }
}
