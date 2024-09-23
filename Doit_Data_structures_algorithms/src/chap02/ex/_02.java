package chap02.ex;

import java.util.Arrays;

public class _02 {

    public static void main(String[] args) {
        int x[] = {2, 5, 1, 3, 9, 6, 7};
        System.out.println(Arrays.toString(x));

        for (int i = 0; i < x.length / 2; i++) {
            reverse(x, i, x.length - i - 1);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void reverse(int[] x, int idx1, int idx2) {
        System.out.println("a[" + idx1 + "]과 " + "a[" + idx2 + "]을 " + "교환합니다.");
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
        System.out.println(Arrays.toString(x));
    }
}
