package Basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second value: ");
        int num2 = sc.nextInt();
        System.out.print("Select Operation");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(num1 + num2);
                break;
            case '-': System.out.println(num1 - num2);    
                break;
            case '*': System.out.println(num1 * num2);    
                break;
            case '/': System.out.println(num1 / num2);    
                break;
            case '%': System.out.println(num1 % num2);    
                break;     
        
            default: System.out.println("Wrong Operator");
                break;
        }
    }
}

