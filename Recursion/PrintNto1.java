public class PrintNto1 {
    public static void print(int n){
        helper(n);
    }
    private static void helper(int current){
        if(current < 1){
            return;
        }
        System.out.println(current);
        helper(current-1);
    }
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
}
