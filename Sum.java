import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner

        // Prompt the user for inputs
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b; // Calculate sum

        // Print the result with a descriptive message
        System.out.println("The sum is: " + sum);

        sc.close(); // Close Scanner to prevent resource leaks
    }
}
