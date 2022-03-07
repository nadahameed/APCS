public class Mysterion{
  public static void main(String[] args){
    int[] array1 = new {7,1,5,12,3};
    System.out.println(mystery(array1, 0, 4, 2));
  }

  public int[] mystery(int[] arr, int a, int b, int c){
    int v = arr[c];
    swap(arr, c, b);
    int s = a;
    for (int i = a; i < b; i++){
      if (arr[i] < v){
        swap(arr, s, i);
        s++;
      }
    }
    swap(arr, b, s);
    return arr;
  }

  private void swap(int[] arr, int a, int b){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
