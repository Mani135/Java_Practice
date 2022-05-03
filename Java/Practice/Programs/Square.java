import java.util.Scanner;
class Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    a = a*a + b*b;
    System.out.println(a);
  }
}