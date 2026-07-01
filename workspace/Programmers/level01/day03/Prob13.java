package level01.day03;

public class Prob13 {
    // 프로그래머스 기초 Day3 - 13 문자열 곱하기
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {   // for을 돌릴때 i가 k만큼 돌게끔 하고
            answer += my_string;    // answer에 my_string을 반복문 돌때 하나씩 누적
        }
        return answer;
    }


    void main(String[] args) {
        System.out.println (solution("string", 3));
        System.out.println (solution("love", 10));
    }
}