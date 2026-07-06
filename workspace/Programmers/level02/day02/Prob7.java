package level02.day02;

public class Prob7 {
    // // 프로그래머스 입문 Day2 - 분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        int g = gcd(numer, denom);
        int[] answer = new int[] { numer / g, denom / g };
        return answer;

    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
