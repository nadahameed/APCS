//Team Stack Underflow (Nada Hameed + Ray, Ariel Fuchs + Skelly duckler, Russell Goychayev + Duck)

public class ActivityFive{

  public static String wordScramble(String word){
    String shuffled = "";

    while (word.length() > 0){
      int x = (int)(Math.random() * (word.length())+1);
      //System.out.println("random: " + x);
      String a = word.substring(x-1, x);
      shuffled += a;
      //System.out.println("shuffled: " + shuffled);
      word = word.substring(0, x - 1) + word.substring(x);
      //System.out.println("word: " + word);
    }
    return shuffled;
  }

  public static double similar(String word){
    String shuffled = wordScramble(word);
    System.out.println("shuffled: " + shuffled);
    int simcntr = 0;
    for(int i = 0; i < word.length(); i++){
      if (shuffled.substring(i, i+1).equals(word.substring(i, i+1))){
        simcntr++;
        //System.out.println(simcntr);
      }
      // else{
      //   System.out.println("shuffled: " + shuffled.substring(i, i+1));
      //   System.out.println("original: " + (word.substring(i, i+1)));
      // }
    }
    double percent = (100.0*simcntr/word.length());
    return percent;
  }

  public static void main(String[] args){
    System.out.println("---------");
    System.out.println("orangutaz");
    System.out.println("how similar? " + similar("orangutaz"));
    System.out.println("---------");
    System.out.println("xxxxxxxx");
    System.out.println("how similar? " + similar("xxxxxxxx"));
    System.out.println("---------");
    System.out.println("exposition");
    System.out.println("how similar? " + similar("exposition"));
    System.out.println("---------");
    System.out.println("ululations");
    System.out.println("how similar? " + similar("ululations"));
    System.out.println("---------");
    //doesn't shuffle word by word
    System.out.println("haha that is so funny");
    System.out.println("how similar? " + similar("haha that is so funny"));
  }
}
