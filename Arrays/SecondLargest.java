public class SecondLargest{
    public static int secondLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int nums[] = {2,4,1,5,3,8,6};
        System.out.println(secondLargest(nums));
    }
}