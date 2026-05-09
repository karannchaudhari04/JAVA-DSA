package Patterns;

public class Pattern9 {
    public static void ninethPattern1(int n){
        for(int i=1; i<=n; i++){
            for(int  j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int  j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void ninethPattern2(int n){
        for(int i=1; i<=n; i++){
            for(int  j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int  j=1; j<=2*n-(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ninethPattern1(5);
        ninethPattern2(5);
    }
}
