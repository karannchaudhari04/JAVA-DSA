import java.util.*;

public class sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int val = 1;

        while (val <= num) {
            sum = sum + val;
            val = val + 1;
        }
        System.out.println("The sum of numbers from 1 to " + num + " is: " + sum);
    }
}
