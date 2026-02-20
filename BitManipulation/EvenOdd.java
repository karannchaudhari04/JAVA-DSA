package BitManipulation;

public class EvenOdd {
    public static void evenOdd(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n+" is Even Number");
        }
        else{
            System.out.println(n+" is Odd Number");
        }
    }
    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(14);
        evenOdd(7);
    }   
}