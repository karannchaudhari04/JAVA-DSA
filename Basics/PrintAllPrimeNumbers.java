package Basics;

public class PrintAllPrimeNumbers {
    public static boolean isPrimeNum(int num){
        if(num < 2) return false;

        for(int i=2; i*i<=num; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void printAllPrime(int n){
        for(int num=2; num<=n; num++){
            boolean isPrime = isPrimeNum(num);
            if(isPrime == true){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        int n = 100;
        printAllPrime(n);
    }
}
