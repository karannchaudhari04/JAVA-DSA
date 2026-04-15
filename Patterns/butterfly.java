package Patterns;

public class butterfly {
    public static void butterfly_Pattern(int n){
        //1st - Half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces 2(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd - Half
        for(int i=n; i>=1; i--){
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces 2(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly_Pattern(5);
    }
}
