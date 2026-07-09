package Basics;

public class PrimeNumber{
    public static void main(String[] args) {
        int num = 17;

        if(num <=1){
            System.out.println(num+" is not a prime number");
        }

        if(num %2 == 0){
            System.out.println(num+" is not a prime number");
        }
        else{
            System.out.println(num+" is a prime number");
        }
      }
}