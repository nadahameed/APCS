public class SumDigits{
  public int sumDigits(int n){
    if (n < 10){
      return n;
    }
    return sumDigits(n / 10) + (n % 10);
  }

  public static void main(String[] args){
    SumDigits s = new SumDigits();
    System.out.println(s.sumDigits(126));
    System.out.println(s.sumDigits(49));
    System.out.println(s.sumDigits(12));
  }
}
