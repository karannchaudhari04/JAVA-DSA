package Patterns;

public class Pattern10 {
    public static void tenthPattern(int n){
        for(int i=1; i<=2*n-1; i++){
            for(int  j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        tenthPattern(5);
    }
}
