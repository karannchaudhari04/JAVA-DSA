import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to input: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
    }
}
