public class MaxElementOfArray {
    public static void main(String[] args) {
        int arr[] = {-100,-200,-50,-30,-40};
        int n = arr.length;
        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
