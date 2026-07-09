package Basics;

public class PalindromeNum {
    public static boolean palindrome(int num){
        int original = num;
        int reverse = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        if(original == reverse){
            System.out.println(original+" is a palindrome number");
            return true;
        }
        else{
            System.out.println(original+" is not a palindrome number");
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 54345;
        boolean ans = palindrome(num);
        System.out.println(ans);
    }
}
