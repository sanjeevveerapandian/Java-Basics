public class PyramidPattern {
  public static void main(String[] args) {
      int n = 5; // Number of rows
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) { // Print spaces
              System.out.print("  ");
          }
          for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}
