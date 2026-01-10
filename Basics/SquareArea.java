package Basics;
import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        double area = side * side;

        System.out.println("Area of the square = " + area);
    }
}
