/*
TNPG: doubleN - Nicole Zhou + Duck, Nada Hameed + Ray
APCS
HW 34 - A Pirate's Life for Me --> Arrays
2021-11-15
time spent: 1.5 hrs

DISCO:
- Recursive is actually more complicated in this situation
  =>  you have to make sure that, when calling the function again, it matches the necessary arguments
    - (in this case, it would have to be an array and the target int)

QCC:
- Tried doing recursive but the other way around (start from anArray.length, then stop when it reaches 0)
  => there was a StackOverflow error (kept on going and going and going...)

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
