public class MaxFrom2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                        {10,20},
                        {30},
                        {40,500,60,70},
                        {80,90,100}
                    };
        int max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
