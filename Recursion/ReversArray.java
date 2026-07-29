public class ReversArray {
    public static void revArray(int left, int right, int arr[]){
        if(left >= right){
            return;
        }
        //swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        revArray(left+1, right-1, arr);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,3,5,7,1};
        int n = arr.length-1;
        revArray(0, n, arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
