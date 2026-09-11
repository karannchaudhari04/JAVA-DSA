public class ElementSearch{
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 50;
        System.out.println("Key found at index: "+linearSearch(arr, key));
    }
}