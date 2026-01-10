package Basics;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum =  a + b + c;
        double average = sum/3;
        System.out.println("Average Of Three Number is: "+average);
    }
}
