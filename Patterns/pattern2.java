package Patterns;

public class pattern2 {
    public static void secondPattern(int n){
        for(int i=1; i<=n; i++){
            for(int  j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        secondPattern(5);
    }
}
