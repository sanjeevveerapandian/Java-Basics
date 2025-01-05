/* Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
• For first 50 units Rs. 0.50/unit
• For 51 to 150 units Rs. 0.75/unit
• For 151 to 250 units Rs. 1.20/unit
• For unit above 250 Rs. 1.50/unit and an additional surcharge of 20% is added to the bill 
*/

import java.util.Scanner;

public class Electricitybill {
    
    public static double calculateBill(double units) {
        double bill = 0;

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
            bill = bill + (bill * 0.20);  // Adding 20% surcharge
        }

        return bill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of units
        System.out.print("Enter the electricity units consumed: ");
        double units = scanner.nextDouble();

        // Calculate the total bill
        double totalBill = calculateBill(units);

        // Display the result
        System.out.printf("Total electricity bill: Rs. %.2f\n", totalBill);

        scanner.close();
    }
}