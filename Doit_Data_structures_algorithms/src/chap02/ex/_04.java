package chap02.ex;

import java.util.Arrays;

public class _04 {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5, 6};
        int b[] = new int[x.length];
        copy(x, b);
    }

    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
