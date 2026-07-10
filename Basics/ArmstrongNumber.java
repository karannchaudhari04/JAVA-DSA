package Basics;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num){
        int original = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            int cubeOfdigit = digit*digit*digit;
            sum = sum + cubeOfdigit;
            num = num / 10;
        }
        if(sum == original){
            System.out.println("Armstrong Number");
            return true;
        }
        else{
            System.out.println("Not an rmstrong Number");
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 153;
        isArmstrongNumber(num);
    }
}
