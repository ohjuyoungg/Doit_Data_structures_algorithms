package chap01.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12 {

    public static void main(String[] args) throws IOException {
        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
