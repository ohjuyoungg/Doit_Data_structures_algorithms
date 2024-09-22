package chap01.ex;

public class _15 {
    static void spira(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1 - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        spira(4);
    }
}
