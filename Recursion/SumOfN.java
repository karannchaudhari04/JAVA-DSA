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
    public static int print1(int i){
        if(i == 0){
            return 0;
        }
        return i + print1(i-1);
    }
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        print(i,sum);
        System.out.println(print1(i));
    }
}
