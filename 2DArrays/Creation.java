public class Creation {
    public static void main(String[] args) {
        int[][] arr = {
                    {1,2},
                    {2,3,5,1,3},
                    {3,4,64,1},
                    {4}
                };
                System.out.println(arr[2][2]);

                int rowLength = arr.length;

                for(int i=0; i<rowLength; i++){
                    for(int j=0; j<arr[i].length; j++){
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
    }
}
