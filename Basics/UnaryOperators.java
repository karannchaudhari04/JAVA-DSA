package Basics;

public class UnaryOperators {
    public static void main(String[] args) {
        //Pre Increment
        System.out.println("Pre Increment");
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //Post Increment
        System.out.println("Post Increment");
        int m = 10;
        int n = m++;
        System.out.println(m);;
        System.out.println(n);

        System.out.println("Pre Decrement");
        //Pre Decrement
        int p = 10;
        int q = --p;
        System.out.println(p);
        System.out.println(q);

        System.out.println("Post Decrement");
        //Post Decrement
        int x = 10;
        int y = x--;
        System.out.println(x);
        System.out.println(y);
    }
}
