public class factorial {
    public static int calculateFactorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial); 
        return factorial;
    }
    public static void main(String[] args) {
        calculateFactorial(7); //function call
    }
}
