public class SumOfRow {
    public static int sumOfRow(int[][] matrix, int rowIndex){
        int sum = 0;
        
        if(rowIndex >= 0 && rowIndex < matrix.length){
            for(int j=0; j<matrix[rowIndex].length; j++){
                sum += matrix[rowIndex][j];
            }
        }
        else{
            System.out.println("Invalid Row Inex");
            return 0;
        }
         System.out.println("Sum of row " + rowIndex + ": " + sum);
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,7,11,12},
            {13,14,7,16}
        };
        int rowIndex = 2;
        sumOfRow(matrix, rowIndex);
    }
}
