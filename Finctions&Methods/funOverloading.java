public class funOverloading{
    // Function Overloading Using Different Number of Parameters
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    // Function Overloading Using Different Data Types
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }


    public static void main(String argsp[]){
        System.out.println(sum(10, 10));
        System.out.println(sum(10, 5, 5));
        System.out.println(add(10, 20));
        System.out.println(add(9.5, 20.5));
    }
}