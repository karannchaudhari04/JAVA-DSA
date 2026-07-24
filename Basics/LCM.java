package Basics;

public class LCM {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int prod = a*b;

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        int gcd = a;
        int lcm = prod/gcd;
        System.out.println(lcm);
    }
}
