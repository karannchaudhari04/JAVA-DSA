package Basics;
import java.util.*;;
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
    public static int count1(int n){
        int count = (int)(Math.log10(n) + 1);
        System.out.println("Total count = "+count);
        return count;
    }
    
    public static void main(String[] args) {
        count(456450);
        count1(9465);
    }
}
