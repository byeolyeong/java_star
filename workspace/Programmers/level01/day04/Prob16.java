package level01.day04;

public class Prob16 {
    // 프로그래머스 기초 Day4 - n의 배수
    public int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    void main(){
        System.out.println(solution(98,2));
        System.out.println(solution(34,3));
    }
}

