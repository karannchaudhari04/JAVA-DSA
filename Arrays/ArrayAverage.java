public class ArrayAverage{
    public static double average(int arr[]){
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        int size = arr.length;
        double average = sum / size;
        return average;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        System.out.println(average(arr));
    }
}