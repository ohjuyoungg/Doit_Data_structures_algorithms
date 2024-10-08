package chap02;

public class PrimeNumber3 {

    public static void main(String[] args) {
        // 곱셈과 나눗셈의 횟수
        int counter = 0;
        // 찾은 소수의 개수
        int ptr = 0;
        // 소수를 저장하는 배열
        int[] prime = new int[500];

        // 2는 소수임
        prime[ptr++] = 2;
        // 3은 소수임
        prime[ptr++] = 3;

        // 조사 대상은 홀수만
        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false;

            for (int i = 0; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);


    }
}
