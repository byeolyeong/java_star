package level02.day03;

import java.util.Arrays;

public class Prob10 {
    // 프로그래머스 입문 Day3 - 중앙값 구하기
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 정렬
        return array[array.length / 2]; // 배열 길이 / 2
    }

    void main(){
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution(array));
    }
}

