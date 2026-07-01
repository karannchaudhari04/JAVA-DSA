import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = arr.length;

        for(int i=0; i<n; i++){
            System.out.println("Provide input for index: "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Array cantains: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
