public class ArrayAverage{
    public static int average(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        int average = sum/n;
        return average;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(average(arr));
    }
}