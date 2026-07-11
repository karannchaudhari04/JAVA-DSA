package Basics;

public class PerfectNumber{
    public static boolean isPerfectNum(int num){
        int sum = 1;
        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
            return true;
        }
        else{
            System.out.println("not a perfect number");
            return false;
        }
    }
    public static void main(String args[]){
        int num = 28;
        isPerfectNum(num);
    }
}