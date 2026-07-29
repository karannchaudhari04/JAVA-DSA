public class ReversArray {

    //Two Pointer Approach
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

    //Single index approach
    public static void reverse(int i, int[] arr, int n){
        if(i >= n/2){
            return;
        }
        //swap
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(i+1, arr, n);        
    }
    public static void main(String[] args) {
        int arr[] = {2,8,3,5,7,1};

        //Two Pointer Approach
        int n = arr.length-1;
        revArray(0, n, arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        //Single Index Approach
        reverse(0, arr, arr.length);
        for(int nums : arr){
            System.out.print(nums+" ");
        }
    }
}
