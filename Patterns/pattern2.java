package Patterns;

public class pattern2 {
     public static void inverted_Half_Pyramid_Numbers(int n){
        //outer loop rows
        for(int i=1; i<=n; i++){
        //inner loop columns
            //for numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        inverted_Half_Pyramid_Numbers(5);
    }
}
