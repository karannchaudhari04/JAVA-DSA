package Flowchart;
import java.util.*;

public class primeornotprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        

        int div = 2;
        while(div < num){
            if(num % div == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
            div=div + 1;
        }
        System.out.println(num + " is a prime number.");
    }   
}