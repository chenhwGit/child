package cn.tedu;


public class Demo2 {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 4, 3, 5, 5, 6, 6, 7, 7};

        int v = 0;

        for (int i = 0; i < array.length; i++) {

            v ^= array[i];
            System.out.println(v);

        }

        System.out.println("不相同的那个数是：" + v);

    }
}
