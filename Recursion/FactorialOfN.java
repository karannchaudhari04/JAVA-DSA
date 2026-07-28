public class FactorialOfN {
    //Functional Way
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    //Parametarized Way
    public static void fact1(int n, int fac){
        if(n<1){
            System.out.println(fac);
            return;
        }
        fact1(n-1, fac * n);
    }
    public static void main(String[] args) {
        int n = 4;
        int fac = 1;
        fact1(n, fac);
        System.out.println(fact(n));
    }
}
