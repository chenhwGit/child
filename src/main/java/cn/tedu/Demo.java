package cn.tedu;


/**
 * 1 1 2 3 5 8 13.
 */
public class Demo {

    public static int num(final int n) {
        if (n < 1) {
            return -1;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return num(n - 1) + num(n - 2);
        }
    }

    public static void main(final String[] args) {
        int  n = num(6);
        System.out.println(n);
    }
}
