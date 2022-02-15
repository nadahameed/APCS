public class CountX{
  public int countX(String str){
    if(str.length() == 0){
      return 0;
    }
    if(str.substring(0,1).equals("x")){
      return 1 + countX(str.substring(1));
    }
    return countX(str.substring(1));
  }

  public static void main(String[] args){
    CountX x = new CountX();
    System.out.println(x.countX("xxhixx"));
    System.out.println(x.countX("xhixhix"));
    System.out.println(x.countX("hi"));
  }
}
