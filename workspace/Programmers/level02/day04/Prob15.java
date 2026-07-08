package level02.day04;

public class Prob15 {
    // 프로그래머스 입문 Day4 - 피자 나눠 먹기 3
    public int solution(int slice, int n) {
        int answer = 0;
        while(n > 0){   // 못먹은 인원 n이 0명보다 많으면 반복
            answer += 1;    // answer에 1씩 누적해서 1판씩 주문했을때 카운트
            n = n - slice;  // 마지막으로 시킨 피자의 조각수 만큼 해당 인원에게 할당 시켜서 n - slice 값을 n에 다시 대입
        }
        return answer;
    }

    void main() {
        System.out.println((solution(7,10)));
        System.out.println((solution(4,12)));
    }
}
