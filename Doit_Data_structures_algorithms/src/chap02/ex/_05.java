package chap02.ex;

import java.util.Arrays;

public class _05 {

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int b[] = new int[x.length];
        rCopy(x, b);
    }

    static void rCopy(int[] a, int[] b) {
        int n = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[n--];
        }
        System.out.println(Arrays.toString(b));
    }
}
