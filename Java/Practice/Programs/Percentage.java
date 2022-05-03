import java.util.Scanner;
class Percentage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float math = sc.nextFloat();
    float eng = sc.nextFloat();
    float sci = sc.nextFloat();
    float soc = sc.nextFloat();
    float tel = sc.nextFloat();

    float total = math + eng + sci + soc + tel;

    float percentage = (total*100)/500;

    System.out.println(percentage);
  }
 }