import java.util.Scanner;
class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if((year % 4 == 0) && (year % 100 != 0)||(year % 400 == 0)) {
      System.out.println("The year is a Leap year");
    }
    else {
      System.out.println("The year is not a Leap year");
    }
  }
}