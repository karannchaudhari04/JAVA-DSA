public class backtrack2 {
    public static void print(int n){
        helper(1,n);
    }
    
    private static void helper(int i, int n){
        if(i > n){
            return;
        }
        helper(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
