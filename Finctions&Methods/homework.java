public class homework {
    public static int avg(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        System.out.println("Average is: " + average);
        return average;
    }
    public static void main(String[] args) {
        avg(10, 20, 30);
    }
}
