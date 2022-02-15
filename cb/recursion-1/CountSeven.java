public class CountSeven{
  public int count7(int n){
    if (n == 0){
      return 0;
    }
    if (n % 10 == 7){
      return 1 + count7(n/10);
    }
    return count7(n/10);
  }

  public static void main(String[] args){
    CountSeven c = new CountSeven();
    System.out.println(c.count7(717));
    System.out.println(c.count7(7));
    System.out.println(c.count7(123));
  }
}
