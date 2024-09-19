package chap01.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a값: ");
        int a = Integer.parseInt(br.readLine());
        int b;

        do {
            System.out.print("b값: ");
            b = Integer.parseInt(br.readLine());

            if (a >= b) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }

        } while (b <= a);

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }
}
