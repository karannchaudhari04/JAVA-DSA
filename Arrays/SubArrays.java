public class SubArrays{
    public static void sub_Arrays(int numbers[]) {
        int ts = 0;
        //start
        for(int i=0; i<numbers.length; i++){
            //end
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                //calculate sum
                for(int k=i; k<=j; k++){
                    sum += numbers[k];
                }
                //print
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println("Sum = "+sum);
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        sub_Arrays(numbers);
    }
}