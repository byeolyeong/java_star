package level02.day03;

import java.util.Arrays;

public class Prob12 {
    // 프로그래머스 입문 Day3 - 짝수는 싫어요
    public int[] solution(int n) {

        int[] answer = new int[(n + 1) / 2];

        int index = 0;

        for(int i=0; i<=n; i++) {
           if(i % 2 != 0){
               answer[index] = i;
               index++;
           }
        }
        return answer;
    }


     void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}

