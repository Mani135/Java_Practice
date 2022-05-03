import java.util.Scanner;
class Even {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2 != 0) {
      System.out.println("The number is Odd");
    }
    else if(num == 0) {
      System.out.println("The nmber is Zero");
    }
    else System.out.println("The nmber is Odd");
  }
}