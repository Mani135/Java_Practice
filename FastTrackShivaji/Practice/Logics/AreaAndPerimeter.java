import java.util.Scanner;
class AreaAndPerimeter {
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    Float lenght = sc.nextFloat();
    Float breath = sc.nextFloat();
    Float area = lenght*breath;
    Float perimeter = 2*(lenght + breath);
    System.out.println("\n"+area+"\n\n"+perimeter);
  }
}