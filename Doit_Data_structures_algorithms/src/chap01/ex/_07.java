package chap01.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int sum = 0;

        if (n < m) {
            for (int i = n; i <= m; i++) {
                sum += i;
            }
        } else if (m < n) {
            for (int i = m; i <= n; i++) {
                sum += i;
            }
        } else {
            sum = n;
        }
        System.out.println(sum);
    }

}
