public class UnsortedElement {
    public static int unsortedElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,4,9,12};
        System.out.println("The unsorted element in the array is: "+unsortedElement(arr));
    }
}
