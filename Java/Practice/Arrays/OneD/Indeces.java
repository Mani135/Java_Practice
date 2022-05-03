//importing scanner class
import java.util.Scanner;
//Array class
class Indeces {
  //main method
  public static void main(String[] args) {
    //associating the scanner class
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variable n
    int n = sc.nextInt();
    int i;
    //declaring array
    int[] arr = new int[n];
    //for loop to initialize the array
    for(i = 0; i < n; i++) {
      System.out.println("enter the array index "+i);
      arr[i] = sc.nextInt();
    }
    for(i = 0; i < n; i++) {
      System.out.println("Array Element "+(i+1)+" : "+arr[i]);
    }
  }
}