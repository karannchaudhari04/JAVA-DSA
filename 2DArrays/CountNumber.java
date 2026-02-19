public class CountNumber {
    public static void countNumber(int[][] matrix, int key) {
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
          int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,7,11,12},
            {13,14,7,16}
        };
        int key = 7;
        countNumber(matrix, key);
    }
}
