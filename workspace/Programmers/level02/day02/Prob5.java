package level02.day02;

public class Prob5 {
    // 프로그래머스 입문 Day2 - 두 수의 나눗셈
    public int solution(int num1, int num2) {
        int answer = num1 * 1000 / num2;
        return answer;
    }

    void main(){
        System.out.println(solution(3, 2));
    }
}
