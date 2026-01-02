package Basics;
import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        System.out.println(input);

        String name = sc.nextLine();
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float value = sc.nextFloat();
        System.out.println(value);

        double num = sc.nextDouble();
        System.out.println(num);

        byte b = sc.nextByte();
        System.out.println(b);

        boolean var = sc.nextBoolean();
        System.out.println(var);
    }
}
