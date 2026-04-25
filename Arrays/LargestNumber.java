public class LargestNumber {
    public static int largest_Number(int nums[]){
        int largest = nums[0];
        for(int i=1; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        return largest;
        
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 6, 3, 5};
        int largest = largest_Number(nums);
        System.out.println("Largest value in an Array is: "+largest);
    }
}

