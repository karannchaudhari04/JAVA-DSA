public class MaxElementOfArray{
    public static int maxElement(int arr[]){
        int max  = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        System.out.println(maxElement(arr));
    }
}