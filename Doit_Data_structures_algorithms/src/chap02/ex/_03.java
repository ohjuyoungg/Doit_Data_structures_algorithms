package chap02.ex;

public class _03 {

    public static void main(String[] args) {
        int x[] = {2, 5, 1, 3, 9, 6, 7};
        System.out.println("합계는: " + sumOf(x));
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
