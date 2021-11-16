/*
TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS
HW 35
2021-11-16
time spent: 15 mins

DISCO:
- we created a new array for the recursive versions, but noticed that many people used a helper function
 => it seems several people (us included) struggled with the recursive version ==> it's much more efficient to use an iterative method in this situation

QCC:
- Is it more efficient to create a new array or use a helper function?
 => perhaps it's more organized w/ a helper, but there are less steps/parts when creating a new array instead

*/

//start class Loopier
public class Loopier{

  //populate array with random numbers
  private static void populateArray(int[] anArray) {

    for (int i = 0; i < anArray.length; i++) {
      anArray[i] = (int)(Math.random()*(5));
    }
  }

  //return String version of an array of ints
  private static String stringifyArray(int[] anArray) {

    String strung = "";

    for (int i = 0; i < anArray.length; i++) {
      if (i == 0) {
        strung = strung + anArray[i];
      } else {
        strung = strung +  " - " + anArray[i];
      }
    }
    return strung;
  }

  //linear search for a target int (iterative)
  public static int linSearch(int[] anArray, int target) {

    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == (target)){
        return i;
      }
    }
    return -1;
  }

  //linear search for a target int (recursive)
  public static int linSearchR(int[] anArray, int target) {

    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == (target)) {
        return i;
      } else {
        int[] newArray;
        newArray = new int[anArray.length - 1];
        linSearchR(newArray, target);
      }
    }
    return -1;
  }

  //frequency function (iterative)
  public static int freq(int[] anArray, int target) {

    int num = 0;

    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == (target)) {
        num = num + 1;

      }
    }
    return num;
  }

  //frequency function (recursive)
  public static int freqRec(int[] anArray, int target) {

    int num = 0;

    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == (target)) {
        num += 1;
      } else {
        int[] newArray;
        newArray = new int[anArray.length - 1];
        freqRec(newArray, target);
      }
    }
    return num;
  }

  //main method
  public static void main(String[] args){

    int[] whatArray;
    whatArray = new int[10];
    populateArray(whatArray);
    System.out.println("What's in this array?   =>  " + stringifyArray(whatArray));
    System.out.println("Does it have the target?     => " + linSearch(whatArray, 4));
    System.out.println("Does it have the target (R)?    =>  " + linSearchR(whatArray, 4));
    System.out.println("How many times?    => " + freq(whatArray, 4));
    System.out.println("How many times? (R)    => " + freqRec(whatArray, 4));

  }
}
