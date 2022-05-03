import java.util.Scanner;
class Condition {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Simple If");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)  System.out.println("A is big");
    System.out.println("If Else");
    if(a>b) System.out.println("A is big");
    else  System.out.println("B is big");
  }
}