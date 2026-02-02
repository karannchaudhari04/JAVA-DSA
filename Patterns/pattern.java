package Patterns;

public class pattern {

    public static void halfPyramid(int n){
        for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void inverted_Half_Pyramid(int n){
        //outer loop - rows
        for(int i=1; i<=n; i++){
        //inner loop - columns
            //for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
       }
    }
    public static void main(String[] args) {
    //    halfPyramid(5);
       inverted_Half_Pyramid(5);
    }
}
