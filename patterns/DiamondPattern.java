public class DiamondPattern {
  public static void main(String[] args) {
      int n = 5; // Number of rows

      // Upper part of the diamond
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n - i; j++) { // Spaces
              System.out.print(" ");
          }
          for (int k = 1; k <= (2 * i - 1); k++) { // Stars
              System.out.print("*");
          }
          System.out.println();
      }

      // Lower part of the diamond
      for (int i = n - 1; i >= 1; i--) {
          for (int j = 1; j <= n - i; j++) { // Spaces
              System.out.print(" ");
          }
          for (int k = 1; k <= (2 * i - 1); k++) { // Stars
              System.out.print("*");
          }
          System.out.println();
      }
  }
}
