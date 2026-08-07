public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int nums[]){
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count ++;
            }
            if(maxCount<count){
                maxCount = count;
            }
            if(nums[i] == 0){
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
