//importing scanner class
import java.util.Scanner;
//arrayelements class
class ArrayElements {
  //main method
  public static void main(String[] args) {
    //Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variables
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] arr = new int[rows][cols];
    //initializing the 2d array
    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    //printing array elements
    System.out.println();
    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}