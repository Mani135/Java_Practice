//importing scanner class
import java.util.*;
//even class
class Negative {
  //main method
  public static void main(String[] args) {
    //Scanner class
    Scanner sc  = new Scanner(System.in);
    //declaring the array and its  length
    int n = sc.nextInt();
    int i;
    int[] arr = new int[n];
    //initializing the array
    for(i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    for(int var : arr) {
      if(var <= 0) {
        System.out.println(var);
      }
    }
  }
}