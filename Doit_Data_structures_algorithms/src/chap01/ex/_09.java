package chap01.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _09 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;

        do {
            System.out.print("n값: ");
            n = Integer.parseInt(br.readLine());
            if (n <= 0) {
                System.out.println("양의 정수를 입력하세요.");
            }
        } while (n <= 0);

        String strN = String.valueOf(n);
        System.out.println(strN.length() + "자리 입니다.");
    }
}
