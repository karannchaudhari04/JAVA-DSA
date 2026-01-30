public class funOverloading{
    // Function Overloading Using Different Number of Parameters
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String argsp[]){
        System.out.println(sum(10, 10));
        System.out.println(sum(10, 10, 10));
    }
}