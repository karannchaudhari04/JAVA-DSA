public class MultiplyOfArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int multiply = 1;

        for(int i=0; i<n; i++){
            multiply = multiply * arr[i];
        }
        System.out.println(multiply);
    }
}
