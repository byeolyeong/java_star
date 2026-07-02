package level02.day03;

import java.util.Arrays;

public class Prob11 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array); // 배열 정렬
        int max = array[array.length-1];
        int count[] = new int[max+1];   // 배열의 가장 큰 값으로 등장 횟수를 저장할 배열 생성
        for(int i=0; i<array.length; i++) {
            count[array[i]]++;
        }

        int maxCount = count[0];    // 가장 많은 횟수 저장
        for(int i=1; i<count.length; i++) { // 배열 검사
            if(maxCount < count[i]) {
                maxCount = count[i];
                answer = i;
            } else if(maxCount == count[i]) {
                answer = -1;
            }
        }
        return answer;
    }


     void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(array));
    }
}

