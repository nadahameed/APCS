/*

Team NBJ - Nada Hameed, Brian Kang, Jun Hong Wang
APCS
HW31 - Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay - Pig Latin
2021-10-04
time spent: 1 hr 15 mins

DISCO:
 - for hasA, indexOf does not work because it doesn't account for multiple occurences of a letter
  --> which you need if you want to call hasA in countVowels


QCC:
 - this is a nice combination of what we've learned the past few days
 - I'd like to get more familiar with the first initialization (not at all comfortable using it)
  --> it's immensely helpful, but I wouldn't have done it w/o the skeleton

*/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    =====================================*/
  public static boolean hasA( String w, String letter ) {

    for (int counter = 0; counter < w.length(); counter++) {
      if (w.substring(counter, counter + 1).equals(letter)){
        return true;
      }
    }

    return false;
//this also works, but not if you call hasA in countVowels:
    //return (w.indexOf(letter, 0) > 0);

  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    =====================================*/
  public static boolean isAVowel( String letter ) {
    return hasA(VOWELS, letter);
    //return (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u");

  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    =====================================*/
   public static int countVowels( String w ) {
    /* YOUR IMPLEMENTATION HERE */
    int numVowels = 0;
    for (int counter = 0; counter < w.length(); counter ++) {
      if (hasA(VOWELS, w.substring(counter, counter + 1)) == true) {
        numVowels += 1;
      }
    }
    return numVowels;
  }




  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    if (countVowels(w) > 0) {
      return true;
    } else {
      return false;
    }
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    =====================================*/
  public static String allVowels( String w )
  {
    String output = "";
    for (int counter = 0; counter < w.length(); counter++ ) {
      if (hasA(VOWELS, w.substring(counter, counter + 1)) == true) {
        output += w.substring(counter, counter + 1);
      }
    }
    return output;
  }


  public static void main( String[] args )
  {
    //TEST CALLS
    System.out.println("hasA ==> " + hasA("hahahahahahaawhahaha", "w"));
    System.out.println("isAVowel ==> " + isAVowel("t"));
    System.out.println("countVowels ==> " + countVowels ("meatball"));
    System.out.println("hasAVowel ==> " + hasAVowel("sqrrl"));
    System.out.println("allVowels ==> " + allVowels("he said while gritting his teeth"));
  }//end main()

}//end class Pig
