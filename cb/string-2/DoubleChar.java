/*

Coding Bat
String-2
doubleChar

*/

public String doubleChar(String str) {
  String a = "";
  for (int i = 0; i < str.length(); i++) {
    a += str.substring (i);
  }
  return a;
}
