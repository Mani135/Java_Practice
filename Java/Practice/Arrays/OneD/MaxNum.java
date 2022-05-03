//importing scanner class
import java.util.Scanner;
//max class
class MaxNum {
  //main method
  public static void main(String[] args) {
    //Associating sanner class
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int[] arr = new int[n];
    //initializing the array
    for(i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    for(int var : arr) {
      if(var > max) {
        max = var;
      }
    }
    System.out.println(max);
  }
}