import java.util.Scanner;
class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int area = l*b;
    int perimeter = 2*l + 2*b;

    System.out.println(area+"\n"+perimeter);
  }
}