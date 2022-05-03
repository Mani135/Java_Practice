import java.util.Scanner;
class WeekDays {
  //Main method
  public static void main(String[] args0) {
    //Scanner class
    Scanner sc = new Scanner(System.in);
    //declaring ang initializing the variable
    int num = sc.nextInt();
    //using switch case
    switch(num) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thuraday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Enter the valid input");
    }
//using Else If Ladder
    if(num == 1) {
      System.out.println("Monday");
    }
    else if(num == 2) {
      System.out.println("Tuesday");
    }
    else if(num == 3) {
      System.out.println("Wednesday");
    }
    else if(num == 4) {
      System.out.println("Thursday");
    }
    else if(num == 5) {
      System.out.println("Friday");
    }
    else if(num == 6) {
      System.out.println("Saturday");
    }
    else if(num == 7) {
      System.out.println("Sunday");
    }
    else {
      System.out.println("Enter the valid input");
    }
  }
}