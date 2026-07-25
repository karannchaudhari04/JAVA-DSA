public class PrintNTimes {
    static void print(int i, int n){
        if(i > n){
            return;
        }
        else{
            System.out.println("Karan");
            print(i+1,n);
        }
    }
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        print(i, n);
    }
}
