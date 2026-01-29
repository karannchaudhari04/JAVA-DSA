public class bionomial {
    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int binCoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binom = fact_n / (fact_r * fact_nmr);
        System.out.println("Binomial Coefficient(" + n + ", " + r + ") is: " + binom);
        return binom;
    }
    public static void main(String[] args) {
        binCoefficient(5, 2); //function call
    }
}
