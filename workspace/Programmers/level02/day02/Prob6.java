package level02.day02;

public class Prob6 {
    // 프로그래머스 입문 Day2 - 숫자 비교하기
    public int solution(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;
        return answer;
    }

    void main(){
        System.out.println(solution(2, 3));
        System.out.println(solution(11, 11));
        System.out.println(solution(7, 99));
    }
}
