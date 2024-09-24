package chap02;

import java.util.Scanner;

// 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력
public class CardConv {

    // 정숫값 x를 r진수 로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변환하는 정수
        int no;
        // 기수
        int cd;
        // 변환 후의 자릿수
        int dno;
        // 다시 한번?
        int retry;
        // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);

            System.out.print("입니다.");
            System.out.print("한 번 더 할까요? (1. 예 / 0. 아니요): ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
