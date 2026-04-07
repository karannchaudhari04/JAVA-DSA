public class homework {
    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("The average is: " + avg);
    }
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;      
            n /= 10;
        }
        if(original == rev){
            System.out.println(original+" is a palindrome.");
        } else {
            System.out.println(original+" is not a palindrome.");
        }
    }

    public static void computeSum(int n){
        int num = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Addition of digit in "+num+" is: "+sum);
    }
    public static void main(String[] args) {
        average(10, 20, 30);
        System.out.println(isEven(1110));
        isPalindrome(121);
        computeSum(123456789);
    }
}
