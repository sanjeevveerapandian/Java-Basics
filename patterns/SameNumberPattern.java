public class SameNumberPattern {
  public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(i + " "); // Print row number
          }
          System.out.println();
      }
  }
}
