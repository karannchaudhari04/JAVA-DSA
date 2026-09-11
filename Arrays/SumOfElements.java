public class SumOfElements {
    public static int[] sumOfElements(int arr[]){
        int PositiveSum = 0;
        int NegativeSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                PositiveSum += arr[i];
            }
            else{
                NegativeSum = NegativeSum + arr[i];
            }
        }
        int ansArray[] = {PositiveSum, NegativeSum};
        return ansArray;
    }
    public static void main(String[] args) {
        int arr[] = {-10, 5, 3, -8, 9, -7};
        int ans[] = sumOfElements(arr);
        System.out.println("Sum of Positive Numbers: "+ans[0]);
        System.out.println("Sum of Negative Numbers: "+ans[1]);
    }
}
