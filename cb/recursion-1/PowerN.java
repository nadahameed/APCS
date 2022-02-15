public class PowerN{
  public int powerN(int base, int n){
    if (n == 1){
      return base;
    }
    return (base * powerN(base, n - 1));
  }

  public static void main(String[] args){
    PowerN n = new PowerN();
    System.out.println(n.powerN(3, 1));
    System.out.println(n.powerN(3, 2));
    System.out.println(n.powerN(3, 3));
  }
}
