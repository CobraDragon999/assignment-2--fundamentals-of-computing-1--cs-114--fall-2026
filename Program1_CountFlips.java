public class Program1_CountFlips {
  public static void main(String[] args) {
    Coin coin = new Coin();
    int headcount = 0;
    int tailcount = 0;
    for (int flips = 0; flips < 100; flips++) {
      coin.flip();
      if (coin.isHeads()) {
        headcount++;
      }
      else{
        tailcount++;
      }
    }
    System.out.println("Out of 100 flips, " + headcount + " were heads and " + tailcount + " were tails.");
  }
}