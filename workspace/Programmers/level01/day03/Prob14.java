package level01.day03;

public class Prob14 {
    // 프로그래머스 기초 Day3 - 14 더 크게 합치기 ( 풀이 실패 )
    public int solution(int a, int b) {

        int num1 = Integer.parseInt("" + a + b);
        int num2 = Integer.parseInt("" + b + a);
        int answer = Math.max(num1, num2);
        return answer;
    }

    void main(){
        System.out.println(solution(9, 91));
    }
}