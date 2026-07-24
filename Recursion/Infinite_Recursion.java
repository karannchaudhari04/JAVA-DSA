public class Infinite_Recursion {
    public static void a(){
        System.out.println(1);
        a();
    }
    public static void main(String[] args) {
        a();
    }
}
