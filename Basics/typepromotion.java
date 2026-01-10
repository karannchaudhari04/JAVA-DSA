package Basics;
public class typepromotion {
    public static void main(String[] args) {
        //Tye 1
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(a+b);

        short x = 5;
        byte y = 25;
        char c = 'c';
        byte bt = (byte)(x + y + c);
        System.out.println(bt);

        byte p = 5;
        byte q = (byte)(p*2);
        System.out.println(q);


        //Type 2
        int i = 10;
        float f = 20.22f;
        long l = 15;
        double d = 25;
        double ans = i + f + l + d;
        System.out.println(ans);   
    }
}