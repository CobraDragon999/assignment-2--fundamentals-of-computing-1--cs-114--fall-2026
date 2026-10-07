import java.util.Scanner;
public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input character string");
    String input = scan.nextLine();
    int acount = 0;
    int ecount = 0;
    int icount = 0;
    int ocount = 0;
    int ucount = 0;
    int nonvowelcount = 0;
    for (int characterplace = 0; characterplace < input.length(); characterplace++){
      char character = input.charAt(characterplace);
      if (character == 'a' || character == 'A') {
        acount++;
      }
      else if (character == 'e' || character == 'E') {
        ecount++;
      }
      else if (character == 'i' || character == 'I') {
        icount++;
      }
      else if (character == 'o' || character == 'O') {
        ocount++;
      }
      else if (character == 'u' || character == 'U') {
        ucount++;
      }
      else {
        nonvowelcount++;
      }
    }
    System.out.println("Your string contained " + acount + " A or a's, " + ecount + " E or e's, " + icount + " I or i's, " + ocount + " O or o's, " + ucount + " U or u's, and " + nonvowelcount + " non-vowels.");
  }
}