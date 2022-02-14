
public class BunnyEars{
	public int bunnyEars(int bunnies){
		if (bunnies == 1){
			return 2;
		}
		if(bunnies == 0){
			return 0;
		}
		return 2 + bunnyEars(bunnies - 1);
	}

	public static void main(String[] args){
		BunnyEars b = new BunnyEars();
		System.out.println(b.bunnyEars(0));
		System.out.println(b.bunnyEars(1));
		System.out.println(b.bunnyEars(2));
	}
}
