/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/

//importing the scanner class
import java.util.Scanner;
//ArrayIndexOutOfBoundsException class
public class ArrayIndexOutOfBoundsException {
  //main method
  public static void main(String args[]) {
    //prompting the user for input
    Scanner sc = new Scanner(System.in);
    //declaring and initializing the variable
    int n = sc.nextInt();
    //declaring the array
    int[] num = new int[n];
    //initializing the array
    for(int i = 0; i < num.length; i++) {
      num[i] = sc.nextInt();
    }
    //try block
    try {
      //printing the array elements
      for(int i = 0; i < num.length; i++) {
        System.out.println(i);
        System.out.print(num[i]+" ");
      }
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}

