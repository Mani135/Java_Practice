/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

//importing the Scanner class
import java.util.Scanner;
public class NumberFormatException {
  //test method
  static void test() {
    //prompting user for input
    Scanner sc = new Scanner(System.in);
    //try block
    try {
      //declaring and initializing the variables
      String a = sc.next();
      String b = sc.next();
      //converting string to int
      int c = Integer.parseInt(a);
      int d = Integer.parseInt(b);
      //addition of two variables must be handeled due to type mismatch
      c += d;
      //printing the addition of parsed variables
      System.out.println(c);
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
  //main method
  public static void main(String args[]) {
    //calling the test method
    NumberFormatException.test();
  }
}
