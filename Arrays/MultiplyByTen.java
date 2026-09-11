public class MultiplyByTen {
    public static int[] multiply(int[] arr){
        int size = arr.length;
        int newArr[] = new int[size];
        for(int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArr[i] = newElement; 
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int ans[] = multiply(arr);
        System.out.println("Printing updated array");
        for(int i : ans){
            System.out.println(i);
        }
    }
}
