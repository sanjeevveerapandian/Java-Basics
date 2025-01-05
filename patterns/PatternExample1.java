public class PatternExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            for (int j = 1; j <= 5; j++) { // Inner loop for columns
                System.out.print("* "); // Print star without a newline
            }
            System.out.println(); // Move to the next row
        }
    }
}
