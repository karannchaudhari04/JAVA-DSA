package Basics;

public class PrintDigits {
    public static void main(String[] args) {
        int number = 546849;

        while(number != 0){
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
    }
}
