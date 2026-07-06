package level02.day01;

public class Prob02 {
    public int solution(int num1, int num2) {
        // 프로그래머스 입문 Day1 - 두 수의 차 구하기
        int answer = num1 - num2;
        return answer;
    }

    void main(){
        System.out.println(solution(10, 20));
    }
}
