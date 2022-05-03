//importing the Scanner Class
import java.io.*;
//Vote class
class VoteDemo {
  //main method
  public static void main(String[] args) throws IOException {
    //Associating the Buffered Reader Class
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //initializing the variable age
    int age = Integer.parseInt(br.readLine());
    //checking whether the person is eligible or not
    if(age <= 0) System.out.println("Age of a person shouldn't be negative");
    else if(age >= 18) System.out.println("The person is eligible to vote");
    else if(age < 18) System.out.println("The person is minor");
    else System.out.println("Enter the valid age");
  }
}