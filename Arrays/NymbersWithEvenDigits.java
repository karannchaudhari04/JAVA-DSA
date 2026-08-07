public class NymbersWithEvenDigits{
    public static int evenDigits(int nums[]){
        int total = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int count = 0;
            while(n>0){
                n = n/10;
                count++;
            }
            if(count %2 == 0){
                total ++;
            }
        }
        return total;
    }
    public static void main(String args[]){
        int nums[] = {12, 345, 22, 64, 7896};
        System.out.println(evenDigits(nums));
    }
}