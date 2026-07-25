public class Print1toN{
    public static void print(int n){
        helper(1,n);
    }
    private static void helper(int current, int n){
        if(current>n){
            return;
        }
        System.out.println(current);
        helper(current+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}