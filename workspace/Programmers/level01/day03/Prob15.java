package level01.day03;

public class Prob15 {
    // 프로그래머스 기초 Day3 - 15 두 수의 연산값 비교
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ab2 = 2 * a * b;
        int answer = Math.max(ab, ab2);
        return answer;
    }

    void main() {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }
}