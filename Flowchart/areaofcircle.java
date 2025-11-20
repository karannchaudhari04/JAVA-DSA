package Flowchart;
import java.util.*;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}
