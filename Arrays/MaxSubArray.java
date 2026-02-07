public class MaxSubArray {
    public static void max_Subarray(int numbers[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(MaxSum < currSum){
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = "+MaxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        max_Subarray(numbers);
    }
}
