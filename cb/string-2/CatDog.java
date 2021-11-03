/*

Coding Bat
String-2
catDog

*/

public class CatDog {

  public static boolean catDog(String str) {

    int countCat = 0;
    int countDog = 0;

    for (int i = 0; i < str.length() - 2; i++) {
      String text = str.substring(i, i + 3);

      if (text.equals("cat")){
        countCat++;
      }
      if (text.equals("dog")){
        countDog++;
      }

    }
    return (countCat == countDog);
  }

  public static void main(String[] args) {
    System.out.println(catDog("catcatdogdogcat"));
  }

}
