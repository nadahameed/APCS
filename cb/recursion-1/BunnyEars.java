
public class BunnyEars{
	public int bunnyEars(int bunnies){
		if (bunnies == 0){
			return 0;
		}
		else if(bunnies == 1){
			return 2;
		}
		return bunnyEars(bunnies) + bunnyEars(bunnies - 1);
	}
	
	public static void main(String[] args){
		BunnyEars b = new BunnyEars();
		System.out.println(b.bunnyEars(0));
		System.out.println(b.bunnyEars(1));
		System.out.println(b.bunnyEars(2));
	}
}
