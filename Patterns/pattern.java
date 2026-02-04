package Patterns;

public class pattern {

    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
       System.out.println();
    }
    public static void main(String[] args) {
        halfPyramid(5);
    }
}
