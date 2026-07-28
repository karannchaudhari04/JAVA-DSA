public class SumOfN {
    //Parameterized Way
    public static void print(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        print(i-1, sum+i);
    }

    //Functional Way
    
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        print(i,sum);
    }
}
