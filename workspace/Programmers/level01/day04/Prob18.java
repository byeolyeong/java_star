package level01.day04;

public class Prob18 {
    // 프로그래머스 기초 Day4 - 홀짝에 따른 다른 값 출력
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }
        return answer;
    }

    void main(){
        System.out.println(solution(7));
        System.out.println(solution(10));
    }
}
