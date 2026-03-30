package Basics;

public class sumoffirstnumbers {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.print(sum);
    }
}
