public class NumberPattern {
  public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(j + " "); // Print column number
          }
          System.out.println();
      }
  }
}
