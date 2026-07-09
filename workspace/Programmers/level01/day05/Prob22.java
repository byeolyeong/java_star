package level01.day05;

public class Prob22 {
    // 프로그래머스 기초 Day5 - 등차수열의 특정한 항만 더하기
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i = 0; i < included.length; i++){
            int current = a + (d * i);  // 등차수열 생성
            if(included[i]){    // 현재 항을 더해야하는지 검사
                answer += current;  // 값이 true면 answer에 누적 시켜줌
            }
        }
        return answer;
    }

    void main() {
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(3, 4, included));

    }
}
