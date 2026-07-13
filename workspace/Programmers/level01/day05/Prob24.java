package level01.day05;

public class Prob24 {
    // 프로그래머스 기초 Day5 - 원소들의 곱과 합
    public int solution(int[] num_list) {
        int answer = 0;
        int product = 1;
        int sum = 0;
        for(int num: num_list){     // int score = scores[i];
            product *= num;
            sum += num;
        }
        if(product < sum * sum){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }

    void main() {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));

        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list2));
    }
}
