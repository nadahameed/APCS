 //tryna arrange an int array in ascending order
public class AscendingOrder{

//fill the array w random numbers from 1-10
  public static void populate(int[] a){
    for(int i = 0; i < a.length - 1; i++){
      a[i] = (int)(Math.random()*10);
    }
  }

//to String method
  public static String stringy(int[] a){
    String strung = "[";

    for (int i = 0; i < a.length; i++) {
      if (i == 0) {
        strung = strung + a[i];
      } else {
        strung = strung +  ", " + a[i];
      }
    }
    return strung + "]";
  }

  //arrange elements in ascending order
  public static void ascend(int[] a){

//just a sub
    int subby = 0;

//nested for loops to compare
    for(int x = 0; x < a.length; x++){
      for(int y = x + 1; y < a.length; y++){
        if (a[x] > a[y]){
          subby = a[x];
          a[x] = a[y];
          a[y] = subby;
        }
      }
    }
  }

//main method
  public static void main(String[] args){

//create object yo of length 5, populate it, and print it
    int[] yo = new int[5];
    populate(yo);
    System.out.println("before arranging -> "+ stringy(yo));

    ascend(yo);
    System.out.println("after arranging -> " + stringy(yo));

  }
}

