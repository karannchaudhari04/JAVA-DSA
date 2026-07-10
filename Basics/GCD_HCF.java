package Basics;

public class GCD_HCF {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        System.out.println(ans);
    }
}
