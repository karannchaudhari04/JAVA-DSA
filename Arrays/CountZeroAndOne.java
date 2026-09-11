public class CountZeroAndOne {
    public static int[] count(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount ++;
            }
            else{
                oneCount ++;
            }
        }
        int ansArray[] = {zeroCount, oneCount};
        return ansArray;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,0,1,0,1,0,0};
        int ans[] = count(arr);
        System.out.println("Zero count: "+ans[0]);
        System.out.println("One count: "+ans[1]);
    }
}
