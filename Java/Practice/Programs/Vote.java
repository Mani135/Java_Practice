//importing the Scanner Class
import java.util.Scanner;
//Vote class
class Vote {
  //main method
  public static void main(String[] args) {
    //Associating the scanner class
    Scanner sc = new Scanner(System.in);
    //initializing the variable age
    int age = sc.nextInt();
    //checking whether the person is eligible or not
    if(age <= 0) System.out.println("Age of a person shouldn't be zero or negative");
    else if(age >= 18) System.out.println("The person is eligible to vote");
    else if(age < 18) System.out.println("The person is minor");
    else System.out.println("Enter the valid age");
  }
}