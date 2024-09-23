package chap02;

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
}
