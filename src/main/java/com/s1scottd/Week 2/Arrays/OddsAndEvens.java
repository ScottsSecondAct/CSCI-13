public class OddsAndEvens {
  public static void main(String[] args) {
    int[] odds = new int[10];
    int[] evens = new int[10];
    int oddIndex = 0; int evenIndex = 0;
    for (int i = 0; i < 20; i++) {
      if (i % 2 == 0) {
        evens[evenIndex++] = i;
        //evenIndex++;
      } else {
        odds[oddIndex++] = i;
        //oddIndex++;
      }
    }

    System.out.print("Evens: ");
    for (int i = 0; i < evens.length; i++) {
      System.out.print(evens[i] + " ");
    }
    System.out.println();

    System.out.print("Odds: ");
    for (int i = 0; i < odds.length; i++) {
      System.out.print(odds[i] + " ");
    }
  }
}