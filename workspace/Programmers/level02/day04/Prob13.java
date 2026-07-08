package level02.day04;

import java.util.Arrays;

public class Prob13 {
    // 프로그래머스 입문 Day4 - 피자 나눠 먹기 1
    public int solution(int n) {
        int answer = 0;
        return n % 7 == 0 ? (n / 7) : (n / 7) +1;
    }


    void main() {
        System.out.println((solution(7)));
        System.out.println((solution(1)));
        System.out.println((solution(15)));
    }
}
