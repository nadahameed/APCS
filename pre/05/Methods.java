public class Methods{

  public static boolean isDivisible(int n, int m) {

    return (n % m == 0);

  }


  public static void main(String[] args){

    int n = 8;
    int m = 2;
    System.out.println("Exercise 2: ");
    System.out.println(isDivisible(n, m));

    int a = 3;
    int b = 7;
    int c = 5;
    System.out.println("Exercise 3: ");
    System.out.println(isTriangle(a, b, c));
  }

  public static boolean isTriangle(int a, int b, int c) {

    if ((a + b) > c) {
      return true;
    } else {
      if ((b + c) > a) {
        return true;
      } else {
        return false;
      }
    }
  }
  public static int ackermannFunction(int x, int y){

  if (m == 0) {
    System.out.println(n + 1);
  } else {
    System.out.println(n)
  }
  }
}
