package level01.day05;

public class Prob25 {
    // 프로그래머스 기초 Day5 - 이어 붙인 수
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int num : num_list){
            if(num % 2 == 0){
                even += num;
            } else {
                odd += num;
            }
        }
        int oddNum = Integer.parseInt(odd);
        int evenNum = Integer.parseInt(even);
        answer = oddNum + evenNum;
        return answer;
    }

    void main() {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));

        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list2));
    }
}
