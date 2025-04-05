

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter two integers:");

        if (sc.hasNextInt() && sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum is: " + sum);
        } else {
            System.out.println("Invalid input! Please enter integers.");
        }

        sc.close();
    }
}
