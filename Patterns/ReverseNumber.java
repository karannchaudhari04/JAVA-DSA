package Patterns;

public class ReverseNumber {
    public static void rNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rNumber(5);
    }
}
