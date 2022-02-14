public class Fibonacci{
  public int fibonacci (int n){
    if (n == 0){
      return 0;
    }
    if (n == 1){
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }

  public static void main(String[] args){
    Fibonacci x = new Fibonacci();
    System.out.println(x.fibonacci(0));
    System.out.println(x.fibonacci(1));
    System.out.println(x.fibonacci(2));
  }
}
