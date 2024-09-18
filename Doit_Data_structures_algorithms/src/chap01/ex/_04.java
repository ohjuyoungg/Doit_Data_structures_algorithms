package chap01.ex;

public class _04 {
    public static int med4(int a, int b, int c) {
        if (a >= b) {
            if (c <= b) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a < c) {
            return c;
        } else if (b < c) {
            return a;
        }  else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(med4(1, 3, 2));
        System.out.println(med4(3, 2, 1));
        System.out.println(med4(2, 1, 3));
    }
}
