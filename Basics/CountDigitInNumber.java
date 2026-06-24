package Basics;

public class CountDigitInNumber{
    public static int count(int n) {
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n/10;
        }
        System.out.println("Total count = "+count);
        return count;
    }

    public static void main(String[] args) {
        count(456450);
    }
}