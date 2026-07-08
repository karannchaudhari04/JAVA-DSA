package Basics;

public class PrintDigits {
    public static void main(String[] args) {
        int number = 546849;
        int count = 0;
        while(number != 0){
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            count++;
            number = number / 10;
        }
        System.out.println("Total digits in a number are: "+count);
    }
}
