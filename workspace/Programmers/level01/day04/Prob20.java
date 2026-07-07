package level01.day04;

public class Prob20 {
    // 프로그래머스 기초 Day4 - 조건 문자열
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? (a + b) : (a - b);
        return answer;
    }


    void main() {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }
}
