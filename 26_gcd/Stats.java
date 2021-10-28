/**
TNPG: NBJ - Nada Hameed, Brian Kang, Jun Hong Wang
APCS
HW26: GCD Three Ways
2021--10--28
time spent: 2 hrs


DISCO:
- flow charts are helpful, but they don't necessarily contribute to the syntax errors (which are very time-consuming)

QCC:
- negative numbers aren't accounted for
 --> perhaps it'd be double the code except replacing (a > 0) && (b > 0) with <'s (and then other small things)
**/

public class Stats {

  public static int gcdER (int a, int b) {
   int c = 1;
   if ((a > 0) && (b > 0)) {
    if (a == b) {
      c = a;
    } else {
       if (a > b) {
        if (a % b == 0) {
          c = b;
        } else {
           gcdER (a, (b - 1));
        }
        if (b % a == 0) {
          c = a;
        } else {
           gcdER ((a - 1), b);
        }
      }
    }
  } else {
    c = 0;
  }
    return c;
  }

  public static void main (String[] args) {
    int a = 12;
    int b = 6;
    System.out.println(gcdER(a, b));
  }
}


//public static int gcdEW (int a, int b) {



  /*
  while (numPosts > 1) {
    output += "|--";
    numPosts -= 1;
   }
    output += "|";

    if (numPosts<= 0) {
      output= " ";
    }
return output;
*/
