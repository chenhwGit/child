package cn.tedu;


public class Demo3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = (a + b) - (b = a);
        System.out.println(a);
        System.out.println(b);

        int c = 8;
        int d = 2;
        c = (c ^ d) ^ (d = c);
        System.out.println(c);
        System.out.println(d);

    }
}