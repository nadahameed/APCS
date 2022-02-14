public class Factorial{
	public int factorial(int n) {
		if (n == 1){
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args){

		Factorial n = new Factorial();
		System.out.println(n.factorial(1));
		System.out.println(n.factorial(2));
		System.out.println(n.factorial(3));
	}
}
