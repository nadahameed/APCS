public class BunnyEarsTwo{
  public int bunnyEarsTwo(int bunnies){
    if (bunnies == 0){
      return 0;
    }
    if (bunnies % 2 == 1){
      return 2 + bunnyEarsTwo(bunnies-1);
    }
    return 3 + bunnyEarsTwo(bunnies - 1);
  }

  public static void main (String[] args){
    BunnyEarsTwo b = new BunnyEarsTwo();
    System.out.println(b.bunnyEarsTwo(0)); //0
    System.out.println(b.bunnyEarsTwo(1)); //2
    System.out.println(b.bunnyEarsTwo(2)); //5
    System.out.println(b.bunnyEarsTwo(3)); //7
  }
}
