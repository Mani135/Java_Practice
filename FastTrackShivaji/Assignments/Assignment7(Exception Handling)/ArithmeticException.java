/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
//importing scanner class
import java.util.Scanner;
//class Arithematic exception
public class ArithmeticException {
    //static division method
    static void division(int a, int b) {
      //try block
      try {
        a /= b;
        //printing the division of two numbers
        System.out.println(a);
      }
        //if the variable "a" is divided by zero the exception might occur
      catch(Exception e) {
        //printing the exception that has been occured
        System.out.println(e);
      }
    }
  //main mthod
  public static void main(String[] args) {
    //prompting user for input
    Scanner sc = new Scanner(System.in);
    //initializing the variables
    int a = sc.nextInt();
    int b = sc.nextInt();   
    //calling the division method
    ArithmeticException.division(a,b);
    //closing the scanner class
    sc.close();
  }
}