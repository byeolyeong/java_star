package level01.day04;

public class Prob19 {
    // 프로그래머스 기초 Day4 - 조건 문자열
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                if (n >= m) return 1;
                return 0;
            } else {
                if (n > m) return 1;
                return 0;
            }
        } else {
            if (eq.equals("=")) {
                if (n <= m) return 1;
                return 0;
            } else {
                if (n < m) return 1;
                return 0;
            }
        }
    }

    void main() {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}
