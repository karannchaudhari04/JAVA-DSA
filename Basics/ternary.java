package Basics;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String result = marks >= 35? "Pass" : "Fail";
        System.out.println(result);
    }
}
