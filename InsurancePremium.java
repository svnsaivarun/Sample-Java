package learn;

import java.util.Scanner;

public class InsurancePremium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of dependents
        System.out.print("Enter the number of dependents: ");
        int dependents = scanner.nextInt();
        
        double premium;
        String membershipStatus;
        
        // Calculate premium based on the number of dependents
        if (dependents == 0) {
            premium = 1000.00;
        } else if (dependents <= 2) {
            premium = 1000.00 + 750.00 * dependents;
        } else {
            premium = 1000.00 + 500.00 * (dependents - 2);
        }
        
        // Check premium and set membership status
        if (premium < 2000.00) {
            membershipStatus = "ACTIVE";
        } else {
            membershipStatus = "PENDING";
        }
        
        // Output premium and membership status
        System.out.println("Premium: Rs. " + premium);
        System.out.println("Membership Status: " + membershipStatus);
        
        // Close the scanner
        scanner.close();
    }
}
