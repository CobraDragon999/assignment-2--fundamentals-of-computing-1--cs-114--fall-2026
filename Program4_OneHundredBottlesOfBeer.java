import java.util.Scanner;
public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    System.out.println("How many verses of the song 100 bottles of beer on the wall do you wish to be printed?");
    Scanner scan = new Scanner(System.in);
    int verses = scan.nextInt();
    while (verses < 1 || verses > 100) {
      System.out.println("That value was above 100 or below 1, and I cannot comply");
      System.out.println("Please re-enter your desired number of verses");
      verses = scan.nextInt();
    }
    int bottles = 100;
    for (int verse = 0; verse < verses; verse++){
      System.out.println(bottles + " bottles of beer on the wall");
      System.out.println(bottles + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      bottles = bottles - 1;
      System.out.println(bottles + " bottles of beer on the wall");
    }
  }
}
