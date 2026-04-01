public class LargestNumber {
    public static int largest_Number(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value in an Array is: "+smallest);
        return largest;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        int largest = largest_Number(numbers);
        System.out.println("Largest value in an Array is: "+largest);
    }
}
