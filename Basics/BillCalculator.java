package Basics;
import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        float gst = total * 0.18f;
        float finalBill = total + gst;

        System.out.println("Total cost (without GST) = " + total);
        System.out.println("GST (18%) = " + gst);
        System.out.println("Final bill amount = " + finalBill);
    }
}
