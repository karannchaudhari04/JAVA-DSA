import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("Enter 5 array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
