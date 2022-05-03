import java.util.*;
class Expression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float b = sc.nextFloat();
    float a = sc.nextFloat();
    float c = sc.nextFloat();
    
    float statement = b*b - 4*(a*c);
    System.out.println(statement);
  }
}