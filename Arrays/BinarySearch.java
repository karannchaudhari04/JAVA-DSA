public class BinarySearch {
    public static int binary_Srarch(int numbers[], int key){
                int start =0;
                int end = numbers.length-1;
                while (start <= end) { 
                int mid = (start + end) / 2;

                    //Comparing key with mid value
                    if(numbers[mid] == key){
                    return mid;
                    }
                    if(numbers[mid]>key){
                        end = mid - 1;
                    }
                    if(numbers[mid]<key){
                        start = mid + 1;
                    }
                }
                return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int result = binary_Srarch(numbers, key);
        System.out.println("Key is at index: " + result);
    }
}
