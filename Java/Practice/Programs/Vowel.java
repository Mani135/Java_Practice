import java.util.Scanner;

class Vowel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char char1 = sc.next().charAt(0);
    if((char1 == 'a')||(char1 == 'e')||(char1 == 'i')||(char1 == '0')||(char1 == 'u')||(char1 == 'A')||(char1 == 'E')||(char1 == 'I')||(char1 == 'O')||(char1 == 'U')) {
      System.out.println("The character is a Vowel");
    }
    else {
      System.out.println("The character is a Consonent");
    }

    if(char1 == 'a'||char1 == 'A') {
      System.out.println("The character is a Vowel");
    }
    else if(char1 == 'e'||char1 == 'E') {
      System.out.println("The character is a Vowel");
    }
    else if(char1 == 'i'||char1 == 'I') {
      System.out.println("The character is a Vowel");
    }
    else if(char1 == 'o'||char1 == 'O') {
      System.out.println("The character is a Vowel");
    }
    else if(char1 == 'u'||char1 == 'U') {
      System.out.println("The character is a Vowel");
    }
    else {
      System.out.println("The character is a Consonent");
    }
  }
}