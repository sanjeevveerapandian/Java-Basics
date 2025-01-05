public class InvertedTriangle {
  public static void main(String[] args) {
      for (int i = 5; i >= 1; i--) { // Start from 5 rows and decrease
          for (int j = 1; j <= i; j++) { // Columns depend on the row
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}
