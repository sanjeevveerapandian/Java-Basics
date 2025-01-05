import java.util.Scanner;

public class NoOfNotes {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount:");
    int amount = scanner.nextInt();
    int temp_amount = amount;

    int noOf500Notes = 0, noOf200Notes = 0, noOf100Notes = 0;

    if (temp_amount >= 500) {
      noOf500Notes = temp_amount / 500;
      temp_amount %= 500; // Update temp_amount
    }

    if (temp_amount >= 200) {
      noOf200Notes = temp_amount / 200;
      temp_amount %= 200; // Update temp_amount
    }

    if (temp_amount >= 100) {
      noOf100Notes = temp_amount / 100;
      temp_amount %= 100; // Update temp_amount
    }

    // Output the results
    System.out.println("Number of 500 notes: " + noOf500Notes);
    System.out.println("Number of 200 notes: " + noOf200Notes);
    System.out.println("Number of 100 notes: " + noOf100Notes);
    System.out.println("Remaining amount: " + temp_amount);

    scanner.close(); // Close the scanner to avoid resource leaks
  }
}
