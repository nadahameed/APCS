/**
TNPG: (Row) 2 cool 4 skool :: Ameer Alnasser, Nada Hameed, Brian Kang, Jun Hong Wang
APCS
HW25: Do I repeat myself?
2021--10--26
time spent: 2 hr


DISCO:
rediscovered how to use static methods/what they mean

QCC:
Is there a way to not need to system.out.println()?
Is there a "better" (faster) loop?
In which scenario is it better to use while vs. recursive?
**/

public class Repeater {

  public static String fenceW (int numPosts) {
    String output = "|";
    if (numPosts <= 0) {
      return " ";
    }
    else {
      if (numPosts - 1 > 0) {
        output += "--|";
        fenceW(numPosts - 1);
      }
    return output;
  }
}

  public static String fenceR (int numPosts) {
    String output = "";
      while (numPosts > 1) {
        output += "|--";
        numPosts -= 1;
       }
        output += "|";

        if (numPosts<= 0) {
          output= " ";
        }
    return output;
  }

  public static void main (String [] args){
    System.out.println(fenceW(0));
    System.out.println(fenceW(1));
    System.out.println(fenceW(2));
    System.out.println(fenceR(3));
    System.out.println(fenceR(4));
    System.out.println(fenceR(5));
  }
}
