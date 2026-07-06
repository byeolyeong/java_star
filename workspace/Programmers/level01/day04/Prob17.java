package level01.day04;

public class Prob17 {
    // 프로그래머스 기초 Day4 - 공배수
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0) {
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }

    void main(){
        System.out.println(solution(60,2,3));
        System.out.println(solution(95,8,5));
    }
}
